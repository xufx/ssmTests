<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
code：对应welcome = \u6B22\u8FCE {0} \u8BBF\u95EE\u75AF\u72C2\u8F6F\u4EF6
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
<%--结果：欢迎 管理员 访问疯狂软件--%>
