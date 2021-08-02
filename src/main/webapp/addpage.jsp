<%--
  Created by IntelliJ IDEA.
  User: Hung_LV
  Date: 8/2/2021
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
    <form action="add" method="post">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="studentName" ></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Rank</td>
                <td><input type="text" name="rank"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>
