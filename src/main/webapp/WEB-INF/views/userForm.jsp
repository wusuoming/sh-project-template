<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
<spring-form:form commandName="userDTO">
    <table>
        <tr>
            <td>
                Username :
            </td>
            <td>
                <spring-form:input path="username"/>
            </td>
        </tr>
        <tr>
            <td>
                Password :
            </td>
            <td>
                <spring-form:password path="password"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</spring-form:form>
</body>
</html>
