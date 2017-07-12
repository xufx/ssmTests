package org.fkit.controller;
import org.fkit.domain.Dept;
import org.fkit.domain.Employee;
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
public class UserController5
{//输入http://localhost:8080/checkboxesForm2进行测试
    @RequestMapping(value="/checkboxesForm3",method= RequestMethod.GET)
    public String registerForm3(Model model)
    {
        Employee employee=new Employee();
        Dept dept=new Dept(1,"开发部");

        List<Dept>list=new ArrayList<Dept>();
        list.add(dept);
        employee.setDepts(list);

        //页面展示可供选择的复选框内容deptList
        List<Dept>deptList=new ArrayList<Dept>();
        deptList.add(dept);
        deptList.add(new Dept(2,"销售部"));
        deptList.add(new Dept(3,"财务部"));
        model.addAttribute("employee",employee);System.out.println("model:"+model.toString());
        model.addAttribute("deptList",deptList);System.out.println("model:"+model.toString());

        return "checkboxesForm3";
    }
}
/*model中存在一个属性名称为command的javaBean，值是user，该javaBean拥有属性username、sex和age*/