<%--
  Created by IntelliJ IDEA.
  User: liujiyong
  Date: 2018/1/4
  Time: 17:53
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
    <script type="text/javascript" src="<%=path%>/ckeditor/ckeditor.js"></script>
    <script type="text/javascript" src="<%=path%>/ckfinder/ckfinder.js"></script>
  </head>
  <body>

      <form action="cktest.action" method="post">
          <textarea rows="10" cols="80" id="editor" name="editor" class="ckeditor">
            请输入...
          </textarea>
          <input type="submit" value="保存">
      </form>
  $END$
  </body>
</html>
