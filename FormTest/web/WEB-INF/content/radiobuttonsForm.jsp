<%--
employee和deptList都是model的一个key的名称，depts是Employee对象的一个集合属性
复选框的value=部门的id，label的值是部门的name
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="user" method="post" action="radiobuttonsForm">
    <table>
        <tr>
            <td>性别：</td>
            <td>
                <form:radiobuttons path="sex" items="${sexList}"/>&nbsp;
            </td>
        </tr>

    </table>
</form:form>
<html>
<head>
    <title>radiobuttonsForm.jsp</title>
</head>
<body>

</body>
</html>
