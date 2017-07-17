<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/17
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<h3>登陆页面</h3>
<form action="login" method="post">
    <font color="red">${requestScope.message}</font>
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="text" id="password" name="password"></td>
        </tr>
        <tr><%--点击登陆之后请求变为：http://localhost:8080/login，由UserController处理--%>
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
