package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
/**
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class UserController4
{//输入http://localhost:8080/checkboxesForm2进行测试
    @RequestMapping(value="/checkboxesForm2",method= RequestMethod.GET)
    public String registerForm2(Model model)
    {
        User user=new User();
        user.setReader(true);
        List<String>list=new ArrayList<String>();
        list.add("1");
        list.add("3");
        user.setCourses(list);

        //页面展示可供选择的复选框内容courseMap
        Map<String,String>courseMap=new HashMap<String, String>();
        courseMap.put("1","JAVAEE");
        courseMap.put("2","Mybatis");
        courseMap.put("3","Spring");
        model.addAttribute("user",user);
        model.addAttribute("courseMap",courseMap);
        return "checkboxesForm2";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/