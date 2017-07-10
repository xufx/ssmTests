package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class DataBindingController
{//输入http://localhost:8080/dataBindingTest.jsp进行测试
 private static final Log logger= LogFactory.getLog(DataBindingController.class);
    @RequestMapping(value="/pathVariableTest/{userId}")
    public void pathVariableTest(@PathVariable Integer userId)
    {
        System.out.println("通过@PathVariable获得数据："+userId);
        logger.info("通过@PathVariable获得数据："+userId);
    }
    @RequestMapping(value="/requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent")String userAgent,
            @RequestHeader(value="Accept")String[] accepts
    )
    {
        System.out.println("通过@requestHeaderTest获得数据："+userAgent);
        logger.info("通过@requestHeaderTest获得数据："+userAgent);
        for (String accept:accepts)
        {
            System.out.println("accept:"+accept);
            logger.info(accept);
        }
    }
    @RequestMapping(value="/cookieValueTest")
    public void cookieValue(@CookieValue(value="JSESSIONID",defaultValue="")String sessionId)
    {
        System.out.println("通过@requestHeaderTest获得数据："+sessionId);
        logger.info("通过@requestHeaderTest获得数据："+sessionId);
    }

}
