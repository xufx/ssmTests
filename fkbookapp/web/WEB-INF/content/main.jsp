<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transactional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html" http-equiv="Content-Type">
    <title>main.jsp</title>
    <style type="text/css">
        table{
            border-collapse: collapse;
            border-spacing: 0;
            border-left: 1px solid #888;
            border-top: 1px solid #888;
            background: #efefef;
        }
        th,td{
            border-right:1px solid #888;
            border-bottom: 1px solid #888;
            padding:5px 15px;
            }
        th{
            font-weight:bold;
            background:#ccc;
        }
    </style>
</head>
<body>
欢迎[${sessionScope.user.username}]访问<br>
<table border="1">
    <tr>
        <th>封面</th><th>书名</th><th>作者</th><th>价格</th>
    </tr>
    <c:forEach items="${requestScope.book_list}" var="book">
        <tr>
            <td><img src="images/${book.image}" height="60">/td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
<%--遍历book_list中的每个Book对象，重新赋值为book--%>