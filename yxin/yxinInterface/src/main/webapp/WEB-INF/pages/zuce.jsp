<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/4 0004
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
    <script type="text/javascript">
        function ci() {
        $.ajax({
            url:'http://localhost:8080/aj',
            type:'post',
            dataType:'json',
            data:JSON.stringify({'id':'111110','name':'杨某人'}),
            contentType:"application/json",
           success:function(msg){
               alert("nice");

               alert(msg);
           },
           error: function(msg){
              alert("no");
           }
        }) }
    </script>
</head>
<body>
${1+5}
欢迎祖册
${user}
<br>
<a href="/log">继续添加</a>
<br>
<button type="button" onclick="alert('Welcome!')">测试js</button>
<br>
<button type="button" onclick="ci()">测试ajax</button>
<br>
<b id="s"></b>
</body>
</html>
