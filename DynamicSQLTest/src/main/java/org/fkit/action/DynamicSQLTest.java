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
public class DynamicSQLTest
{
     public static void main(String[] args)throws  Exception
      {
          InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
          SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession session=sqlSessionFactory.openSession();
          DynamicSQLTest dt=new DynamicSQLTest();
          //dt.select1(session);
          //dt.select2(session);
          //dt.select3(session);
          //dt.select4(session);
          //dt.select5(session);
          //dt.select6(session);
          //dt.select7(session);
          dt.select8(session);
          session.commit();
          session.close();
      }
      public void select1(SqlSession session)
      {
          EmployeeMapper em=session.getMapper(EmployeeMapper.class);
          HashMap<String,Object> params=new HashMap<String, Object>();//存储参数
          params.put("id",2);
          List<Employee> list=em.selectEmployeeByIdLike(params);
          for(Employee employee:list)
          {
              System.out.println(employee);
          }
          //list.forEach(employee -> System.out.println(employee));
      }
    public void select2(SqlSession session)
    {
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
        HashMap<String,Object> params=new HashMap<String, Object>();//存储参数
        params.put("loginname","jack");
        params.put("password","123456");
        List<Employee> list=em.selectEmployeeByLoginLike(params);
        list.forEach(employee -> System.out.println(employee));
    }
    public void select3(SqlSession session)
    {/*若params为空，根据state和sex=“男”进行查找*/
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
        HashMap<String,Object> params=new HashMap<String, Object>();//存储参数
        //params.put("id","2");
        //params.put("loginname","jack");
        //params.put("password","123456");
        List<Employee>list=em.selectEmployeeChoose(params);
        list.forEach(employee -> System.out.println(employee));
    }
    public void select4(SqlSession session)
    {
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
        HashMap<String,Object> params=new HashMap<String, Object>();//存储参数
        params.put("state","ACTIVE");
        params.put("id","2");
        List<Employee>list=em.selectEmployeeByIdLike2(params);
        list.forEach(employee -> System.out.println(employee));
    }
    public void select5(SqlSession session)
    {
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
        HashMap<String,Object> params=new HashMap<String, Object>();//存储参数
        params.put("state","ACTIVE");
        params.put("id","2");
        params.put("loginname","jack");
        params.put("password","123456");
        List<Employee>list=em.employeeLike(params);
        list.forEach(employee -> System.out.println(employee));
    }

    /*更改*/
    public void select6(SqlSession session)
    {
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
        Employee employee=em.selectEmployeeWithId(2);
        System.out.println("before update :"+employee);
        employee.setLoginname("mary");
        employee.setPassword("6666666");
        em.updateEmployeeIfNecessary(employee);
        System.out.println("after update "+employee);
    }
    public void select7(SqlSession session)
    {
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
       List<Integer> ids=new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Employee> list=em.selectEmployeeIn(ids);
        list.forEach(employee -> System.out.println(employee));
    }
    public void select8(SqlSession session)
    {//未调通
        EmployeeMapper em=session.getMapper(EmployeeMapper.class);
       Employee employee=new Employee();
        employee.setName("o");//返回loginname包含字母“o”的Employee对象
        List<Employee>list=em.selectEmployeeLikeName(employee);
        //System.out.println(list);
        list.forEach(employee1 -> System.out.println(employee));
    }
}
