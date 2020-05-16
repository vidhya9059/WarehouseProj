<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
<%@include file="WarehouseMenu.jsp" %>

<h3>Welcome to ShipmentType Edit page</h3>
<form:form action="update" method="POST" modelAttribute="ShipmentType">
<pre>
ID       :<form:input path="id" readonly="true"/>
ShipmentType Mode :<form:select path="shipmentMode">
          <form:option value="">-SELECT-</form:option>
          <form:option value="AIR">AIR</form:option>
          <form:option value="TRUCK">TRUCK</form:option>
          <form:option value="SHIP">SHIP</form:option>
          <form:option value="TRAIN">TRAIN</form:option>
          </form:select>
ShipmentType Code:<form:input path="shipmentCode"/>
Enable Shipment  :<form:select path="enableShipment">
          <form:option value="select">-SELECT-</form:option>
          <form:option value="yes">YES</form:option>
          <form:option value="no">NO</form:option>
           </form:select>
Shipment Grade:  
        <form:radiobutton path="shipmentGrade" value="A"/>A
         <form:radiobutton path="shipmentGrade" value="B"/>B
         <form:radiobutton path="shipmentGrade" value="C"/>C
        Description:<form:textarea path="desription"/>
<input type="submit" value="Update"/>
         </pre>
</form:form>
</body>
</html>