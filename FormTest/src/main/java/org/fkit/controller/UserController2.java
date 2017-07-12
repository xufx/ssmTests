package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class UserController2
{//输入http://localhost:8080/checkboxForm进行测试
    @RequestMapping(value="/checkboxForm",method= RequestMethod.GET)
    public String registerForm(Model model)
    {
        User user=new User();
        user.setReader(true);
        List<String>list=new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        user.setCourses(list);
        model.addAttribute("user",user);
        return "checkboxForm";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/