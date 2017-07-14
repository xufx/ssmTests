package org.fkit.mapper;
import org.fkit.domain.Student;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public interface StudentMapper
{
    Student selectStudentById(Integer id);
}
