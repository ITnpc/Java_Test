<%--
  Created by IntelliJ IDEA.
  User: liujiyong
  Date: 2018/1/17
  Time: 16:21
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
    <h3>富文本信息展示</h3>
    ${editor}
</body>
</html>
