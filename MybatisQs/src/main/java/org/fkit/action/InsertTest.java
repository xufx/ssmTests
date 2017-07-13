package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class InsertTest
{
    public static void main(String[] args)
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        User user=new User("jack","男",22);
        session.insert("org.fkit.mapper.UserMapper.saveUser",user);
        session.commit();
        session.close();
    }
}
