<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/12
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form modelAttribute="user" action="selectForm">
    <table>
        <tr>
            <td>部门：</td>
            <td>
                <form:select path="deptId">
                    <form:option value="1">财务部</form:option>
                    <form:option value="2">开发部</form:option>
                    <form:option value="3">销售部</form:option>
                </form:select>
            </td>
        </tr>
    </table>
</form:form>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
