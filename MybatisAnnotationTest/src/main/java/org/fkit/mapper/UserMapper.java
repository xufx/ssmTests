package org.fkit.mapper;
import org.apache.ibatis.annotations.*;
import org.fkit.domain.User;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public interface UserMapper
{
    @Insert("INSERT INTO TB_USER(name,sex,age) VALUES(#{name},#{sex},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int saveUser(User user);

    @Delete("DELETE FROM TB_USER WHERE id=#{id}")
    int removeUser(@Param("id") Integer id);

    @Update("UPDATE TB_USER SET name=#{name},sex=#{sex},age=#{age} where id=#{id}")
    void modifyUser(User user);

    @Select("SELECT * FROM TB_USER WHERE id=#{id}")
    @Results({//若dao类的属性名称和表的名称一样就不用写
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "age",property = "age")
    })
    User selectUserById(Integer id);

    @Select("SELECT*FROM TB_USER")
    List<User> selectAllUser();

    @Select("select * from tb_user where id=#{id}")
    User selectUserById2(Integer id);//测试多对多的
}
/*useGeneratedKeys = true：使用数据库自动增长策略
keyProperty="id":表示将插入数据的主键设置到user对象的id之中，即调用user.setId(id)*/