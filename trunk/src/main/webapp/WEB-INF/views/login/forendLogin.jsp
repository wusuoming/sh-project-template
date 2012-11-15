<%@page pageEncoding="UTF-8" contentType="text/html; ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>
<html>
<head>
    <title>前台登录页面</title>
</head>
<body>
<p>
    前台登录
    <a href="/backend/login">后台登录</a>
</p>

<form action="/login/check?token=forend" method="post">
    <table>
        <tr>
            <td>邮件地址：</td>
            <td>
                <input type="text" name="email"/>
            </td>
        </tr>
        <tr>
            <td>电话号码：</td>
            <td>
                <input type="text" name="phone"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input name="_spring_security_remember_me" type="checkbox" value="true"/>记住我？
            </td>
        </tr>
        <c:choose>
            <c:when test="${param.error == 1}">
                <tr>
                    <td colspan="2" style="color: #ff0000;">Email not found!</td>
                </tr>
            </c:when>
            <c:when test="${param.error ==2}">
                <tr>
                    <td colspan="2" style="color: #ff0000;">Phone not found!</td>
                </tr>
            </c:when>
        </c:choose>
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
