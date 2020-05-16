<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to Document page</h3>
	<form action="upload" method="POST" enctype="multipart/form-data">
		<pre>
File Id:<input type="text" name="id" />
Document:<input type="file" name="fdoc" />
<input type="submit" value="Upload" />
</pre>
	</form>
	<table border="1">
		<tr>
			<th>FileName</th>
			<th>Link</th>
		</tr>
		<c:forEach items="${list }" var="ob">
			<tr>
				<td>${ob[1] }</td>
				<td><a href="download?id=${ob[0] }">Download</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>