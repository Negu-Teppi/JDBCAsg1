<%--
  Created by IntelliJ IDEA.
  User: Hung_LV
  Date: 8/2/2021
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="edit" method="post">
    <table>
        <tr>
            <td>Id</td>
            <td><input readonly name="id" value="${student.id}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="studentName" value="${student.name}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${student.email}"></td>
        </tr>
        <tr>
            <td>Rank</td>
            <td>
                <select name="rank" id="rank">
                    <option value="A" ${student.rank =='A'? "selected":""} >A</option>
                    <option value="B" ${student.rank =='B'? "selected":""} >B</option>
                    <option value="C" ${student.rank =='C'? "selected":""} >C</option>
                    <option value="D" ${student.rank =='D'? "selected":""} >D</option>
                </select>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>
</form>
</body>
</html>
