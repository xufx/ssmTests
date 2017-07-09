package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
/**ModelMap作为数据的存储对象
 * Created by xufuxiu on 2017/7/9.
 */
@Controller
public class User2Controller
{
    private static final Log logger= LogFactory.getLog(User2Controller.class);
    /*@ModelAttribute修饰的方法会先于login调用，该方法用于接收前台jsp页面传入的参数*/
    @ModelAttribute
    public void userMode2(String loginname,String password,ModelMap modelMap)
    {
        logger.info("userModel2");
        /*创建User对象存储前台jsp页面传入的参数*/
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        /*将User对象传入ModelMap中*/
        modelMap.addAttribute("user",user);
    }
    @RequestMapping(value = "/login2")
    public String login1(ModelMap modelMap)
    {
        logger.info("login1");
        /*从ModelMap中取出之前存入的名为user的对象*/
        User user=(User)modelMap.get("user");
        System.out.println(user);
        user.setUsername("测试");
        return "result2";

    }

}
/**/