package org.fkit.validator;
import org.fkit.domain.User;
import org.springframework.validation.*;
/**
 * Created by xufuxiu on 2017/7/12.
 */
public class UserValidator implements Validator
{
    public boolean supports(Class<?> clazz)
    {
        return User.class.equals(clazz);
    }
    public void validate(Object object, Errors errors)
    {
        //验证username、sex和age是否为null
        ValidationUtils.rejectIfEmpty(errors,"username",null,"用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors,"sex",null,"性别不能为空");
        ValidationUtils.rejectIfEmpty(errors,"age",null,"年龄不能为空");
    }
}
