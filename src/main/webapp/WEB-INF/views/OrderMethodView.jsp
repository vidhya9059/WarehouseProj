<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head><!-- 
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
 --></head>
<body>
<%@include file="WarehouseMenu.jsp" %>
   
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to Order Method View Page</h3>
			</div>
			<div class="card-body bg-light">
				<b>View Table Data</b>

				<table border="1" class="table table-success">
					<tr>
						<th>ID</th>
						<td>${ob.id}</td>
					</tr>
					<tr>
						<th>MODE</th>
						<td>${ob.orderMode }</td>
					</tr>
					<tr>
						<th>CODE</th>
						<td>${ob.orderCode}</td>
					</tr>
					<tr>
						<th>TYPE</th>
						<td>${ob.orderType}</td>
					</tr>
					<tr>
						<th>ACCEPT</th>
						<td>${ob.orderAccept}</td>
					</tr>
					<tr>
						<th>NOTE</th>
						<td>${ob.description}</td>
					</tr>
				</table>
			</div>
			<a href="excel?id=${ob.id }">EXCEL</a> 
			<a href="pdf?id=${ob.id }">PDF</a>
			<div class="card-footer bg-info text-white">
				<b>ORDER METHOD VIEW DATA</b>
			</div>
		</div>
	</div>
</body>
</html>