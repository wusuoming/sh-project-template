<%@ page import="java.io.PrintWriter" %>
<%@page pageEncoding="UTF-8" contentType="text/html; ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>
<html>
<head>
    <title>用户切换成功页面</title>
</head>
<body>
<h1>
    ******************恭喜你成功切换用户******************

    <%
        PrintWriter writer = response.getWriter();
        writer.println("Remote user : " + request.getRemoteUser());
        writer.println("Auth type : " + request.getAuthType());
        writer.println("Context path : " + request.getContextPath());
        writer.println("Servlet path : " + request.getServletPath());
        writer.println("Remote user : " + request.getUserPrincipal());
    %>
</h1>

<p>
    <a href="/exit">退出</a>
</p>
</body>
</html>
