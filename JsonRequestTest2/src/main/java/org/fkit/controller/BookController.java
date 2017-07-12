package org.fkit.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
/**JSONObject-lib包是一个beans,collections,maps,java arrays和xml和JSON互相转换的包
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
       /* logger.info(JSONPObject.toJSONString(book));//使用JSONObject将book对象转换成json输出
        book.setAuthor("肖文姬");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转化为json写出到客户端
        response.getWriter().println(JSONObject.toJSONString(book));*/
    }
}
