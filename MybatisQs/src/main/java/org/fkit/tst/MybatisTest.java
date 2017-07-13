package org.fkit.tst;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.fkit.domain.User;

import java.io.InputStream;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class MybatisTest
{
    public static void main(String[] args)throws Exception
    {
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");//1
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);//2mybatis初始化
        SqlSession session=sqlSessionFactory.openSession();//3
        User user=new User("admin","男",26);
        session.insert("org.fkit.mapper.UserMapper.save",user);//保持User对象
        session.commit();//提交事务
        session.close();//关闭session
    }
}
/*
1:读取mybatis-config.xml文件
2：初始化mybatis,创建SqlSessionFactory实例
3：创建Session实例
* */