package org.fkit.domain;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/12.
 */
public class Employee
{
    private List<Dept> depts;//员工所属部门的全部列表
    public List<Dept> getDepts()
    {
        return depts;
    }
    public void setDepts(List<Dept> depts)
    {
        this.depts = depts;
    }
}
