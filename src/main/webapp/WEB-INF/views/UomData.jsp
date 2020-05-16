<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head></head>
<body>
<%@include file="WarehouseMenu.jsp" %>
   
	<h3>Welcome to UomData page</h3>
	<a href="excel"><img src="../resources/images/excel.png" height="25" width="25"/></a>
	<a href="pdf"><img src="../resources/images/pdf2.png" height="25" width="25"/></a>
				
	<table border="1">
		<tr>
			<th>ID</th>
			<th>TYPE</th>
			<th>MODEL</th>
			<th>DESCRIPTION</th>
			<th colspan="3">OPERATION</th>
		</tr>
		<c:forEach items="${list}" var="ob">
			<tr>
				<td><c:out value="${ob.id }" /></td>
				<td><c:out value="${ob.uomtype }" /></td>
				<td><c:out value="${ob.uommodel }" /></td>
				<td><c:out value="${ob.descreption }" /></td>
				<td><a href="delete?id=${ob.id }"><img src="../resources/images/delete.png" height="25" width="25"/></a>
				<td><a href="edit?id=${ob.id }"><img src="../resources/images/edit.png" height="25" width="25"/></a>
				<td><a href="view?id=${ob.id }"><img src="../resources/images/view.png" height="25" width="25"/></a>
				
			
			</tr>
		</c:forEach>
	</table>
	${msg}
</body>
</html>