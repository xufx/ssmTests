<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/8
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Welcome</title>
</head>
<body>
    <%--页面可以访问controller传递出来的message--%>
    ${requestScope.message}

</body>
</html>
