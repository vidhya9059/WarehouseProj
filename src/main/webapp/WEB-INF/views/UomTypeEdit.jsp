<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%@include file="WarehouseMenu.jsp" %>


<h3>Welcome to Uom Edit page</h3>
<form:form action="update" method="POST" modelAttribute="uom">
<pre>
ID       :<form:input path="id" readonly="true"/>
Uom Type :<form:select path="uomtype">
          <form:option value="">-SELECT-</form:option>
          <form:option value="PACKING">PACKING</form:option>
          <form:option value="NO PACKING">NO PACHING</form:option>
          <form:option value="-NA-">NA</form:option>
          </form:select>
Uom Model:<form:input path="uommodel"/>
Description:<form:textarea path="descreption"/>
<input type="submit" value="Update"/>
         </pre>
</form:form>
</body>
</html>