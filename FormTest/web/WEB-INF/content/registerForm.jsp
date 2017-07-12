<%--
springmvc表单标签测试UserController，将model中对应的属性command的属性值分别取出来
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="post" action="register">
    <table>
        <tr>
            <td>姓名：</td>
            <td><form:input path="username"></form:input></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><form:input path="sex"></form:input></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><form:input path="age"></form:input></td>
        </tr>
    </table>
</form:form>
<html>
<head>
    <title>registerForm.jsp</title>
</head>
<body>

</body>
</html>
