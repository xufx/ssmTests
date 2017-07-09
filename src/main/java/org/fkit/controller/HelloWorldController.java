package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by xufuxiu on 2017/7/7.
 */
@Controller
public class HelloWorldController
{
    private static final Log logger= LogFactory.getLog(User1Controller.class);
   @RequestMapping(value = "/helloWorld")
    public String helloWorld(Model model)
   {
       System.out.println("helloWorld");
       model.addAttribute("message","Hello World");
       return "helloWorld";
   }
}
/*helloWorldController是以个基于@Controller注解的控制器
* @RequestMapping用来映射一个请求，value="helloWorld"表示请求由helloWorld方法进行处理，“message”对象可以在返回视图中通过request对象获取，最后方法返回一个视图名称为“helloWorld”*/