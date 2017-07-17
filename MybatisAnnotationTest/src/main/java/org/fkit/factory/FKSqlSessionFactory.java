package org.fkit.factory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.InputStream;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class FKSqlSessionFactory
{
    //创建SqlSessionFactory和SqlSession对象
    private static SqlSessionFactory sqlSessionFactory=null;
    static
    {//初始化创建SqlSessionFactory对象
        try
        {
            InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession()
    {//获取SqlSession对象的静态方法
        return sqlSessionFactory.openSession();
    }
    public static SqlSessionFactory getSqlSessionFactory()
    {//获取SqlSessionFactory的静态方法
        return sqlSessionFactory;
    }
}
