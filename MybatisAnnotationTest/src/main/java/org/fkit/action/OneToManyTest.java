package org.fkit.action;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Clazz;
import org.fkit.domain.Student;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.ClazzMapper;
import org.fkit.mapper.StudentMapper;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public class OneToManyTest
{
    public static void main(String[] args)throws  Exception
    {
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        OneToManyTest t=new OneToManyTest();
        //t.testSelectStudentByClazzId(session);
        t.testSelectClazzById(session);
        session.commit();
        session.close();
    }
    public void testSelectStudentByClazzId(SqlSession session)
    {
        StudentMapper sm=session.getMapper(StudentMapper.class);
        List<Student> students=sm.selectStudentByClazzId(1);
        students.forEach(stu -> System.out.println(stu));
    }
    public void testSelectClazzById(SqlSession session)
    {
        ClazzMapper cm=session.getMapper(ClazzMapper.class);
       Clazz clazz=cm.selectClazzById(1);
        System.out.println(clazz);
        for (Student stu:clazz.getStudents())
        {
            System.out.println(stu);
        }

    }
}
/*用注解实现一对一查询，一个人对应一个身份证号*/