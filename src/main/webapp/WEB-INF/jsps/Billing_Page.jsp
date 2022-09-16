<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
<h2>Lead | Billing</h2>
<form action="savebill" method="post">
	<pre>
	first name: <input type="text" name="firstName" value="${contactInfo.firstName }"/>
	last name:  <input type="text" name="lastName" value="${contactInfo.lastName }"/>
	email:      <input type="email" name="email" value="${contactInfo.email }"/>
	mobile:     <input type="text" name="mobile" value="${contactInfo.mobile }"/>
	product:    <input type="text" name="product"/>
	amount:     <input type="text" name="amount"/>
		   	   <input type="submit" value="bill"/>
	
	</pre>
</form>
</body>
</html>