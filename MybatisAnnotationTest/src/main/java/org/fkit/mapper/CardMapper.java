package org.fkit.mapper;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Card;
/**
 * Created by xufuxiu on 2017/7/16.
 */
public interface CardMapper
{
    @Select("SELECT * FROM tb_card WHERE ID=#{id}")
    Card selectCardById(Integer id);
}
