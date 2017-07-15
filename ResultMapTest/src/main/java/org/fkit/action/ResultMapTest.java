package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class ResultMapTest
{
    public static void main(String[] args)throws Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        List<User> user_list=
                session.selectList("org.fkit.mapper.UserMapper.selectUser2");

        for (User user:user_list)
        {
            System.out.println(user);
        }

        session.commit();
        session.close();
    }
}
/*获取tb_user表中的所有行，每行作为一个User对象存储到user_list中*/