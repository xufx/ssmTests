package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.UserMapper;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public class BasicTest
{
      public static void main(String[] args)throws  Exception
       {
           SqlSession session= FKSqlSessionFactory.getSqlSession();
            BasicTest t=new BasicTest();
           //t.testInsertUser(session);
           //t.testSelectUser(session);
           //t.testSelectAllUser(session);
           //t.testUpdateUser(session);
           t.testDeleteUser(session);
           session.commit();
           session.close();
       }
       public void testInsertUser(SqlSession session)
       {
           UserMapper um=session.getMapper(UserMapper.class);
           User user=new User();//要插入的对象
           user.setName("test");
           user.setSex("男");
           user.setAge(18);
           um.saveUser(user);//插入数据
           System.out.println(user);
       }
    public void testSelectUser(SqlSession session)
    {
        UserMapper um=session.getMapper(UserMapper.class);
        User user=um.selectUserById(2);
        System.out.println(user);
    }
    public void testSelectAllUser(SqlSession session)
    {
        UserMapper um=session.getMapper(UserMapper.class);
        List<User> users=um.selectAllUser();
        users.forEach(user -> System.out.println(user));
    }
    public void testUpdateUser(SqlSession session)
    {
        UserMapper um=session.getMapper(UserMapper.class);
        User user=um.selectUserById(2);
        System.out.println("modify before:"+user);
        //user.setName("update");
        //user.setSex("女");
        user.setAge(21);
        um.modifyUser(user);
        System.out.println("modify after:"+user);
    }
    public void testDeleteUser(SqlSession session)
    {
        UserMapper um=session.getMapper(UserMapper.class);
        User user=um.selectUserById(9);
        System.out.println("Object to be delete:"+user);
        um.removeUser(9);
    }
}
