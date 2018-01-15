<%--
  Created by IntelliJ IDEA.
  User: liujiyong
  Date: 2017/10/23
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<form action="/LoginAction.action" method="post">

    用户名：<input type="text" name="username"><s:fielderror name="username"></s:fielderror>
    密码：<input type="password" name="password">
    书籍1:<input type="text" name="bookList[0].username">
    书籍2：<input type="text" name="bookList[1].username">
    年龄：<input type="text" name="age">

    <input type="submit" value="提交"/>
</form>
</body>
</html>
