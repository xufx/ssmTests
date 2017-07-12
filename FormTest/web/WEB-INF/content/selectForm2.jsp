<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  使用options标签的items属性自动加载后台数据并将其显示在下拉框中
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form modelAttribute="user" action="selectForm">
    <table>
        <tr>
            <td>部门：</td>
            <td>
                <form:select path="deptId" items="${deptMap}">
                </form:select>
                <%--
                <form:select path="deptId" >
                    <form:options items="${deptMap}"></form:options>
                </form:select>
                --%>
            </td>
        </tr>
    </table>
</form:form>
<html>
<head>
    <title>selecForm2.jsp</title>
</head>
<body>

</body>
</html>
