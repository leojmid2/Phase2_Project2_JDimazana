<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Error Page for FlyAway Airline Booking</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<br>
	<div class="container">
		<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
	 		<h2>Error: ${message}</h2>
		</div>
		<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
	 		<a href="${back}">Return to previous page</a>
	 	</div>
	 </div>	
</body>
</html>