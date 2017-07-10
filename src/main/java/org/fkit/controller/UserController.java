package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
/** @RequestMapping和@RequestParam测试
 * Created by xufuxiu on 2017/7/9.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController
{
    /*静态的userList代替数据库用来保存注册的用户信息*/
    private static List<User>userList;
    public UserController()
    {
        super();
        userList=new ArrayList<User>();
    }
    private static final Log logger= LogFactory.getLog(UserController.class);
    /*映射请求：http://localhost:8080/user/register*/
    @RequestMapping(value = "/register",method= RequestMethod.GET)
    public String registerForm()
    {/*该方法映射的请求为：*/
       logger.info("register Get 方法被调用。。。");
        return "registerForm";
    }
    /*映射请求：http://localhost:8080/user/register*/
    @RequestMapping(value = "/register",method=RequestMethod.POST)
    /*将指定的请求参数赋给方法中的形参。将请求中的loginname、password、username分别赋值给。。。*/
    public String register
            (
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password,
            @RequestParam("username")String username )
    {
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        //模拟数据库存储User信息
        userList.add(user);
        return "loginForm";
    }
    /*映射请求：http://localhost:8080/user/login*/
    @RequestMapping(value = "/login")
    public String login (
              @RequestParam("loginname")String loginname,
              @RequestParam("password")String password,
              Model model )
    {
        logger.info("登录名："+loginname+"密码："+password);
        for (User user:userList)
        {
            if (user.getLoginname().equals(loginname)&&user.getPassword().equals(password))
            {
                model.addAttribute("user",user);//将数据添加到request中
                return "welcome";//登录成功返回welcome.jsp
            }
        }
        return "loginForm";//登录失败返回loginForm.jsp
    }

}
/*请求:http://localhost:8080/context/login?loginname=jack&password=123456
* 将j请求中的jack赋给变量loginname,将123456赋给变量password*/