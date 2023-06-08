<%--
  Created by IntelliJ IDEA.
  User: trang.nguyen17
  Date: 6/8/2023
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<h2>USER</h2>
<form:form action="processForm" modelAttribute="user">

    Name:
    <form:input path="userName" />

    <br><br> Email (*):
    <form:input path="email" />
    <form:errors path="email" cssClass="error" />

    <br><br> Role:
    <form:input path="role" />
    <form:errors path="role" cssClass="error" />

    <br><br>Creator:
    <form:input path="creator"/>
    <form:errors path="creator" cssClass="error" />

    <br><br>

    <input type="submit" value="Submit" />

</form:form>
<%--<p>--%>
<%--    ${"createAdmin"}--%>
<%--</p>--%>
</body>
</html>
