<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
 --></head>
<body>
<%@include file="WarehouseMenu.jsp" %>

<div class="container">	
<div class="card card-header card-light"><h3>Welcome to GRN Register</h3></div>
	<div class="card card-body card-secondary">
	<form action="save" method="POST">
		<pre>
GRN Code:<input type="text" name="grnCode"/>   
GRN Type:<input type="text" name="grnType"/>           
        
Order Code:<select name="orderCode">
               <option value="">-SELECT-</option>
               <option value="OC1">OC1</option>
               <option value="OC2">OC2</option>
               <option value="OC3">OC3</option>
               <option value="OC4">OC4</option>
               </select>
Description   :<textarea name="description"></textarea>
<input type="submit" class="btn btn-success" value="Create GRN"/>
</pre>
	</form>
	</div>
	</div>
	${msg}
</body>
</html>