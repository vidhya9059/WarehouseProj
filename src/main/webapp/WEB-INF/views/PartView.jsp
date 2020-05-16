<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head><!-- 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style type="text/css">
.table {
	/* background-color: light; */
	border: 1px solid red;
	width: 100%;
}
</style> -->
</head>
<body>
<%@include file="WarehouseMenu.jsp" %>
	<div class="container">
		<div class="card card-header">
			<h3>Welcome to Part page</h3>
			<a href="excel"><img src="../resources/images/excel.png"
				height="25" width="25" /></a> <a href="pdf"><img
				src="../resources/images/pdf2.png" height="25" width="25" /></a>
			<!-- 
<a href="excel">Excel Export</a>
<a href="pdf">PDF Export</a>
 -->
		</div>
		<div class="card card-body">
			<table border="1" class="table table-success">
				<tr>
					<th>ID</th><td>${ob.id }</td></tr>
					<tr><th>CODE</th><td>${ob.code}</td></tr>
					<tr><th>DIMENTIONS</th><td>${ob.dimentions}</td></tr>
					<tr><th>BASECODE</th><td>${ob.baseCode }</td></tr>
					<tr><th>BAESCURRENCY</th><td>${ob.baseCurrency }</td></tr>
					<tr><th>UOM</th><td>${ob.uom }</td></tr>
					<tr><th>ORDERMETHODCODE</th><td>${ob.orderMethodCode}</td></tr>
					<tr><th>NOTE</th><td>${ob.description }</td></tr>
					<tr><th colspan="3">OPERATIONS</th>
				</tr>
				<%-- <c:forEach items="${list }" var="ob">
					<tr>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><c:out value="" /></td>
						<td><a href="delete?id=${ob.id }"><img
								src="../resources/images/delete.png" height="25" width="25" /></a>
						<td><a href="edit?id=${ob.id }"><img
								src="../resources/images/edit.png" height="25" width="25" /></a></td>
						<td><a href="view?id=${ob.id }"><img
								src="../resources/images/view.png" height="25" width="25" /></a></td>
					</tr>
				</c:forEach>
			 --%></table>
		</div>
		    <a href="excel?id=${ob.id }">EXCEL</a> 
			<a href="pdf?id=${ob.id }">PDF</a>
	</div>
</body>
</html>

