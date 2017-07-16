package org.fkit.mapper;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface UserMapper
{
    @Select("select * from tb_user where id=#{id}")
    User selectUserById(Integer id);
}
