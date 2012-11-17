<%@page pageEncoding="UTF-8" contentType="text/html; ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>
<html>
<head>
    <title>后台登录成功页面</title>
</head>
<body>
<h1>
    恭喜你成功登录进后台系统，这是后台系统的欢迎界面******************
</h1>

<p>
<table>
    <thead>
    <th>
        <td>用户名</td>
        <td>操作</td>
    </th>
    </thead>
    <tbody>
    <c:forEach items="${userDTOs}" var="userDTO">
        <tr>
            <td>${userDTO.username}</td>
            <td>
                <a href="/switch?username=${userDTO.username}" style="color:blue;text-decoration: underline">切换</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</p>
</body>
</html>
