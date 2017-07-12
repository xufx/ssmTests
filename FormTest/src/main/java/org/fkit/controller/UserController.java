package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class UserController
{//输入http://localhost:8080/registerForm进行测试
    @RequestMapping(value="/registerForm",method= RequestMethod.GET)
    public String registerForm(Model model)
    {
        User user=new User("jack","男",28);
        //model.addAttribute("command",user);
        model.addAttribute("user",user);
        //return "registerForm";
        return "registerForm2";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/