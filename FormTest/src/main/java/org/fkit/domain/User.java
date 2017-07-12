package org.fkit.domain;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/11.
 */
public class User
{
    private String username;
    private String sex;
    private Integer age;

    private boolean reader;
    private List<String> courses;

    private Integer deptId;//部门编号
    public User()
    {
        super();
    }
    public User(String username, String sex, Integer age)
    {
        super();
        this.username = username;
        this.sex = sex;
        this.age = age;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
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

    public boolean isReader()
    {
        return reader;
    }
    public List<String> getCourses()
    {
        return courses;
    }
    public void setReader(boolean reader)
    {
        this.reader = reader;
    }
    public void setCourses(List<String> courses)
    {
        this.courses = courses;
    }
    public Integer getDeptId()
    {
        return deptId;
    }
    public void setDeptId(Integer deptId)
    {
        this.deptId = deptId;
    }
}
