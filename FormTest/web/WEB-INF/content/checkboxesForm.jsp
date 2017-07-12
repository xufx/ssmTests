<%--
springmvc表单标签测试UserController3，将model中对应的属性user的属性值分别取出来
输入http://localhost:8080/checkboxesForm进行测试
courseList集合变量作为页面显示可供选择的复选框内容
若user中的内容在集合变量courseList中存在则选中，复选框的value和label相同
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="user" method="post" action="checkboxForm">
    <table>
        <tr>
            <td>选择课程：</td>
            <td>
                <form:checkboxes path="courses" items="${courseList}"/>&nbsp;

            </td>
        </tr>

    </table>
</form:form>
<html>
<head>
    <title>checkboxesForm.jsp</title>
</head>
<body>

</body>
</html>
