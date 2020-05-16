<!-- JQuery Validation Example: -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
   <head>
<!--         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 -->   </head>
   <body>
   <%@include file="WarehouseMenu.jsp" %>
        <div class="container">
            <h2>Welcome to UomType Register Page</h2>
            <form action="save" method="POST">            
            <div class="row">
                <div class="col-4">UOM TYPE:
                    
                </div>
                <div class="col-4">
                   <!--  <input type="text" id="uomtype" name="uomtype" class="form-control"/>
                    --> 
                    <select name="uomtype" id="uomtype" class="form-control">
          <option value="">-SELECT-</option>
          <option value="PACKING">PACKING</option>
          <option value="NO PACKING">NO PACKING</option>
          <option value="NA">-NA-</option>
          </select>
                    
                </div>
                <div class="col-4" id="uomtypeError">

                </div>
            </div>

            <div class="row">
                <div class="col-4">
                    UOM MODEL                    
                </div>
                <div class="col-4">
                    <input type="text" id="uommodel" name="uommodel" class="form-control" />                    
                </div>
                <div class="col-4" id="uommodelError">

                </div>
            </div>

  <div class="row">
                <div class="col-4">
                    DESCRIPTION:                    
                </div>
                <div class="col-4">
                    <input type="text" id="descreption" name="descreption" class="form-control" />                    
                </div>
                <div class="col-4" id="descreptionError">

                </div>
            </div>
 


    <script type="text/javascript">
        $(document).ready(function(){
            //1. Hide Error Section
            $("#uomtypeError").hide();
            $("#uommodelError").hide();
            $("#descreptionError").hide();

            //2. create boolean variable for ErrorSection
            var uomtypeError = true;
            var uommodelError = true;
            var descreptionError = true;
            //3. Link event to Input
            $("#uomtype").keyup(function(){
                //call here
                validate_uomtype()
            });
            $("#uommodel").keyup(function(){
                //5. call validate method
                validate_uommodel();
            });
            $("#descreption").keyup(function(){
            	//call validate
            	validate_descreption();
            });

            //4. define validate function
            function validate_uomtype(){
                var val=$("#uomtypeError").val();
                var exp=/^[A-Za-z]{0-9}$/;
                if(val==''){
                    $("#uomtypeError").show();
                    $("#uomtypeError").html("UomType <b>can not be empty</b>");
                    $("#uomtypeError").css("color","red");
                    empIdError = false;
                }else if(!exp.test(val)){
                    $("#uomtypeError").show();
                    $("#uomtypeError").html("UomType <b>must be numaric only</b>")
                    $("#uomtypeError").css("color","red");
                    empIdError = false;
                }else{
                    $("#uomtypeError").hide();
                    uomtypeError = true;
                }
                return uomtypeError;
            }

            function validate_uommodel(){
                //read Input value
                var val=$("#uommodel").val();
                var exp=/^[A-Z]{2,5}$/;
                               
                //check for  empty
                if(val==''){
                    $("#uommodelError").show();
                    $("#uommodelError").html("UomType <b>can not be empty</b>");
                    $("#uommodelError").css("color","red");
                    uommodelError = false;
                }
                else if(!exp.test(val)){
                    $("#uommodelError").show();
                    $("#uommodelError").html("UomType <b>is not valid</b>")
                    $("#uommodelError").css("color","red");
                    empNameError = false;
                }else{
                    $("#uommodelError").hide();
                    uommodelError = true;
                }
                return uommodelError;
            }
            function validate_descreption(){
            	//read input value
            	var val=$("#descreption").val();
            	var exp=/^[A-Za-z]{1,120}$/;
            	//check for empty
            	if(val==''){
            		$("#descreptionError").show();
            		$("#descreptionError").html("Description <b>is not empty</b>");
            		$("#descreptionError").css("color","red");
            		descreptionError =false;
            	}else if(!exp.test(val)){
            		$("#descreptionError").show();
            		$("#descreptionError").html("Description <b>is not valid</b>")
            		$("#descreptionError").hide();
            		descreptionError=false;
            	}else{
                    $("#descreptionError").hide();
                    descreptionError = true;
                }
            	return descreptionError;
            }
        });
    </script>  
    <input type="submit" class="btn btn-info" value="Create UomType"/>
    </form>
    ${msg}
    </div>          

   </body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head><body>
<div class="container">
<div class="card">


<div class="card-header bg-success text-blue">
	<h3>Welcome to UomType Register page</h3>
	</div>
	<div class="card-body bg-primary text-white">
	
	<form action="save" method="POST">
		<pre>
		
UomType  :<select name="uomtype">
          <option value="SELECT">-SELECT-</option>
          <option>PACKING</option>
          <option>NO PACKING</option>
          <option>-NA-</option>
          </select>
UomModel   :<input type="text" name="uommodel" />
Description:<textarea name="descreption"></textarea>
<input type="submit" value="Register">
		</pre>
	</form>
	</div>
	${msg}
	</div>
	</div>
</body>

</html> --%>