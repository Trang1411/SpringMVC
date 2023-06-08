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
<table>
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>${student.id}</td>
        <td>${student.fullName}</td>
        <td>${student.age}</td>
    </tr>
    <tr>
        <td>${student1.id}</td>
        <td>${student1.fullName}</td>
        <td>${student1.age}</td>
    </tr>
</table>
</body>
</html>
