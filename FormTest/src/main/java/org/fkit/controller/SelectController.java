package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**测试Springmvc的表单标签：select
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class SelectController
{//输入http://localhost:8080/selectForm进行测试
    @RequestMapping(value="/selectForm",method= RequestMethod.GET)
    public String selectForm(Model model)
    {
        User user=new User();
        user.setDeptId(2);
        model.addAttribute("user",user);
        return "selectForm";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/