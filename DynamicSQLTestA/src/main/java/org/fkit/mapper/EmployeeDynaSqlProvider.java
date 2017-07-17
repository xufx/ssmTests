package org.fkit.mapper;
import org.apache.ibatis.jdbc.SQL;
import org.fkit.domain.Employee;

import java.util.Map;
/**
 * Created by xufuxiu on 2017/7/17.
 */
public class EmployeeDynaSqlProvider
{
    public String selectWhitParam2(Map<String,Object> param)
    {/*selectWhitParam方法会根据参数Map中的内容构建动态的select语句*/
        return new  SQL()
        {
            {
                SELECT("*");
                FROM ("TB_EMPLOYEE");
                if(param.get("id")!=null)
                    WHERE ("id=#{id}");//前一个id：tb_employee表中的id，后一个id：param中的id
            }
            {
                if(param.get("loginname")!=null)
                    WHERE ("loginname=#{loginname}");
            }
            {
                if(param.get("password")!=null)
                    WHERE ("password=#{password}");
            }
            {
                if(param.get("name")!=null)
                    WHERE ("name=#{name}");
            }
            {
                if(param.get("sex")!=null)
                    WHERE ("sex=#{sex}");
            }
            {
                if(param.get("age")!=null)
                    WHERE ("age=#{age}");
            }
            {
                if(param.get("phone")!=null)
                    WHERE ("phone=#{phone}");
            }
            {
                if(param.get("sal")!=null)
                    WHERE ("sal=#{sal}");
            }
            {
                if(param.get("state")!=null)
                    WHERE ("state=#{state}");
            }

        }.toString();
    }

    public String insertEmployee2(Employee employee)
    {
        return new  SQL()
        {
            {
                INSERT_INTO ("TB_EMPLOYEE");
                if(employee.getLoginname()!=null)
                    VALUES ("loginname","#{loginname}");
            }
            {
                if(employee.getPassword()!=null)
                    VALUES ("password","#{password}");
            }
            {
                if(employee.getName()!=null)
                    VALUES ("name","#{name}");
            }
            {
                if(employee.getSex()!=null)
                    VALUES ("sex","#{sex}");
            }
            {
                if(employee.getAge()!=null)
                    VALUES ("age","#{age}");
            }
            {
                if(employee.getPhone()!=null)
                    VALUES ("phone","#{phone}");
            }
            {
                if(employee.getSal()!=null)
                    VALUES ("sal","#{sal}");
            }
            {
                if(employee.getState()!=null)
                    VALUES ("state","#{state}");
            }

        }.toString();
    }

    public String updateEmployee2(Employee employee)
    {
        return new  SQL()
        {
            {
                UPDATE ("TB_EMPLOYEE");
                if(employee.getLoginname()!=null)
                    SET ("loginname=#{loginname}");
            }
            {
                if(employee.getPassword()!=null)
                    SET ("password=#{password}");
            }
            {
                if(employee.getName()!=null)
                    SET ("name=#{name}");
            }
            {
                if(employee.getSex()!=null)
                    SET ("sex=#{sex}");
            }
            {
                if(employee.getAge()!=null)
                    SET ("age=#{age}");
            }
            {
                if(employee.getPhone()!=null)
                    SET ("phone=#{phone}");
            }
            {
                if(employee.getSal()!=null)
                    SET ("sal=#{sal}");
            }
            {
                if(employee.getState()!=null)
                    SET ("state=#{state}");
            }

        }.toString();
    }

    public String deleteEmployee2(Map<String,Object> param)
    {/*selectWhitParam方法会根据参数Map中的内容构建动态的select语句*/
        return new  SQL()
        {
            {
                DELETE_FROM("TB_EMPLOYEE");
                if(param.get("id")!=null)
                    WHERE ("id=#{id}");//前一个id：tb_employee表中的id，后一个id：param中的id
            }
            {
                if(param.get("loginname")!=null)
                    WHERE ("loginname=#{loginname}");
            }
            {
                if(param.get("password")!=null)
                    WHERE ("password=#{password}");
            }
            {
                if(param.get("name")!=null)
                    WHERE ("name=#{name}");
            }
            {
                if(param.get("sex")!=null)
                    WHERE ("sex=#{sex}");
            }
            {
                if(param.get("age")!=null)
                    WHERE ("age=#{age}");
            }
            {
                if(param.get("phone")!=null)
                    WHERE ("phone=#{phone}");
            }
            {
                if(param.get("sal")!=null)
                    WHERE ("sal=#{sal}");
            }
            {
                if(param.get("state")!=null)
                    WHERE ("state=#{state}");
            }

        }.toString();
    }
}
