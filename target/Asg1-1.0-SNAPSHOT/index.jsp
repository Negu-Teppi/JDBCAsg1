<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        #main {
            width: 50%;
            height: 50%;
            display: flex;
            flex-wrap: wrap;
        }
        #main div {
            width: 50px;
            height: 50px;
        }
        table, th, td{
            border:1px solid black;
        }
        table{
            border-collapse:collapse;
        }
    </style>
</head>
<body>
    <div >
        <a href="./addpage.jsp">Add</a>
        <form action="load" method="post">
            <input style="margin-left: 150px" type="text" name="name"/>
            <input type="submit" value="Search"/>
        </form>
    </div>
    <br/>
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

</body>
</html>