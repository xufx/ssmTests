package org.fkit.mapper;
import org.apache.ibatis.annotations.*;
import org.fkit.domain.Student;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public interface StudentMapper
{
    /*根据班级id查询学生信息*/
    @Select("select * from tb_student where clazz_id=#{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "age",property = "age"),
    })
    List<Student> selectStudentByClazzId(Integer clazz_id);
}
