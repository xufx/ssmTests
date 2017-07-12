<%--
springmvc表单标签测试UserController，将model中对应的属性command的属性值分别取出来
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="user" method="post" action="hasError">
    <table>
        <tr>
            <td>姓名：</td>
            <td><form:input path="username"/></td>
            <td><font color="red"><form:errors path="username"/></font></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><form:input path="sex"/></td>
            <td><font color="red"><form:errors path="sex"/></font></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><form:input path="age"/></td>
            <td><font color="red"><form:errors path="age"/></font></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
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
