<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>主页</title>
</head>
<body>
    <div style="width: 100%;height: 720px">
        <h1 align="center" style="margin-top: 250px;">
            <strong></strong>
        </h1>
    </div>
    
    <script src="${pageContext.request.contextPath}/resources/xznstatic/js/jquery-1.10.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/jsp/static/iframeAuto.js"></script>
    <script>
        <%@ include file = "../../utils/baseUrl.jsp" %>

        $('h1 strong').html('欢迎使用' + projectName)
    </script>
</body>
</html>
