<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>delete Employee details</h2>
<form:form method="post" modelAttribute="deletelaptop" action="deletelaptop">
<table>
<tr>
<td><form:label path="serial_no">serial_no</form:label></td>
<td><form:input path="serial_no" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit">
</tr>
<td><a href="index.jsp">home</a></td>
</table>
</form:form>
</body>
</html>