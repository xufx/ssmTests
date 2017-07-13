package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.factory.FKSqlSessionFactory;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class DeleteTest
{
    public static void main(String[] args)throws Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        session.delete("org.fkit.mapper.UserMapper.deleteUser",1);
        session.commit();
        session.close();
    }
}
