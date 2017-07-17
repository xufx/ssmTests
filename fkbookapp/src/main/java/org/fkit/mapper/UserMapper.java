package org.fkit.mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;
/**
 * Created by xufuxiu on 2017/7/17.
 */
public interface UserMapper
{
    /*@Param：将前端jsp页面获得的参数name=loginname的值传递给变量loginname*/
    @Select("select * from tb_user where loginname=#{loginname} and password=#{password}")
    User findWithLoginnameAndPassword(@Param("loginname")String loginname,
                                      @Param("password")String password);

}
