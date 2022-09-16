<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bills</title>
</head>
<body>
<h2>Lead | All Bills</h2>
<table border=1>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Product</th>
<th>Amount</th>

</tr>


 <c:forEach var="bills" items="${bills}">
 <tr>
		<td>${bills.id }</td>
		<td>${bills.firstName }</a></td>
		<td>${bills.lastName }</td>
		<td>${bills.email }</td>
		<td>${bills.mobile }</td>
		<td>${bills.product }</td>
		<td>${bills.amount }</td>
</tr>
   </c:forEach>

</table>

</body>
</html>