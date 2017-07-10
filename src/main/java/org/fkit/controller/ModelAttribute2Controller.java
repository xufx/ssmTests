package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**输入http://localhost:8080/modelAttributes.jsp点击第二行进行测试
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class ModelAttribute2Controller
{
    /*用于接收前台jsp页面传入的参数，使用模型存储数据
    userModel2方法会在logins2方法之前被调用

    */
    @ModelAttribute
    public void userModel2(//前一个参数表示jsp页面中的name,后一个表示方法的变量名
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password,
            Model model
    )
    {
        //前一个参数表示key,后一个表示value，value的值通过@RequestParam获得
        model.addAttribute("loginname",loginname);
        model.addAttribute("password",password);
    }
    //浏览器输入http://localhost:8080/modelAttributes.jsp进行测试
    @RequestMapping(value="/logins2")
    public String logins2()
    {
        return "result2";
    }
}
