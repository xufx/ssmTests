<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试基于浏览器请求的国际化</title>
</head>
<body>
<!--使用message标签来输出国际化信息-->
<h3><spring:message code="title"/></h3>
<form:form modelAttribute="user" method="post" action="login">
    <table>
        <tr>
            <td><spring:message code="loginname"/> </td>
            <td><form:input path="loginname"></form:input></td>
        </tr>
        <tr>
            <td><spring:message code="password"/> </td>
            <td><form:input path="password"></form:input></td>
        </tr>
        <tr>
            <td><input type="submit" value="<spring:message code="submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
