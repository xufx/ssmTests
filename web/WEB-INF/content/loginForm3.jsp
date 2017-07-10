<%--
  测试ModelAttribute2Controller
  输入以下数据result3.jsp才有数据
  ("test","123456","测试用户");
  ("admin","123456","管理员");
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginForm3.jsp</title>
</head>
<body>
<h3>测试@ModelAttribute(value="")注释返回具体类的方法</h3>
<form action="logins3" method="post">
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
            <td><input id="submit" type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
