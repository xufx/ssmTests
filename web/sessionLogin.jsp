<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/9
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registerForm.jsp</title>
</head>
<body>
<h3>注册页面</h3>
<form action="session" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><label>真实姓名：</label></td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr><%--点击注册后请求变为http://localhost:8080/user/register--%>
            <td><input type="submit" id="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
