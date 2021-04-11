<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Flights</title>
</head>
<body>
<div>
		<h2>List of Flights</h2>
		<table>
		<tbody>
			<tr>
				<th>Source</th>
				<th>Destination</th>
				<th>Airline</th>
			</tr>
			<c:forEach items="${flights}" var="flight">
				<tr>
					<td>${flight.source.name}</td>
					<td>${flight.destination.name}</td>
					<td>${flight.airline.name}</td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
</div>		
</body>
</html>