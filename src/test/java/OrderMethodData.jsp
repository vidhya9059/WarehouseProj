<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to OrderMethd page</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>OMODE</th>
			<th>OCODE</th>
			<th>OTYPE</th>
			<th>DESCRI</th>
			<th>OACCEPT</th>
			<th>OPERATION</th>
			
		</tr>
		<c:forEach items="${list}" var="ob">
			<tr>
				<td><c:out value="${ob.id }" /></td>
				<td><c:out value="${ob.orderMode }" /></td>
				<td><c:out value="${ob.orderCode }" /></td>
				<td><c:out value="${ob.orderType }" /></td>
				<td><c:out value="${ob.description }" /></td>
				<td><c:out value="${ob.orderAccept }" /></td>
				<td><a href="delete?id=${ob.id }">DELETE</a>
			</tr>
		</c:forEach>
	</table>
	${msg}
</body>
</body>
</html> --%>