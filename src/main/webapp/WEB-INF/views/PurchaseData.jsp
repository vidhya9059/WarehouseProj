<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<th>ID</th>
<th>OCODE</th>
<th>SHIPMODE</th>
<th>VENDOR</th>
<th>REFNUMBER</th>
<th>QUALCHECK</th>
<th>DEFSTATUS</th>
<th>NOTE</th>

<th colspan="3">OPERATIONS</th>
</tr>
<c:forEach items="${list }" var="ob">
<tr>
<td><c:out value="${ob.id }"/></td>
<td><c:out value="${ob.orderCode}"/></td>
<td><c:out value="${ob.shipmentMode.code}"/></td>
<td><c:out value="${ob.vendor }"/></td>
<td><c:out value="${ob.referenceNumber }"/></td>
<td><c:out value="${ob.qualityCheck }"/></td>
<td><c:out value="${ob.defaultStatus }"/></td>
<td><c:out value="${ob.description }"/></td>



<td><a href="delete?id=${ob.id }">DELETE</a>
<td><a href="edit?id=${ob.id }">EDIT</a>
<td><a href="view?id=${ob.id }">VIEW</a></td>
<%-- <td><a href="parts?id=${ob.id }">PARTS</a>-</td>
 --%></tr>
</c:forEach>
</table></div>
</div>

</body>
</html>


