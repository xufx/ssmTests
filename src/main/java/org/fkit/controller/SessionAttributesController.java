package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
@SessionAttributes("user")//将Model中属性名为user的属性放入HttpSession对象当中
//@SessionAttributes(types={User.class},value="user")
//@SessionAttributes(types={User.class,Dept.class},value={"user","dept"})
public class SessionAttributesController
{
     private static final Log logger= LogFactory.getLog(SessionAttributesController.class);
   /* @RequestMapping(value="/{forName}")
    public String loginForm(@PathVariable String formName)
    {
        return formName;
    }*/

    /*输入 http://localhost:8080/loginForm2.jsp进行测试*/
    @RequestMapping(value="/session",method=RequestMethod.POST)
    public String login(
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password,
            Model model
    )
    {
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");
        model.addAttribute("user",user);
        return "welcome";
    }
}
