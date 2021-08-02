<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        table, th, td{
            border:1px solid black;
        }
        table{
            border-collapse:collapse;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Rank</th>
        </tr>
        <c:forEach var="student" items="${studentList}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.email}</td>
                <td>${student.rank}</td>
                <td><a href="./del?id=${student.id}">del</a></td>
                <td><a href="./edit?id=${student.id}">edit</a></td>
            </tr>
        </c:forEach>
    </table>

    <a href="./addpage.jsp">Add</a>
</body>
</html>