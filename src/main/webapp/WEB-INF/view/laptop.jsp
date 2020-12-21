<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Laptop Details</h2>
<form:form method="post" modelAttribute="laptop" action="laptop">
<h1>Add New Laptop</h1>  
         
        <table > 
        <tr>
        <td><form:label path="serialNo">Serial No :</form:label></td>
         <td><form:input path="serialNo" /></td>       
         </tr>    
         <tr>    
          <td><form:label path="processor">Processor : </form:label></td>   
          <td><form:input path="processor"  /></td>  
         </tr>    
         <tr>    
          <td><form:label path="graphicCard">Graphic Card:</form:label></td>    
          <td><form:input path="graphicCard" /></td>  
         </tr>   
         <tr>    
          <td><form:label path="ram">Ram :</form:label></td>    
          <td><form:input path="ram" /></td>  
         </tr>
         <tr>    
          <td><form:label path="Price">Price :</form:label></td>    
          <td><form:input path="price" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form> 
       </body>
</html>