package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
/**测试Springmvc的表单标签：radiobuttons
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class UserController8
{//输入http://localhost:8080/radiobuttonsForm2进行测试
    @RequestMapping(value="/radiobuttonsForm2",method= RequestMethod.GET)
    public String radiobuttonsForm(Model model)
    {
        User user=new User();
        user.setSex("1");//设置sex变量的值为“1”，页面的radio单选框的value=男会被选中

        Map<Integer,String>sexMap=new HashMap<Integer, String>();
        sexMap.put(1,"男");
        sexMap.put(2,"女");
        model.addAttribute("user",user);
        model.addAttribute("sexMap",sexMap);
        return "radiobuttonsForm2";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/