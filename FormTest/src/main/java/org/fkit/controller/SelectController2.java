package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;
/**测试Springmvc的表单标签：select
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class SelectController2
{//输入http://localhost:8080/selectForm2进行测试
    @RequestMapping(value="/selectForm2",method= RequestMethod.GET)
    public String selectForm2(Model model)
    {
        User user=new User();
        user.setDeptId(2);

        Map<Integer,String>deptMap=new HashMap<Integer, String>();
        deptMap.put(1,"财务部");
        deptMap.put(2,"开发部");
        deptMap.put(3,"销售部");
        model.addAttribute("user",user);
        model.addAttribute("deptMap",deptMap);
        return "selectForm2";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/