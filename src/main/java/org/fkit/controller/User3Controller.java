package org.fkit.controller;
import org.fkit.domain.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**ModelAndView作为数据的存储对象
 * Created by xufuxiu on 2017/7/9.
 */
@Controller
public class User3Controller
{
    private static final Log logger= LogFactory.getLog(User3Controller.class);
    @ModelAttribute
    public void userModel3(String loginname, String password, ModelAndView mv)
    {
        logger.info("UserModel3");
        User user=new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        mv.addObject("user",user);
    }
    @RequestMapping(value = "/login3")
    public ModelAndView login3(ModelAndView mv)
    {
        logger.info("userModel3");
        User user=(User)mv.getModel().get("user");
        System.out.println(user);
        user.setUsername("测试");
        mv.setViewName("result3");
        return mv;
    }

}
