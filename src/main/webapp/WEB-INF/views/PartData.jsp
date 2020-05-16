<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- 
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
					<th>ID</th>
					<th>CODE</th>
					<th>WIDTH</th>
					<th>LENGTH</th>
					<th>HEIGHT</th>
					<th>BASECODE</th>
					<th>BASEPRICE</th>
					<th>UOMTYPE</th>
					<th>ORDER SALE</th>
					<th>ORDER PURCHASE</th>
					
<!-- 					<th>ordermethodcode</th>
 -->					<th>NOTE</th>
					<th colspan="3">OPERATIONS</th>
				</tr>
			<%-- <c:forEach items="${uomlist }" var="ob">
			 --%>	<c:forEach items="${list }" var="ob">
					<tr>
						<td><c:out value="${ob.id }" /></td>
						<td><c:out value="${ob.code}" /></td>
						<td><c:out value="${ob.width}" /></td>
						<td><c:out value="${ob.lenght}" /></td>
						<td><c:out value="${ob.height}" /></td>
						<td><c:out value="${ob.baseCode }" /></td>
						<td><c:out value="${ob.baseCurrency }" /></td>
						<td><c:out value="${ob.uomTypes}" /></td>
						<td><c:out value="${ob.orderSale}" /></td>
						<td><c:out value="${ob.orderPurchase}" /></td>
					<!-- 	//orderSale is Parent model class variable
					 -->	
          <%-- <td><c:out value="${ob.orderMethodCode}" /></td> --%>		
         				<td><c:out value="${ob.description }" /></td>
						<td><a href="delete?id=${ob.id }"><img
								src="../resources/images/delete.png" height="25" width="25" /></a>
						<td><a href="edit?id=${ob.id }"><img
								src="../resources/images/edit.png" height="25" width="25" /></a></td>
						<td><a href="view?id=${ob.id }"><img
								src="../resources/images/view.png" height="25" width="25" /></a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
