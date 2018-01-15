<%--
  Created by IntelliJ IDEA.
  User: liujiyong
  Date: 2017/10/19
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>$Title$</title>
  </head>
  <body>
  $END$

  <br>
  <a href="timer">访问Action并计算执行Action花费的时间</a>
  </body>
</html>
