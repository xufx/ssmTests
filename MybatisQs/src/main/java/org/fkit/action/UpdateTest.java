package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class UpdateTest
{//更改tb_user中的第一行元素的name、age
    public static void main(String[] args) throws Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        //获取第一行元素
        User user=session.selectOne("org.fkit.mapper.UserMapper.selectUser",1);
        user.setName("tom");
        user.setAge(25);
        System.out.println(user);
        //更改之后提交给数据库
        session.update("org.fkit.mapper.UserMapper.modifytUser",user);
        session.commit();
        session.close();
    }
}
