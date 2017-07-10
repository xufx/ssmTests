<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/9
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome.jsp</title>
</head>
<body>
<h3>欢迎[${requestScope.user.username}]登录</h3>

    <!--测试SessionAttributesController时使用-->
    requestScope:${requestScope.user.username}<br>
    sessionScope:${sessionScope.user.username}<br>
    requestScope:${requestScope.user.loginname}<br>
    sessionScope:${sessionScope.user.loginname}<br>
    requestScope:${requestScope.user.password}<br>
    sessionScope:${sessionScope.user.password}<br>
</body>
</html>
