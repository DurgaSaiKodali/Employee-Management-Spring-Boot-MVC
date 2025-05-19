<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
  <c:when test="${!empty empsData }">
  <table border="1" bgcolor="cyan" align="center">
  <tr style="color:green;background-color: yellow">
  <th>empno</th><th>emp name</th><th>emp job</th><th>emp salary</th><th>operations</th>
  
  </tr>
  <c:forEach  var="empl" items="${empsData }">
  <tr> 
   <td>${emp.empno }</td>
   <td>${emp.ename }</td>
   <td>${emp.job }</td>
   <td>${emp.sal }</td>
   <td>                    </td>
  
  
  </tr>
  
  
  
  </c:forEach>
  
  </table>
  
  </c:when>
  <c:otherwise>
     <h1 style="color:blue;text-align: center">Records Not found</h1>
  </c:otherwise>

</c:choose>
<center>
        <a href="./">Home<img src="images/home.jpeg" width="50"height="70"/></a>

</center>



