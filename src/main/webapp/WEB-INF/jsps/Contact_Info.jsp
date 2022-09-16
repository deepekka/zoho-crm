<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
<h2>Lead | Contact</h2>
<pre>
id:         ${contactInfo.id }
first name: ${contactInfo.firstName }
last name:  ${contactInfo.lastName }
email:      ${contactInfo.email }
mobile:     ${contactInfo.mobile }
</pre>
</body>
</html>