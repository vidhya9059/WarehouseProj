<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<%@include file="WarehouseMenu.jsp" %>

<h3>Welcome to ShipmentType Edit page</h3>
<form:form action="update" method="POST" modelAttribute="OrderMethod">
<pre>
ID       :<form:input path="id" readonly="true"/>
Order Mode:<form:radiobutton path="orderMode" value="Sale"/>SALE           
               <form:radiobutton path="orderMode" value="Purchase"/>PURCHASE
Order Code :<form:input path="orderCode"/>
Order Type:<form:select path="orderType">
               <form:option value="SELECT">-SELECT-</form:option>
               <form:option value="FIFO">FIFO</form:option>
               <form:option value="LIFO">LIFO</form:option>
               <form:option value="FEFO">FCFO</form:option>
               <form:option value="FEFO">FEFO</form:option>
               </form:select>
Order Accept:<form:checkbox path="orderAccept" value="MULTI-MODEL"/>MULTI-MODEL
            <form:checkbox path="orderAccept" value="ACCEPT RETURN"/>ACCEPT RETURN
Description   :<form:textarea path="description"></form:textarea>
<input type="submit" class="btn btn-success" value="Update">
         </pre>
</form:form>
</body>
</html>