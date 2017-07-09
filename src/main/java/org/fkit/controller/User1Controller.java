package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
/**Model作为数据的存储对象
 * Created by xufuxiu on 2017/7/9.
 */
@Controller
public class User1Controller
{
    private static final Log logger= LogFactory.getLog(User1Controller.class);
    /*@ModelAttribute修饰的方法会先于login调用，该方法用于接收前台jsp页面传入的参数*/
    @ModelAttribute
    public void userMode1(String loginname,String password,Model model)
    {
        logger.info("userModel1");
        /*创建User对象存储前台jsp页面传入的参数*/
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        /*将User对象传入Model中*/
        model.addAttribute("user",user);
    }
    @RequestMapping(value = "/login1")
    public String login1(Model model)
    {
        logger.info("login1");
         /*从Model中取出之前存入的名为user的对象*/
        User user=(User)model.asMap().get("user");
        System.out.println(user);
        user.setUsername("测试");
        return "result1";

    }

}
/**/