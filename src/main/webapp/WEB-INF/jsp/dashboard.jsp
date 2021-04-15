<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>FlyAway Airline Booking</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	
</head>
<body>
	<div class="container">
	<h2>Welcome ${loggedInUser.username}</h2>
	
	  <div class="form-group col-sm-8">
		<a href="change_password">Change Password</a>
	  </div>
	  <div class="form-group col-sm-8">
		<a href="showPlaces">List of Places</a>
	  </div>
	  <div class="form-group col-sm-8">
		<a href="showAirlines">List of Airlines</a>
	  </div>
	  <div class="form-group col-sm-8">
		<a href="showFlights">List of Flights</a>
	  </div>
	  <div class="form-group col-sm-8">
		<a href="logout_admin">[Logout]</a>
	</div>	
	</div>
</body>
</html>