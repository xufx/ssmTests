package org.fkit.controller;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
/**输入http://localhost:8080/modelAttributes.jsp点击第三行进行测试
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class ModelAttribute3Controller
{
    private static List<User>userList;//存储User对象的容器
    public ModelAttribute3Controller()
    {
        super();
        userList=new ArrayList<User>();
        User user1=new User("test","123456","测试用户");
        User user2=new User("admin","123456","管理员");
        userList.add(user1);
        userList.add(user2);
    }
    /*如果find中的参数等于容器中任何一个对象的域，返回这个对象*/
    public User find(String loginname,String password)
    {
        for (User user:userList)
        {
            if (user.getLoginname().equals(loginname)&&user.getPassword().equals(password))
            {System.out.println("用户验证成功");
                return user;
            }
        }
        System.out.println("用户名或密码不对");
        return null;
    }

    @ModelAttribute
    public User userModel3(//获得前端jsp页面传入的值
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password
    )
    {
        return find(loginname,password);//返回User对象
    }
    //浏览器输入http://localhost:8080/modelAttributes.jsp进行测试
    @RequestMapping(value="/logins3")
    public String logins3()
    {
        return "result3";
    }
}
