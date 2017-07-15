package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.factory.FKSqlSessionFactory;

import java.util.List;
import java.util.Map;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class SelectMapTest
{
    public static void main(String[] args)throws Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        List<Map<String,Object>>list=
                session.selectList("org.fkit.mapper.UserMapper.selectUser");

        for (Map<String,Object> row:list)
        {
            System.out.println(row);
        }

        session.commit();
        session.close();
    }
}
/*获取tb_user表中的所有行，每行作为一个User对象存储到list中，列名=key,列值=value*/