<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<c:if test="${not empty error}">
    ${error}
</c:if>
<form action="/login" method="post">
    <table>
        <tr>
            <td>User:</td>
            <td><input type="text" name="user_login"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password_login"></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit" > </td>
        </tr>
    </table>
</form>

</body>
</html>
