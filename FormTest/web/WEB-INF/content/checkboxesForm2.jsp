<%--
使用Map作为数据源，springmvc表单标签测试UserController3，将model中对应的属性user的属性值分别取出来
输入http://localhost:8080/checkboxesForm进行测试
courseMap集合变量作为页面显示可供选择的复选框内容
若user中的内容在集合变量courseMap中存在则选中,与checkboxForm,.jsp相比，复选框的value和label不同
value=courseMap.key,label=courseMap.value
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="user" method="post" action="checkboxesForm2">
    <table>
        <tr>
            <td>选择课程：</td>
            <td>
                <form:checkboxes path="courses" items="${courseMap}"/>&nbsp;

            </td>
        </tr>

    </table>
</form:form>
<html>
<head>
    <title>checkboxesForm2.jsp</title>
</head>
<body>

</body>
</html>
