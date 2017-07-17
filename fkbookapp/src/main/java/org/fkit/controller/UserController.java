package org.fkit.controller;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
/**
 * Created by xufuxiu on 2017/7/17.
 */
@Controller
public class UserController
{
    /*自动注入UserService*/
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value="/login")
    public ModelAndView login(//请求处理方法
            String loginname,
            String password,
            ModelAndView mv,
            HttpSession session
    )
    {
        User user=userService.login(loginname,password);
        if(user!=null)
        {//登录成功
            session.setAttribute("user",user);
            mv.setView(new RedirectView("/main"));//请求转发到BookController的main方法
        }else
        {//登陆失败
            mv.addObject("message","登录名或密码错误，请重新输入");
            mv.setViewName("loginForm");
        }
        return mv;
    }
}
