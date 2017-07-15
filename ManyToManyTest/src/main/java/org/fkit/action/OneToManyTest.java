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
public class OneToManyTest
{
     public static void main(String[] args)throws  Exception
      {
          InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
          SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession session=sqlSessionFactory.openSession();
          OneToManyTest t=new OneToManyTest();
          //t.selectUserById(session);
          t.selectOrderById(session);
          session.commit();
          session.close();
      }
      public void selectUserById(SqlSession session)
      {
          UserMapper um=session.getMapper(UserMapper.class);
          User user=um.selectUserById(1);
          System.out.println(user);
            for(Order order:user.getOrders())
            {
                System.out.println(order);
            }
      }
      public void selectOrderById(SqlSession session)
      {
          OrderMapper om=session.getMapper(OrderMapper.class);
          Order order=om.selectOderById(1);
          System.out.println(order);
          System.out.println(order.getUser());
          for (Article article:order.getArticles())
          {
              System.out.println(article);
          }
      }
}
