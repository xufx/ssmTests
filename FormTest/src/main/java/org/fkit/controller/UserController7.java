package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
/**测试Springmvc的表单标签：radiobuttons
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class UserController7
{//输入http://localhost:8080/radiobuttonsForm进行测试
    @RequestMapping(value="/radiobuttonsForm",method= RequestMethod.GET)
    public String radiobuttonsForm(Model model)
    {
        User user=new User();
        user.setSex("男");

        List<String>sexList=new ArrayList<String>();
        sexList.add("男");
        sexList.add("女");
        model.addAttribute("user",user);
        model.addAttribute("sexList",sexList);
        return "radiobuttonsForm";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/