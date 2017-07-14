package org.fkit.action;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.fkit.domain.Clazz;
import org.fkit.domain.Student;
import org.fkit.mapper.ClazzMapper;
import org.fkit.mapper.StudentMapper;

import java.io.InputStream;
import java.util.List;
/**
 * Created by xufuxiu on 2017/7/14.
 */
public class OneToManyTest
{
     public static void main(String[] args)throws  Exception
      {
          InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
          SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession session=sqlSessionFactory.openSession();
            OneToManyTest t=new OneToManyTest();

          //测试一对多
          //t.testSelectClazzById(session);
          //测试多对一
          t.testSelectStudentById(session);
          session.commit();
          session.close();
      }
      public void testSelectClazzById(SqlSession session)
      {
          ClazzMapper cm=session.getMapper(ClazzMapper.class);//获得mapper接口的代理对象ClazzMapper
          Clazz clazz=cm.selectClazzById(1);//执行ClazzMapper.xml的id=selectClazzById的语句
          System.out.println(clazz);
          List<Student>students=clazz.getStudents();
          for(Student stu:students)
          {
              System.out.println(stu);
          }
      }
    public void testSelectStudentById(SqlSession session)
    {
        StudentMapper cm=session.getMapper(StudentMapper.class);//获得mapper接口的代理对象StudentMapper
        Student stu=cm.selectStudentById(1);//执行StudentMapper.xml的id=selectStudentById的语句
        System.out.println(stu);
    }
}
/*getMapper():获得mapper接口的代理对象ClazzMapper*/