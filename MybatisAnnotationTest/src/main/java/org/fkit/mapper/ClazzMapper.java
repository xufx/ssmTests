package org.fkit.mapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Clazz;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public interface ClazzMapper
{
    @Select("select * from tb_clazz where id=#{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "code",property = "code"),
            @Result(column = "id", property="students",many = @Many
                    (
                            select = "org.fkit.mapper.StudentMapper.selectStudentByClazzId",
                            fetchType = FetchType.EAGER
                    ))
    })
    Clazz selectClazzById(Integer id);
}
