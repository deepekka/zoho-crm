<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Lead | Create</h2>
<form action="saveLead" method="post">
	<pre>
	first name: <input type="text" name="firstName"/>
	last name:  <input type="text" name="lastName"/>
	source:     <select name="source">
  			      <option value="newspaper">newspaper</option>
 				  <option value="radio">radio</option>
 			 	  <option value="t.v commercials">t.v commercials</option>
 			 	  <option value="youtube">youTube</option>
				</select>
	email:      <input type="email" name="email"/>
	mobile:     <input type="text" name="mobile"/>
		   	   <input type="submit" value="save"/>
	
	</pre>
</form>
</body>
</html>