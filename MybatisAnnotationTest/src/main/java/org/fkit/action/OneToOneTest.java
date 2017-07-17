package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Card;
import org.fkit.domain.Person;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.CardMapper;
import org.fkit.mapper.PersonMapper;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public class OneToOneTest
{
    public static void main(String[] args)throws  Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        OneToOneTest t=new OneToOneTest();
        //t.testSelectCardById(session);
        t.testSelectPersonById(session);
        session.commit();
        session.close();
    }
    public void testSelectCardById(SqlSession session)
    {
        CardMapper cm=session.getMapper(CardMapper.class);
        Card card=cm.selectCardById(1);
        System.out.println(card);
    }
    public void testSelectPersonById(SqlSession session)
    {
        PersonMapper pm=session.getMapper(PersonMapper.class);
        Person person=pm.selectPersonById(1);
        System.out.println(person);
    }
}
/*用注解实现一对一查询，一个人对应一个身份证号*/