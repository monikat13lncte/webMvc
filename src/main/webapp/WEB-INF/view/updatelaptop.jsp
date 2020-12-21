<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>laptop details</h2>
<form:form method="post" modelAttribute="updatelaptop" action="updatelaptop">
<table>



<tr>
<td><form:label path="graphic_card">graphic_card</form:label></td>
<td><form:input path="graphic_card" /></td>
</tr>
<tr>
<td><form:label path="ram"> ram </form:label></td>
<td><form:input path="ram" /></td>
</tr>

<tr>
<td><form:label path="company"> company</form:label></td>
<td><form:input path="company" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit">
</tr>
<td><a href="index.jsp">home</a></td>
</table>
</form:form>
</body>
</html>