<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	

	<div class="container">
		<h2>Flights</h2>
		<table class="table table-hover">
		<tbody>
			<tr>
				<th>Source</th>
				<th>Destination</th>
				<th>Airlines</th>
				<th>Price</th>
				<th>Passengers</th>
				<th>Total Price</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${flights}" var="flight">
				<tr>

					<td>${flight.source.name}</td>
					<td>${flight.destination.name}</td>
					<td>${flight.airline.name}</td>
					<td>$${flight.price}</td>
					<td>${num_passenger}</td>
					<td>$${num_passenger*flight.price}</td>
					<td><a href="register?id=${flight.flightid}">Book Flight</a></td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
		<h5><a href="search">[Back to Search]</a></h5>
	</div>
</body>
</html>