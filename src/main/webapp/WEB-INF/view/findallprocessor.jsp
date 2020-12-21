  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>processor List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>id</th><th>genration</th><th>company</th></tr>  
   <c:forEach var="processor" items="${list}">   
   <tr>  
   <td>${processor.id}</td>  
   <td>${processor.genration}</td>  
   <td>${processor.company}</td>  
   
   </c:forEach>  
   </table>  
   <br/>  
   
    