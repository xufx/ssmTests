package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**输入http://localhost:8080/modelAttributes.jsp点击第三行进行测试
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class ModelAttribute5Controller
{
    @ModelAttribute(value="user")//model(key=user,value=User)
    public User userModel5(  //此方法在logins5（）方法之前被调用
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password
    )
    {
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        return user;//返回model对象key为user的
    }
    @RequestMapping("/logins5")
    public String logins5(//参数user的值就是userModel5方法中的model属性
            @ModelAttribute("user") User user
    )
    {
       user.setUsername("管理员");
        return "result4";
    }
}
/* logins4方法的返回值不是一个视图名，而是model属性admin的值，视图名称是@RequestMapping中的logins4
*  @ModelAttribute指定视图的名称为username
* model(key="username",value=“admin”) */