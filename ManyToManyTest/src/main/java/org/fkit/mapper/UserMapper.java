package org.fkit.mapper;
import org.fkit.domain.User;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface UserMapper
{
    User selectUserById(Integer id);
}
