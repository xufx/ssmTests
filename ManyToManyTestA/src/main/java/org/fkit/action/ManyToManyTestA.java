package org.fkit.action;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.fkit.domain.*;
import org.fkit.mapper.OrderMapper;
import org.fkit.mapper.UserMapper;

import java.io.InputStream;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public class ManyToManyTestA
{
     public static void main(String[] args)throws  Exception
      {
          InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
          SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession session=sqlSessionFactory.openSession();
          ManyToManyTestA t=new ManyToManyTestA();
          //t.testSelectUserById(session);
          t.testSelecOrderById(session);
          session.commit();
          session.close();
      }
    public void testSelectUserById(SqlSession session)
    {
        UserMapper um=session.getMapper(UserMapper.class);
        User user=um.selectUserById(1);
        System.out.println(user);
    }
    public void testSelecOrderById(SqlSession session)
    {
        OrderMapper um=session.getMapper(OrderMapper.class);
            Order order=um.selectOderById(1);
        System.out.println(order);
        System.out.println(order.getUser());
        /*for(Article article:order.getArticles())
        {
            System.out.println( article);
        }*/
        order.getArticles().forEach(article -> System.out.println(article));
    }
}
