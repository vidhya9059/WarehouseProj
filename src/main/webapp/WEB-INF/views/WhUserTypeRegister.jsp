<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><!-- 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head> -->
<body>
<%@include file="WarehouseMenu.jsp" %>

<div class="container">	
<div class="card card-header card-light"><h3>Welcome to WhUserType Register</h3></div>
	<div class="card card-body card-secondary">
	<form action="save" method="POST" enctype="multipart/form-data">
		<pre>
User Type:<input type="radio" name="userType" value="Vendor"/>Vendor           
               <input type="radio" name="userType" value="Customer"/>Customer
User Code :<input type="text" name="userCode"/>
User For:<input type="text" placeholder="Purchase/Sale" name="userFor"/>

User Email:<input type="text" name="userEmail"/>
          
User Contact  :<input type="text"name="userContact"/>
User Id Type:<select name="userIdType">
               <option value="SELECT">-SELECT-</option>
               <option value="Pancard">PANCARD</option>
               <option value="Aadhar">AADHAR</option>
               <option value="VoterId">VOTERID</option>
               <option value="Other">OTHER</option>
               </select>
IF OTHER: <input type="text" name="ifOther"/>
ID Number:<input type="text" name="idNumber"/>
Document:<input type="file" name="fileDoc" class="form-control"/>


<input type="submit" class="btn btn-success" value="Submit WhUserTyep">
</pre>
	</form>
	</div>
	</div>
	${message}
</body>
</html>