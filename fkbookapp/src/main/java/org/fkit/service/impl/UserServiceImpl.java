package org.fkit.service.impl;
import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by xufuxiu on 2017/7/17.
 */
@Service("userService")/*将当前类注释为spring的bean，id=userService*/
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String loginname, String password)
    {
        return userMapper.findWithLoginnameAndPassword(loginname,password);
    }
}
