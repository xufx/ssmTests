package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by xufuxiu on 2017/7/17.
 */
@Controller
public class FormController
{/*输入：http://localhost:8080/loginForm进行测试*/
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName)
    {
        return formName;
    }
}
