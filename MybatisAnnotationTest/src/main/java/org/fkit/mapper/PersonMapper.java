package org.fkit.mapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Person;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public interface PersonMapper
{
    @Select("SELECT * FROM tb_person where id=#{id}")
    @Results({
            @Result(id = true,column = "id",property="id"),
            @Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "age",property = "age"),
            @Result(column = "card_id",property = "card",one = @One
                    (
                            select = "org.fkit.mapper.CardMapper.selectCardById",
                            fetchType = FetchType.EAGER
                    ))
    })
    Person selectPersonById(Integer id);
}
/*one = @One：表示一对一的关系
@Result的屬性column：表中的外鍵
* @One注解的select属性：表示需要关联执行的SQL语句*/