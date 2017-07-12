<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/12
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success.jsp</title>
</head>
<body>
<spring:message code="welcome" arguments="${requestScope.user.username}"></spring:message>
</body>
</html>
