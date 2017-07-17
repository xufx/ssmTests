package org.fkit.service;
import org.fkit.domain.User;
/**
 * Created by xufuxiu on 2017/7/17.
 */
public interface UserService
{
    /*判断用户登录*/
    User login(String loginname, String password);
}
