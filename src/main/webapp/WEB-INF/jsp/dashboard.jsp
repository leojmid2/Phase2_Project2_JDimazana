<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FlyAway Airline Booking</title>
</head>
<body>
	<br>
	<br>
	<div
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
 
		Welcome ${user.username}
		
	</div>
	<br>
	<a href="change_password?id=${user.userid}">Change Password</a>
	<br>
	<a href="showPlaces">List of Places</a>
	<br>
	<a href="showAirlines">List of Airlines</a>
	<br>
	<a href="showFlights">List of Flights</a>
	<input type="hidden" name="userid" value="${user.userid}"/>
	
	
	
</body>
</html>