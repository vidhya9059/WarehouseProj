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
			<div class="card-header">
				<h3>welcome to user register page</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="POST" modelAttribute="user">
					<div class="row">
						<div class="col-4">
							<label><b>NAME :</b></label>
						</div>
						<div class="col-4">
							<form:input path="userName" class="form-control" />
						</div>
						<div class="col-4"></div>
					</div>
					<div class="row">
						<div class="col-4">
							<label><b>EMAIL :</b></label>
						</div>
						<div class="col-4">
							<form:input path="userEamil" class="form-control" />
						</div>
						<div class="col-4"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label><b>PASSWORD :</b></label>

						</div>
						<div class="col-4">
							<form:input path="userPassword" class="form-control" />
						</div>
						<div class="col-4"></div>
					</div>
					<div class="row">
						<div class="col-4">
							<label><b>ROLES :</b></label>
						</div>
						<div class="col-4">
							<form:checkbox path="userRoles" value="ADMIN" />
							ADMIN
							<form:checkbox path="userRoles" value="EMPLOYEE" />
							EMPLOYEE
						</div>
						<div class="col-4"></div>
					</div>
					<input type="submit" value="Register" class="btn btn-succss" />
					<input type="reset" value="Reset" class="btn btn-info" />
				</form:form>
			</div>
			<div class="card-footer">Created new User!!</div>
		</div>
		${msg }
	</div>
</body>
</html>