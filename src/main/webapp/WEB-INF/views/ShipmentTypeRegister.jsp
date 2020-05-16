<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><!-- 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

 -->

</head>
<body>
<%@include file="WarehouseMenu.jsp" %>
   
<div class="container">	
<div class="card card-header card-light"><h3>Welcome to ShipmentType Register</h3></div>
	<div class="card card-body card-secondary">
	<form action="save" method="POST">
		<pre>
Shipment Mode :<select name="shipmentMode">
              <option value="SELECT">-SELECT-</option>
              <option>AIR</option>
              <option>TRUCK</option>
              <option>SHIP</option>
              <option>TRIAN</option>
              </select>
             
Shipment Code :<input type="text" name="shipmentCode"/>
EnableShipment:<select name="enableShipment">
               <option value="">-SELECT-</option>
               <option value="YES">YES</option>
               <option value="NO">NO</option>
               </select>
Shipment Grade:<input type="radio" name="shipmentGrade" value="A"/>A               
               <input type="radio" name="shipmentGrade" value="B"/>B
               <input type="radio" name="shipmentGrade" value="C"/>C
Description   :<textarea name="desription"></textarea>
<input type="submit" class="btn btn-success"value="Create Shipment">
</pre>
	</form>
	</div>
	</div>
	
	${msg}
</body>
</html>