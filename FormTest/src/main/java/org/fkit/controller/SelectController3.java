package org.fkit.controller;
import org.fkit.domain.Dept;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
/**测试Springmvc的表单标签：select
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
public class SelectController3
{//输入http://localhost:8080/selectForm3进行测试
    @RequestMapping(value="/selectForm3",method= RequestMethod.GET)
    public String selectForm3(Model model)
    {
        User user=new User();
        user.setDeptId(2);
        //模拟从数据库获取到部门信息并将其封装到对象当中
        List<Dept>deptList=new ArrayList<Dept>();
        deptList.add(new Dept(1,"财务部"));
        deptList.add(new Dept(2,"开发部"));
        deptList.add(new Dept(3,"销售部"));
        model.addAttribute("user",user);
        model.addAttribute("deptList",deptList);
        return "selectForm3";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/