package org.fkit.mapper;
import org.apache.ibatis.annotations.*;
import org.fkit.domain.Employee;

import java.util.List;
import java.util.Map;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface EmployeeMapper
{
    @SelectProvider(type=EmployeeDynaSqlProvider.class,method="selectWhitParam2")
    List<Employee>selectWhitParam(Map<String,Object> param);

    @InsertProvider(type = EmployeeDynaSqlProvider.class,method = "insertEmployee2")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insertEmployee(Employee employee);

    @SelectProvider(type = EmployeeDynaSqlProvider.class,method = "selectWhitParam2")
    Employee selectEmployeeWithId(Map<String,Object> param);

    @UpdateProvider(type = EmployeeDynaSqlProvider.class,method = "updateEmployee2")
    void updateEmployee(Employee employee);

    @DeleteProvider(type= EmployeeDynaSqlProvider.class,method ="deleteEmployee2")
    void deleteEmployee(Map<String,Object> param);
}
/*
* type:类
* method：类的方法*/
