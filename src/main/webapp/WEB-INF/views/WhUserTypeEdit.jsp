<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h3>Welcome to WhUserType Edit page</h3>
<form:form action="update" method="POST" modelAttribute="whUserType">
<pre>
User ID  :<form:input path="id" readonly="true"/>
User Type:<form:radiobutton path="userType" value="Vendor"/>Vendor
          <form:radiobutton path="userType" value="Customer"/>Customer           
User Code :<form:input path="userCode"/>
User For  :<form:input path="userFor"/>
User Email:<form:input path="userEmail" />
User Contact:<form:input path="userContact"/>
User Id Type:<form:select path="userIdType">
               <form:option value="SELECT">-SELECT-</form:option>
               <form:option value="PANCARD">PANCARD</form:option>
               <form:option value="AADHAR">AADHAR</form:option>
               <form:option value="VOTERID">VOTERID</form:option>
               <form:option value="OTHER">OTHER</form:option>
               </form:select>
If Other:<form:input path="ifOther"/>
ID Number:  <form:input path="idNumber"/>             
<input type="submit" class="btn btn-success" value="Update">
         </pre>
</form:form>
</body>
</html>