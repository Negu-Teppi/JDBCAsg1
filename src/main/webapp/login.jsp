<%--
  Created by IntelliJ IDEA.
  User: Hung_LV
  Date: 8/8/2021
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form method="POST" action="j_security_check">
    <table style="border: 0">
        <tr>
            <td>Login</td>
            <td>
                <input type="hidden" name="username">
                <input type="text" name="j_username">
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="j_password"></td>
        </tr>
    </table>
    <input type="submit" value="Login!">
    </center>
</form>
</body>
</html>
