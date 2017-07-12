package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**测试Springmvc的表单标签：radiobutton
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class UserController6
{//输入http://localhost:8080/radiobuttonForm进行测试
    @RequestMapping(value="/radiobuttonForm",method= RequestMethod.GET)
    public String radiobuttonForm(Model model)
    {
        User user=new User();
        user.setSex("男");
        model.addAttribute("user",user);
        return "radiobuttonForm";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/