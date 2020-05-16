<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
 --></head>
<body>
<%@include file="WarehouseMenu.jsp" %>

	<div class="container">
		<div class="card">
			<div class="card-header bg-success text-blue">
				<h3>Welcome to Purchase Register page</h3>
			</div>
			<div class="card-body bg-primary text-white">
				<form:form action="save" method="POST" modelAttribute="purchase">
				<pre>
        Order Code      :<form:input path="orderCode" />
	Shipment Mode   :<form:select path="shipmentType.id">
                     <form:option value="">-SELECT-</form:option>
                     <form:options items="${ships }"/>
                     <%-- <form:option value="AIR">AIR</form:option>
                     <form:option value="TRUCK">TRUCK</form:option>
                     <form:option value="SHIP">SHIP</form:option>
                     <form:option value="TRAIN">TRIAN</form:option>
                      --%></form:select>
	Vendor          :<form:input path="vendor" />
	Reference Number:<form:input path="referenceNumber" />
	Quality Check   :<form:radiobutton path="qualityCheck" value="Requird" />Required
	                 <form:radiobutton path="qualityCheck" value="Not-Requird" />Not-required
	Default Status  :<form:input path="defaultStatus" />
	Description     :<form:textarea path="description" />
            <input type="submit" value="Register">
				</pre>
				</form:form>
				
					${msg}
			</div>
		</div>
	</div>


</body>

</html>