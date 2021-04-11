<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Flights</title>
</head>
<body>
	<div style="text-align: center">
		<h1>Search for Flight</h1>
		<form name="input" method="post" action="login_admin">
			Date of Travel:<input type="text" name="dot"/><br>
			Number of Passenger<input type="text" name="num_passenger"/><br>
			Source: <input type="text" name="source"/><br>
			Destination:<input type="text" name="destination"/><br>
			Airline:<input type="text" name="airline"/><br>
			<input type="submit" value="Book Flight"/>
		</form>
	</div>	
</body>
</html>