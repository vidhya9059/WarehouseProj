<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head><!-- 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style type="text/css">
.table {
	/* background-color: light; */
	border: 1px solid red;
	width: 100%;
}
</style> -->
</head>
<body>
<%@include file="WarehouseMenu.jsp" %>

<div class="container">
<div class="card card-header">
<h3>Welcome to WhUserType Data page</h3>
<a href="excel">Excel Export</a>
<a href="pdf">PDF Export</a>
</div>
<div class="card card-body">
<table border="1" class="table table-success">
<tr>
<th>ID</th><td>${ob.id }</td>

</tr>
<tr><th>UTYPE</th><td>${ob.userType}</td></tr>
<tr><th>UCODE</th><td>${ob.userCode}</td></tr>
<tr><th>USERFOR</th><td>${ob.userFor}</td>
</tr>
<tr><th>UEMAIL</th></tr>
<tr><th>UCONTACT</th></tr>
<tr><th>UIDTYPE</th></tr>
<tr><th>UIDOTHER</th></tr>
<tr><th>UIDNUMBER</th></tr>
<tr><th colspan="3">OPERATIONS</th></tr>
<%-- <c:forEach items="${list }" var="ob">
<tr>


<td><c:out value="${ob.userFor }"/></td>
<td><c:out value="${ob.userEmail }"/></td>
<td><c:out value="${ob.userContact }"/></td>
<td><c:out value="${ob.userIdType }"/></td>
<td><c:out value="${ob.ifOther }"/></td>
<td><c:out value="${ob.idNumber }"/></td>
<td><a href="delete?id=${ob.id }">DELETE</a>
<td><a href="edit?id=${ob.id }">EDIT</a>
<td><a href="view?id=${ob.id }">VIEW</a></td>
</tr> --%>
</table></div>
</div>
<p>* this is computer generated table</p>
</body>
</html>