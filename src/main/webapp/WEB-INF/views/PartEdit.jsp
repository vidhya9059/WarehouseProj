<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file="WarehouseMenu.jsp"%>
	<h3>Welcome to Part Edit page</h3>
	<form:form action="update" method="POST" modelAttribute="part">
		<pre>
ID           :<form:input path="id" readonly="true" />
code         :<form:input path="code" />
Dimensions   :Width :<form:input path="width" value=""/>
             Length:<form:input path="lenght" value=""/>
             Height:<form:input path="height" value=""/>
Base Code    :<form:input path="baseCode" />
Base Price:<form:input path="baseCurrency"/>
<%-- <form:select path="baseCurrency">
              <form:option value="">-SELECT</form:option>
              <form:option value="INR">INR</form:option>
              <form:option value="USD">USD</form:option>
              <form:option value="AUS">AUS</form:option>
              <form:option value="ERU">ERU</form:option>
              </form:select>
 --%>Uom          :<form:select path="uomTypes.id">
<form:option value="">-SELECT-</form:option>
<form:options items="${uoms }"/>
</form:select>
Description:  <form:textarea path="description"></form:textarea>
<input type="submit" value="Create Part" />
</pre>
	</form:form>
</body>
</html>