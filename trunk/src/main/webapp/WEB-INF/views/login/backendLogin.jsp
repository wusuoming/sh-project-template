<%@page pageEncoding="UTF-8" contentType="text/html; ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>
<html>
<head>
    <title>后台登录页面</title>
</head>
<body>
<p>
    <a href="/forend/login">第一种登录</a>
    <a href="javascript:void(0)">第二种登录</a>
</p>
<form action="/forend/login/check" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td>
                <input type="input" name="username"/>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="password"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
