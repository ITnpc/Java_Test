<%--
  Created by IntelliJ IDEA.
  User: liujiyong
  Date: 2018/1/3
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<form action="viewAll.form" method="post" name="form">
    用户名：<input type="text" name="name"  />
    <br>
    密码：<input type="password" name="pwd" />
    <br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>
