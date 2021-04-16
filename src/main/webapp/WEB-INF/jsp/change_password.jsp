<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Change Password</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	
	<div class="form-group form">
	
		<h2>Change Password</h2>
		
		<p class="text-danger">${message}</p>
		
		
		<form name="input" method="post" action="change_password">
		<div>
				<label>Old Password:</label> 
				<input type="password" name="old_password" class="form-control"/>
		</div>
		<div>
				<label>New Password:</label> 
				<input type="password" name="password" class="form-control"/>
		</div>
		<div>
				<label>Re-enter New Password:</label> 
				<input type="password" name="password2" class="form-control"/>
		</div>
		<input type="submit" value="Submit" class="btn btn-primary"/>
		<input type="reset" value="Clear" class="btn btn-primary"/>
		</form>
	</div>	
	</div>	
</body>
</html>