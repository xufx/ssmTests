package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Clazz;
import org.fkit.domain.Student;
import org.fkit.factory.FKSqlSessionFactory;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/13.
 */
public class SelectClazzTest
{
    public static void main(String[] args)throws Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        List<Clazz>clazz_list=
                session.selectList("org.fkit.mapper.UserMapper.selectClazz");

        for (Clazz clazz:clazz_list)
        {
            System.out.println(clazz);
            List<Student> student_list=clazz.getStudents();
            for (Student stu:student_list)
            {
                System.out.println(stu);
            }
        }

        session.commit();
        session.close();
    }
}
