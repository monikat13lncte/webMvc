<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Find laptop details</h2>
<form:form method="post" modelAttribute="find" action="find">
<table>
<tr>
<td><form:label path="id">id</form:label></td>
<td><form:input path="id" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit">
<a href="findlaptop">find laptop</a>
</tr>

</table>
</form:form>
</body>
</html>