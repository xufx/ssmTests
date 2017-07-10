package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
/**输入http://localhost:8080/modelAttributes.jsp点击第三行进行测试
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class ModelAttribute4Controller
{
    @RequestMapping(value="/logins4")
    @ModelAttribute(value="username")
    public String logins4()
    {
        return "admin";
    }
}
/* logins4方法的返回值不是一个视图名，而是model属性admin的值，视图名称是@RequestMapping中的logins4
*  @ModelAttribute指定视图的名称为username
* model(key="username",value=“admin”) */