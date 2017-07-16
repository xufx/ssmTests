package org.fkit.mapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Order;
/**
 * Created by xufuxiu on 2017/7/15.
 */
public interface OrderMapper
{
    @Select("select * from tb_order where id =#{id}")
    @Results({
            @Result(id = true,column = "id",property="id"),
            @Result(column = "code",property = "code"),
            @Result(column = "total",property = "total"),
            @Result(column ="user_id",property = "user",one = @One(
                    select = "org.fkit.mapper.UserMapper.selectUserById",
                    fetchType = FetchType.EAGER
            )),
            @Result(column = "id",property="articles",many=@Many(
                    select = "org.fkit.mapper.ArticleMapper.selectArticleByOrderId",
                    fetchType = FetchType.EAGER
            ))
    })
    Order selectOderById(Integer id);
}
