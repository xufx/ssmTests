package org.fkit.controller;
import org.fkit.domain.User;
import org.fkit.validator.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
/**
 * Created by xufuxiu on 2017/7/12.
 */
@Controller
public class ErrorsController
{
    @RequestMapping(value="/errorsForm",method = RequestMethod.GET)
    public String errorsForm(Model model)
    {System.out.println("errorsForm() being used");
        User user=new User();

        model.addAttribute("user",user);
        return "errorsForm";
    }
    @InitBinder//绑定验证对象
    public void initBinder(DataBinder binder)
    {
        binder.setValidator(new UserValidator());
    }
    @RequestMapping(value="/hasError",method = RequestMethod.POST)
    public String hasError(
            @Validated User user,
            Errors errors
    )
    {System.out.println("hasError() being used");
        //如果Errors对象有Field错误，重新跳回注册页面，否则正常提交
        if (errors.hasFieldErrors())return "errorsForm";
        return "submit";
    }
}
