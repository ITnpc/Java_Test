<%--
  Created by IntelliJ IDEA.
  User: liujiyong
  Date: 2018/1/4
  Time: 18:12
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
    <link rel="stylesheet" type="text/css" href="css/common.css" />
    <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
    <script type="text/javascript">
        $(function(){
           $(".thumbs a").click(function () {
               var largePath = $(this).attr("href");
               var largeAlt = $(this).attr("title");
               $("#largeImg").attr({
                   src:largePath,
                   alt:largeAlt
               });
               return false;
           });

            $("#myfile").change(function () {
                $("#previewImg").attr("src", "file:///" + $("#myfile").val());
            });

            var la = $("#large");
            la.hide();

            $("#previewImg").mousemove(function (e) {
                la.css({
                    top: e.pageY,
                    left: e.pageX
                }).html('<img src="' + this.src +'" />').show();
            }).mouseout(function () {
                la.hide();
            });
        });



        /* //使用js实现文件上传图片的预览
        function showPreview(obj) {
            var str = obj.value;
            document.getElementById("previewImg").innerHTML=
                "<img src = '"+ str +"'/>";
        }
        */
    </script>
</head>
<body>

    <h2>&nbsp;文件下载</h2>
    <a href="download.action?filename=img3-lg.jpg">文件下载</a>
    <hr>
    <h2>图片预览</h2>
    <p><img id="largeImg" src="images/img1-lg.jpg" alt="Large Image"/></p>
    <p class="thumbs">
        <a href="images/img2-lg.jpg" title="image2"><img src="images/img2-thumb.jpg"></a>
        <a href="images/img3-lg.jpg" title="image3"><img src="images/img3-thumb.jpg"></a>
        <a href="images/img4-lg.jpg" title="image4"><img src="images/img4-thumb.jpg"></a>
        <a href="images/img5-lg.jpg" title="image5"><img src="images/img5-thumb.jpg"></a>
        <a href="images/img6-lg.jpg" title="image6"><img src="images/img6-thumb.jpg"></a>
    </p>
</body>
</html>
