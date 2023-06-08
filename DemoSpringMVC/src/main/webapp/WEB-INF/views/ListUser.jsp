<%--
  Created by IntelliJ IDEA.
  User: trang.nguyen17
  Date: 6/8/2023
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List User</title>
</head>
<body>
<input type="button" value="Add Customer"
       onclick="window.location.href='showForm'; return false;"
       class="btn btn-primary"/>
<br/><br/>
<div class="panel panel-info">
<div class="panel-heading">
    <div class="panel-title">User List</div>
</div>
<div>
<table>
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Password</th>
    <th>Role</th>
</tr>
<!-- loop over and print our customers -->
<c:forEach var="tempCustomer" items="${customers}">

    </table>
    </div>
    </body>
    </html>
