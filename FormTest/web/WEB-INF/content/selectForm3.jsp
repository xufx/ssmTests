<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  使用options标签的items属性自动加载后台数据并将其显示在下拉框中
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form modelAttribute="user" action="selectForm">
    <table>
        <tr>
            <td>学历：</td>
            <td>
                <form:select path="deptId" >
                    <form:options items="${deptList}" itemLabel="name" itemValue="id"></form:options>
                </form:select>
            </td>
        </tr>
    </table>
</form:form>
<html>
<head>
    <title>selecForm3.jsp</title>
</head>
<body>

</body>
</html>
