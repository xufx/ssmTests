<%--
springmvc表单标签测试UserController2，将model中对应的属性user的属性值分别取出来
输入http://localhost:8080/checkboxForm进行测试
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="user" method="post" action="checkboxForm">
    <table>
        <tr>
            <td>选择课程：</td>
            <td>
                <form:checkbox path="courses" value="JAVAEE" label="JAVAEE"/>&nbsp;
                <form:checkbox path="courses" value="Mybatis" label="Mybatis"/>&nbsp;
                <form:checkbox path="courses" value="Spring" label="Spring"/>&nbsp;
            </td>
        </tr>

    </table>
    <form:checkbox path="reader" value="true"/>已经阅读相关协议
</form:form>
<html>
<head>
    <title>checkboxForm.jsp</title>
</head>
<body>

</body>
</html>
