package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by xufuxiu on 2017/7/10.
 */
@Controller
public class FormController
{
    @RequestMapping(value="/{formName}")//模板变量
    public String loginForm(@PathVariable String formName)
    {
        return formName;
    }
}
