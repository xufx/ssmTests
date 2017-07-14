package org.fkit.domain;
import java.io.Serializable;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public class Student implements Serializable
{
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Clazz clazz;
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public Clazz getClazz()
    {
        return clazz;
    }
    public void setClazz(Clazz clazz)
    {
        this.clazz = clazz;
    }
    @Override
    public String toString()
    {
        return "id="+id+",name="+name+",sex="+sex+",age="+age+clazz;
    }
}
