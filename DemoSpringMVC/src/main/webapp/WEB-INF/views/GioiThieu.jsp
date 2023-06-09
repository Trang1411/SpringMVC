<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/8/2023
  Time: 12:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hiển thị nội dung từ biến bên controller (của đối tượng model)</title>
</head>
<body>
<h3>forEach:</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Age</th>
    </tr>
        <c:forEach var="std" items= "${studentList}">
            <tr>
                <td>${std.id}</td>
                <td>${std.fullName}</td>
                <td>${std.age}</td>
            </tr>

        </c:forEach>

</table>
</body>
</html>
