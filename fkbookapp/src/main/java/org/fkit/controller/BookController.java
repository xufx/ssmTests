package org.fkit.controller;
import org.fkit.domain.Book;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/**
 * Created by xufuxiu on 2017/7/17.
 */
@Controller
public class BookController
{
    /*自动注入BookService*/
    @Autowired
    @Qualifier("bookService")/*指明需要注入的具体类型*/
    private BookService bookService;

    @RequestMapping(value="/main")
   public String main(Model model)
    {
        List<Book> book_list=bookService.getAll();
        model.addAttribute("book_list",book_list);
        return "main";
    }
}
