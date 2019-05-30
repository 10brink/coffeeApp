<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cerulean/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous"></head>
<link rel ="stylesheet" href = "style.css">


</head>
<body>
<h1>Drinks</h1>

<!-- ${test } -->

 <table border="1">
<thead>

<tr>
<font size: "5">
<td>Name</td>
<td>Category</td>
<td><div>Description</div></td>
</font>
</tr>

</thead>
<tbody>

<c:forEach items="${test}" var = "i">
<tr>
<td>${i.name }</td>
<td>${i.category } </td>
 <td>${i.description }</td>
            </tr>

</c:forEach>
</tbody>
</table>
<br>
<h3>Search by category</h3>
<form action = "search">
<input type = "text" name = "catSearch">
<input type = "submit" name = "search">
</form>

<h3>Add item to list</h3>
 <table border="1">
<thead>
<tr>
<td width="125">      Name  </td>
<td width="129">    Category  </td>
<td width="129">Description</td>

</tr>
</thead>
</table>
<form action = "add-item">
<input type = "text" name = "name">
<input type = "text" name = "category">
<input type = "text" name = "description">
<input type = "submit" name = "add">
</form>


<h2>
<a href="/">home</a></h2>
<form action = "newusr" method = "post">

<input type = "submit" value="Register new user">
<br>

<a href="about-page">drink menu</a>


<!-- jsp expression -->
<br>
<%= new java.util.Date() %>
</body>
</html>