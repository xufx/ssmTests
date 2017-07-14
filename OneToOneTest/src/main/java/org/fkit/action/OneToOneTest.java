package org.fkit.action;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.fkit.domain.Person;
import org.fkit.mapper.PersonMapper;

import java.io.InputStream;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public class OneToOneTest
{
     public static void main(String[] args)throws  Exception
      {
          InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
          SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession session=sqlSessionFactory.openSession();

          PersonMapper pm=session.getMapper(PersonMapper.class);//获得mapper接口的代理对象PersonMapper
          Person p=pm.selectPersonById(1);//执行PersonMapper.xml的id=selectPersonById的语句
          System.out.println(p);
          System.out.println(p.getCard());
          session.commit();
          session.close();
      }
}
