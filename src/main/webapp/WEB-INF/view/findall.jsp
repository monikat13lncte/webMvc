  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Laptop data List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>serial_no</th><th>graphic_card</th><th>ram</th><th>company</th></tr>  
   <c:forEach var="laptop" items="${list}">   
   <tr>  
   <td>${laptop.serial_no}</td>  
   <td>${laptop.graphic_card}</td>  
   <td>${laptop.ram}</td>  
   <td>${laptop.company}</td>  
    
     
   </c:forEach>  
   </table>  
   <br/>  
   