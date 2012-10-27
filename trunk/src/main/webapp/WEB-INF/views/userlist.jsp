<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User list</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>
            Username
        </td>
        <td>
            Password
        </td>
    </tr>
    </thead>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.loginInfo.username}</td>
            <td>${user.loginInfo.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
