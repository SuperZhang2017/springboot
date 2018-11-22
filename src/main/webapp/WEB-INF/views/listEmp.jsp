<%@page language="java"  contentType="text/html;charset=utf-8"  pageEncoding="utf-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table align="center" border="1" cellspacing="0">
     <tr>
         <td>id</td>
         <td>name</td>
         <td>age</td>
         <td>sex</td>
         <td>birthDay</td>
     </tr>
     <c:forEach items="${emps}" var="s" varStatus="st">
         <tr>
             <td>${s.id}</td>
             <td>${s.name}</td>
             <td>${s.age}</td>
             <td>${s.sex}</td>
             <td>${s.birthDay}</td>
         </tr>
     </c:forEach>


</table>