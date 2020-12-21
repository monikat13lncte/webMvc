<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update </title>

</head>
<body>

<h2>update Processor details</h2>
<form:form method="post" modelAttribute="processor" action="updateprocessor">
<table>
<tr>
<td><form:label path="id">id</form:label></td>
<td><form:input path="id" /></td>
</tr>

<tr>
<td><form:label path="genration">generation</form:label></td>
<td><form:input path="genration" /></td>
</tr>
<tr>
<td><form:label path="company"> company </form:label></td>
<td><form:input path="company" /></td>
</tr>


<tr>
<td colspan="2"><input type="submit" value="submit">
<a href="updatelaptop">update</a>
</tr>

</table>
</form:form>
</body>
</html>