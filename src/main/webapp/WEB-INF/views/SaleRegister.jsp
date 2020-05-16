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
			<div class="card-header bg-success text-white">
				<h3>Welcome to Sales page</h3>
			</div>
			<div class="card-body bg-primary text-white">
				<form:form action="save" method="POST" modelAttribute="sale">
				<pre>
        Order Code      :<form:input path="orderCode" />
	Shipment Mode   :<form:select path="shipmentMode">
                     <form:option value="">-SELECT-</form:option>
                     <form:option value="AIR">AIR</form:option>
                     <form:option value="TRUCK">TRUCK</form:option>
                     <form:option value="SHIP">SHIP</form:option>
                     <form:option value="TRAIN">TRIAN</form:option>
                     </form:select>
        Customer:        <form:select path="customer">
                         <form:option value="">-SELECT-</form:option>
                         <form:option value="RCUST">RCUST</form:option>
                         <form:option value="IRCUST">IRCUST</form:option>
                         </form:select>
	Reference Number:<form:input path="refNumber" />
	Stack Mode:      <form:radiobutton path="stockMode" value="GRADE"/>GRADE
	                 <form:radiobutton path="stockMode" value="MARGIN"/>MARGIN
	Stock Source:    <form:select path="stockSource">
                     <form:option value="">-SELECT-</form:option>
                     <form:option value="OPEN">OPEN</form:option>
                     <form:option value="AVAIL">AVAIL</form:option>
                     <form:option value="REFUND">REFUND</form:option>
                     </form:select>	
	Default Status  :<form:input path="defaultStatus" placeholder="SALE-OPEN" />
	Description     :<form:textarea path="description" />
            <input type="submit" value="Register"/>
				</pre>
				</form:form>
					${msg}
			</div>
		</div>
	</div>


</body>

</html>