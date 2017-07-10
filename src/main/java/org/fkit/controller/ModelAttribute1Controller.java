package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**输入http://localhost:8080/modelAttributes.jsp点击第一行进行测试
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class ModelAttribute1Controller
{
    //用于接收前台jsp页面传入的参数，使用模型存储数据
    @ModelAttribute("loginname")//loginname：model属性的名称
    public String userModel1(//将请求参数loginname的值赋给变量loginname
            @RequestParam("loginname")String loginname
    )
    {
        return loginname;//model的值
    }
    //浏览器输入http://localhost:8080/modelAttributes.jsp进行测试
    @RequestMapping(value="/logins1")
    public String logins1()
    {
        return "result1";
    }
}
