<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
	<%@include file="WarehouseMenu.jsp"%>
	<div class="container">
		<div class="card">
			<div class="card-header">
				<h3>Choose Parts here</h3>
			</div>
			<div class="card-body">
				<form:form action="add" method="POST" modelAttribute="purchaseDtl">
					<pre>
PART   :<form:select path="part.id">
        <form:option value="">-SELECT-</form:option>
        <form:options items="${parts }" />

</form:select>
QUANTITY:<form:input path="qty" />
<input type="submit" value="Add" />
</pre>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>