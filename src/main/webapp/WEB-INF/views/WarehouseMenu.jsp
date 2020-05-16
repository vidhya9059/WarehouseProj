<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="base">${pageContext.request.requestURL}</c:set>
<c:set var="url"
	value="${fn:replace(base, pageContext.request.requestURI, pageContext.request.contextPath)}" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<!-- ****************MENU BAR STARTS HERE********* -->

<nav class="navbar navbar-expand-sm bg-info navbar-dark ">
	<!-- Brand -->
	<a class="navbar-brand " href="#"><img
		src="../resources/images/jesus.png" width="100" height="60" /></a>

	<!-- Links -->
	<ul class="navbar-nav">
		



		<!-- **** START: Uom ***-->
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle text-white"
			href="#" id="navbardrop" data-toggle="dropdown"> <b> UOM </b> </a>
			<div class="dropdown-menu">
				<a class="dropdown-item " href="${url}/uom/register">Register</a> 
				<a class="dropdown-item" href="${url}/uom/all">View All</a>
				<a class="dropdown-item" href="${url}/uom/charts">Charts</a>
				<a class="dropdown-item" href="${url}/uom/edit">Edit</a>
		    	<%-- <a class="dropdown-item" href="${url}/uom/view">View</a>
			 --%>
			</div>
       </li>
       <!--** END UOM **-->
       
       
       
       
       <!-- **** START: OM ***-->
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle text-white"
			href="#" id="navbardrop" data-toggle="dropdown"> <b> ORDER METHOD </b> </a>
			<div class="dropdown-menu">
				<a class="dropdown-item " href="${url}/ordermethod/register">Register </a> 
					<a class="dropdown-item" href="${url}/ordermethod/all">View All</a>
				<a class="dropdown-item" href="${url}/ordermethod/charts">Charts</a>
			<a class="dropdown-item" href="${url}/ordermethod/edit">Edit</a>
				<%-- <a class="dropdown-item" href="${url}/ordermethod/view">View</a>
			 --%>
			
			</div>
       </li>
       <!--** END OM **-->
       
       
       
       <!-- **** START: Shipment Type ***-->
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle text-white"
			href="#" id="navbardrop" data-toggle="dropdown"> <b> SHIPMENT TYPE </b> </a>
			<div class="dropdown-menu">
				<a class="dropdown-item " href="${url}/shipmenttype/register">Register</a> 
				<a class="dropdown-item" href="${url}/shipmenttype/all">View All</a>
				<a class="dropdown-item" href="${url}/shipmenttype/charts">Charts</a>
			<a class="dropdown-item" href="${url}/shipmenttype/edit">Edit</a>
				<a class="dropdown-item" href="${url}/shipmenttype/pdf">PDF</a>
			
			</div>
       </li>
       <!--** END : Shipment Type **-->
       
        <!-- **** START: WhUserType ***-->
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle text-white"
			href="#" id="navbardrop" data-toggle="dropdown"> <b> WHUSER TYPE </b> </a>
			<div class="dropdown-menu">
				<a class="dropdown-item " href="${url}/whusertype/register">Register</a> 
				<a class="dropdown-item" href="${url}/whusertype/all">View All</a>
				<a class="dropdown-item" href="${url}/whusertype/charts">Charts</a>
			<a class="dropdown-item" href="${url}/whusertype/edit">Edit</a>
				<a class="dropdown-item" href="${url}/whusertype/excel">Excel</a>
			
			
			</div>
       </li>
       <!--** END : WhUser Type **-->
       
       <!-- **** START: Part Page ***-->
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle text-white"
			href="#" id="navbardrop" data-toggle="dropdown"> <b> PART </b> </a>
			<div class="dropdown-menu">
				<a class="dropdown-item " href="${url}/part/register">Register</a> 
				<a class="dropdown-item" href="${url}/part/all">View All</a>
				<a class="dropdown-item" href="${url}/part/charts">Charts</a>
				<a class="dropdown-item" href="${url}/part/edit">Edit</a>
			<a class="dropdown-item" href="${url}/part/excel">Excel view</a>
			<a class="dropdown-item" href="${url}/part/pdf">Pdf view</a>
			
			</div>
       </li>
       <!--** END :Part **-->
       
       <!-- **** START: pucrchase Page ***-->
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle text-white"
			href="#" id="navbardrop" data-toggle="dropdown"> <b> PURCHASE </b> </a>
			<div class="dropdown-menu">
				<a class="dropdown-item " href="${url}/purchase/register">Register</a> 
				<a class="dropdown-item" href="${url}/purchase/all">View All</a>
				<a class="dropdown-item" href="${url}/purchase/charts">Charts</a>
				<a class="dropdown-item" href="${url}/purchase/edit">Edit</a>
			<a class="dropdown-item" href="${url}/purchase/excel">Excel view</a>
			<a class="dropdown-item" href="${url}/purchase/pdf">Pdf view</a>
			<a class="dropdown-item" href="${url}/purchase/parts">Parts</a>
			
			
			</div>
       </li>
       <!--** END :Part **-->
       
       <!-- Documents -->
       <li class="nav-item"><a class="nav-link text-white" href="${url}/document/register"><b>DOCUMENTS</b></a></li>
       
       		<!-- Logout Link -->
		<li class="nav-item"><a class="nav-link text-white" href="${url}/logout"><b>LOGOUT</b></a></li>
		
	</ul>
	
</nav>