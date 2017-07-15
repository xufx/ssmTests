package org.fkit.domain;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public class Clazz
{
    private Integer id;
    private String code;
    private List<Student> students;//一个班级对应多个学生
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public List<Student> getStudents()
    {
        return students;
    }
    public void setStudents(List<Student> students)
    {
        this.students = students;
    }
    @Override
    public String toString()
    {
        return "Clazz{id="+id+",code="+code+",students="+students+"}";
    }
}
