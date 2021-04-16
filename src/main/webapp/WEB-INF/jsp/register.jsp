<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Registration</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
    <div class="container">
    <div>
        <h1>Registration</h1>
        
        <p class="text-danger">${message} </p>
        
        <form class="form-horizontal" action="register" method="post">
        
        <div class="form-group col-sm-8">
				<label class="control-label col-sm-3">First Name</label> 
				<div class="col-sm-9">
					<input type="text" name="firstname" class="form-control"/>
				</div>
		</div>
        <div class="form-group col-sm-8">
				<label class="control-label col-sm-3">Last Name</label> 
				<div class="col-sm-9">
					<input type="text" name="lastname" class="form-control"/>
				</div>	
		</div>
        <div class="form-group col-sm-8">
				<label class="control-label  col-sm-3">Email</label> 
				<div class="col-sm-9">
					<input type="text" name="email" class="form-control"/>
				</div>	
		</div>
        <div class="form-group col-sm-8">
				<label class="control-label col-sm-3">Address</label> 
				<div class="col-sm-9">
					<input type="text" name="address" class="form-control"/>
				</div>	
		</div>
        <div class="form-group col-sm-8">
				<label class="control-label col-sm-3">Contact Number</label> 
				<div class="col-sm-9">
					<input type="text" name="telno" class="form-control"/>
				</div>	
		</div>
		
        <div class="col-sm-8" align="center">
                	<input type="submit" value="Register" class="btn btn-primary">
                	<input type="reset" value="Clear" class="btn btn-primary">
                	<a href="/FlyAway/">[Back to Search]</a>
        </div>
        </form>
          
    </div>      
    </div>
</body>
</html>