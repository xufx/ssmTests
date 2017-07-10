<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/9
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>数据绑定测试</title>
  </head>
  <body>
  <h2>@PathVariable @RequestHeader@CookieValue数据绑定测试</h2>
    <!--点击之后请求为：
    http://localhost:8080/pathVariableTest/1
    http://localhost:8080/requestHeaderTest
    http://localhost:8080/cookieValueTest-->

  <a href="pathVariableTest/1">测试@PathVariable注解</a><br><br>
  <a href="requestHeaderTest">测试@RequestHeader注解</a><br><br>
  <a href="cookieValueTest">测试@CookieValue注解</a><br><br>
  </body>
</html>
