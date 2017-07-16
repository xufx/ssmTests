package org.fkit.mapper;
import org.fkit.domain.Employee;

import java.util.HashMap;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface EmployeeMapper
{
    List<Employee> selectEmployeeByIdLike(HashMap<String,Object> params);
    List<Employee> selectEmployeeByLoginLike(HashMap<String,Object> params);
    List<Employee> selectEmployeeChoose(HashMap<String,Object> params);
    /*将查询条件都设为动态的*/
    List<Employee> selectEmployeeByIdLike2(HashMap<String,Object> params);
    List<Employee> employeeLike(HashMap<String,Object> params);

    Employee selectEmployeeWithId(Integer id);
    void updateEmployeeIfNecessary(Employee employee);

    /*根据传入的id集合查询员工*/
    List<Employee> selectEmployeeIn(List<Integer> ids);
    /*根据传入的参数进行模糊查询*/
    List<Employee> selectEmployeeLikeName(Employee employee);
}
