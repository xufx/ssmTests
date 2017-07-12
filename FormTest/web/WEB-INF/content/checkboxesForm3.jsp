<%--
employee和deptList都是model的一个key的名称，depts是Employee对象的一个集合属性
复选框的value=部门的id，label的值是部门的name
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="employee" method="post" action="checkboxesForm3">
    <table>
        <tr>
            <td>选择部门：</td>
            <td>
                <form:checkboxes path="depts" items="${deptList}" itemLabel="name" itemValue="id"/>&nbsp;
            </td>
        </tr>

    </table>
</form:form>
<html>
<head>
    <title>checkboxesForm3.jsp</title>
</head>
<body>

</body>
</html>
