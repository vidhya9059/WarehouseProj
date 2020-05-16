<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><!-- 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"> -->
</head>
<body>
<%@include file="WarehouseMenu.jsp" %>
   
<div class="container">	
<div class="card card-header card-light"><h3>Welcome to ShipmentType Register</h3></div>
	<div class="card card-body card-secondary">
	<form action="save" method="POST">
		<pre>
Order Mode:<input type="radio" name="orderMode" value="Sale"/>SALE           
               <input type="radio" name="orderMode" value="Purchase"/>PURCHASE
Order Code :<input type="text" name="orderCode"/>
Order Type:<select name="orderType">
               <option value="SELECT">-SELECT-</option>
               <option>FIFO</option>
               <option>LIFO</option>
               <option>FCFO</option>
               <option>FEFO</option>
               </select>
Order Accept:<input type="checkbox" name="orderAccept" value="MULTI-MODEL"/>MULTI-MODEL
            <input type="checkbox" name="orderAccept" value="ACCEPT RETURN"/>ACCEPT RETURN
Description   :<textarea name="description"></textarea>
<input type="submit" class="btn btn-success" value="Create Order Method">
</pre>
	</form>
	</div>
	</div>
	${msg}
</body>
</html>