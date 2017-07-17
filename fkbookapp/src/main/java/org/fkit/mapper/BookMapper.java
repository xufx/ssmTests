package org.fkit.mapper;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Book;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/17.
 */
public interface BookMapper
{
    @Select("select * from tb_book")
    List<Book> findBookAll();
}
