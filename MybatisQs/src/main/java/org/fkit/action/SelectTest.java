package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class SelectTest
{
    public static void main(String[] args)
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        User user=session.selectOne("org.fkit.mapper.UserMapper.selectUser",1);//数据库返回数据之后封装成User对象
        System.out.println(user);
        session.commit();
        session.close();
    }
}
