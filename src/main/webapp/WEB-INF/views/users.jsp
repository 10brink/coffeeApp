<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>
<h2>users</h2>

<table border = "1">
<thead>
<tr>
<td>First Name</td>
<td>Last Name</td>
<td>email</td>
</tr>
</thead>
<tbody>
<c:forEach items = "${users }" var = "item">
<tr>
<td>${item.firstName }</td>
<td> ${item.lastName }</td>
<td> ${item.email }</td>
<!--  <td> <a href = "update-form?id=${item.id }">update</a></td>
<td> <a href = "delete?id=${item.id }">delete</a></td> -->
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>