<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Admin Login</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
	<div class="form-group form">
		<h2>Log in as Admin</h2>
		<p class="text-danger">${message}</p>
		
		<form name="input" method="post" action="login_admin">
			<div>
				<label>Username:</label> 
				<input type="text" name="username" class="form-control"/>
			</div>
			<div>
			<label>Password:</label> 
			<input type="password" name="password" class="form-control"/>
			</div>
			<br>
			<div>
				<input type="submit" value="Submit" class="btn btn-primary"/>
				<input type="reset" value="Clear" class="btn btn-primary"/>
				<a href="/FlyAway/">Back to Main</a>
			</div>
		</form>
	</div>
	</div>	
</body>
</html>