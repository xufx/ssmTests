package org.fkit.service.impl;
import org.fkit.domain.Book;
import org.fkit.mapper.BookMapper;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/17.
 */
@Service("bookService")/*将当前类注释为spring的bean，id=userService*/
public class BookServiceImpl implements BookService
{
    @Autowired/*自动注入持久层的mapper对象*/
    private BookMapper bookMapper;
    @Override
    public List<Book> getAll()
    {
        return bookMapper.findBookAll();
    }
}
