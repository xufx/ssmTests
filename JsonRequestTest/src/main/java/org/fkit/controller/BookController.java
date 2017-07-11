package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
/**
 * Created by xufuxiu on 2017/7/11.
 */
@Controller
@RequestMapping(value="/json")
public class BookController
{
     private static final Log logger= LogFactory.getLog(BookController.class);

    //@RequestBody根据json数据，转换成对应的Object
    @RequestMapping(value="/testRequestBody")
    public void setJson(
            @RequestBody Book book,
            HttpServletResponse response
    )throws Exception
    {
        ObjectMapper mapper=new ObjectMapper();
        logger.info(mapper.writeValueAsString(book));//将book对象转化成json输出
        book.setAuthor("肖文姬");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转化为json写出到客户端
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
