<%@page
	import="org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file="WarehouseMenu.jsp"%>
	<div class="container">
		<div class="card">
			<div class="card-header card-info">
				<h3>Welcome to Part Page</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="POST" modelAttribute="part">
					
					
					<div class="row">
						<div class="col-4">
							<label><b>CODE :</b></label>
						</div>
						<div class="col-4">
							<form:input path="code" class="form-control" />
						</div>
						<div class="col-4"></div>
					</div>

                   <div class="row">
						<div class="col-4">
							<label> <b>DIMENSIONS:</b></label>
						</div>

						<div class="col-4">
							<div class="row">
								<div class="col-4">
									<label>Width :</label>
								</div>
								<div class="col-4">
									<form:input path="width" value="" class="form-control" />
								</div>
								<div class="col-4"></div>
							</div>
							
							<div class="row">
							<div class="col-4">
								<label>Length:</label>
							</div>
							<div class="col-4">
								<form:input path="lenght" value="" class="form-control"/>
							</div>
							<div class="col-4"></div>
							</div>
							
							<div class="row">
							<div class="col-4">
								<label>Height:</label>
								</div>
								<div class="col-4">
									<form:input path="height" value="" class="form-control" />
							  </div>
							  <div class="col-4"></div>
							</div>
							
							
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label> <b>BASE CODE :</b></label>
						</div>
						<div class="col-4">
							<form:input path="baseCode" class="form-control" />
						</div>
						<div class="col-4"></div>
					</div>
					
					
					<div class="row">
					<div class="col-4"><label><b>BASE PRICE:</b></label>
					</div>
					<div class="col-4">
					<form:input path="baseCurrency" class="form-control" />
					</div>
					<div class="col-4"></div>
					<%-- <form:select path="baseCurrency">

<form:option value="">-SELECT</form:option>
<form:option value="INR">INR</form:option>
<form:option value="USD">USD</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="ERU">ERU</form:option>
</form:select>
 --%>
                    </div>
 
 
                     <div class="row">
                     <div class="col-4"><label>
					  <b>UOM :</b></label>
					</div>
					<div class="col-4">
					<form:select path="uomTypes.id" class="form-control">
						<form:option value="">-SELECT-</form:option>
						<form:options items="${uoms }" />
					</form:select>
					</div>
					<div class="col-4"></div>
					</div>
					
					<div class="row">
					<div class="col-4"><label><b>SALE :</b></label>
					</div>
					<div class="col-4">
					<form:select path="orderSale.id" class="form-control">
						<form:option value="">-SELECT-</form:option>
						<form:options items="${sales }" />
					</form:select>
					</div>
					<div class="col-4"></div>
					</div>
					
					<div class="row">
					<div class="col-4"><label><b>PURCHASE :</b></label></div>
				<div class="col-4">	<form:select path="orderPurchase.id" class="form-control">
						<form:option value="">-SELECT-</form:option>
						<form:options items="${purchases }" />
					</form:select></div>
					<div class="col-4"></div>
					</div>
					
					
					<div class="row">
					<div class="col-4"><label><b>DESCRIPTION:</b></label></div>
					<div class="col-4">
					<form:textarea path="description" class="form-control"></form:textarea>
					</div>
					<div class="col-4"></div>
					</div>
					
					<input type="submit" value="Create Part" class="btn btn-info" />
					<input type="reset" value="Reset" class="btn btn-danger" />


					</pre>
				</form:form>
			</div>
		</div>
	</div>
	${msg}
</body>
</html>