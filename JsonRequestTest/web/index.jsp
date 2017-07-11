<%--
页面载入时调用 testRequestBody函数
testRequestBody函数发送异步请求到”json/testRequestBody“
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>JsonRequestTest Module index.jsp</title>
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="js/json2.js"></script>
    <script type="text/javascript">
      $(document).ready(function ()
      {
        testRequestBody();
      });
      function testRequestBody()
      {//发送请求的URL字符串
          $.ajax(
                  url="${pageContext.request.contextPath}/json/testRequestBody",// 发送请求的URL字符串,交给BookController处理。
                  {
                      dataType : "json", // 预期服务器返回的数据类型。
                      type : "post", //  请求方式 POST或GET
                      contentType:"application/json", //  发送信息至服务器时的内容编码类型
                      // 发送到服务器的数据。
                      data:JSON.stringify({id : 1, name : "Spring MVC企业应用实战"}),
                      async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
                      // 请求成功后的回调函数。
                      success :function(data){
                          console.log(data);
                          $("#id").html(data.id);//填充span的内容
                          $("#name").html(data.name);
                          $("#author").html(data.author);
                      },
                      // 请求出错时调用的函数
                      error:function(){
                          alert("数据发送失败");
                      }
                  });

      }
    </script>
  </head>
  <body>
  <h2>测试接收JSON格式的数据</h2>
  编号：<span id="id"></span><br>
  书名：<span id="name"></span><br>
  作者：<span id="author"></span><br>
  </body>
</html>
