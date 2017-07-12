<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC"-//w3c/DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>测试基于浏览器请求的国际化</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
<!--使用message标签来输出国际化信息，如果登录名是fkit，密码是123456，则验证通过-->
<h3><spring:message code="title"/></h3>
<form:form modelAttribute="user" method="post" action="login">
    <table>
        <tr>
            <td><spring:message code="loginname"/> </td><%--message文件中的--%>
            <td><form:input path="loginname"/></td><%--需要输入的--%>
        </tr>
        <tr>
            <td><spring:message code="password"/> </td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="<spring:message code="submit"/>"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
<%--测试I18NController
    code：message_en_US.properties中的变量
    path：User对象的属性
    提交之后请求变为：http://localhost:8080/login--%>