<%--
 用来测试ModelAttribute1Controller,ModelAttribute2Controller、ModelAttribute3Controller
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试@ModelAttributes的不同用法</title>
</head>
<body><!--点击之后跳转的form都是content下的-->
    <a href="loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法</a><br><br>
    <a href="loginForm2">测试@ModelAttribute注释void返回值的方法</a><br><br>
    <a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a><br><br>
    <a href="logins4">测试@ModelAttribute和@RequestMapping同时注释一个方法</a><br><br>
    <a href="loginForm5">测试@ModelAttribute注释一个方法的参数</a><br><br>
</body>
</html>
