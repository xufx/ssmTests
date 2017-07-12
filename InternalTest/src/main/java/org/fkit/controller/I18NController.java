package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
/**
 * Created by xufuxiu on 2017/7/12.
 */
@Controller
public class I18NController
{
    @RequestMapping(value="/{formName}")
    public String loginForm(
            @PathVariable String formName,
            Model model
    )
    {
        User user=new User();
        model.addAttribute("user",user);
        return formName;//动态跳转页面
    }

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(
            @ModelAttribute @Validated User user,
            Model model,
            HttpServletRequest request
    )
    {//如果登录名是fkit，密码是123456，则验证通过
       if (user.getLoginname()!=null&&user.getLoginname().equals("fkit")
               &&user.getPassword()!=null&&user.getPassword().equals("123456"))
       {//从后台代码获取国际化信息username
           RequestContext requestContext=new RequestContext(request);
           String username=requestContext.getMessage("username");
           //将获取的username信息设置到User对象，并设置到Model中
           user.setUsername(username);
           model.addAttribute("user",user);
           return "success";
       }
       return "error";
    }
}
