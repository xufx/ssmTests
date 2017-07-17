package org.fkit.action;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.fkit.domain.Employee;
import org.fkit.mapper.EmployeeMapper;

import java.io.InputStream;
import java.util.*;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public class DynamicSQLTestA
{
     public static void main(String[] args)throws  Exception
      {
          InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
          SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession session=sqlSessionFactory.openSession();
          DynamicSQLTestA dt=new DynamicSQLTestA();
          EmployeeMapper em=session.getMapper(EmployeeMapper.class);

          //dt.testSelectWhitParam(em);
          //dt.testInsertEmployee(em);
          //dt.testUpdateEmployee(em);
          dt.testDeleteEmployee(em);
          session.commit();
          session.close();
      }
    public void testSelectWhitParam(EmployeeMapper em)
    {//根据动态参数查询员工数据
        Map<String,Object>param=new HashMap<String,Object>();
        param.put("loginname","jack");
        param.put("password","123456");
        List<Employee> list=em.selectWhitParam(param);
        System.out.println(list);
    }

    public void testInsertEmployee(EmployeeMapper em)
    {
        Employee e=new Employee();
        e.setLoginname("marry");
        e.setPassword("123456");
        e.setSex("女");
        e.setAge(20);
        e.setPhone("13902019999");
        e.setSal(9000.99);
        em.insertEmployee(e);
        System.out.println(e);
    }
    public void testUpdateEmployee(EmployeeMapper em)
    {
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("id",3);
        Employee e=em.selectEmployeeWithId(param);
        System.out.println("update before:"+e);
        e.setLoginname("tom");
        e.setPassword("333333");
        e.setSex("男");
        em.updateEmployee(e);
        System.out.println("update after:"+e);
    }
    public void testDeleteEmployee(EmployeeMapper em)
    {
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("id",3);
        Employee e=em.selectEmployeeWithId(param);
        System.out.println("Object to be delete:"+e);
        em.deleteEmployee(param);
    }
}
