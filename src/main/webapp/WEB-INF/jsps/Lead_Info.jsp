<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>
<h2>Lead | Information</h2>
<pre>
id:         ${lead.id }
first name: ${lead.firstName }
last name:  ${lead.lastName }
email:      ${lead.email }
mobile:     ${lead.mobile }
</pre>
<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id }"/>
<input  type="submit" value="convert"/>
</form>
</body>
</html>