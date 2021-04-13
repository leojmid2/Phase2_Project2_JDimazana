<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Flights</title>
</head>
<body>
<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
 		<form name="input" method="post" action="search">
			<label for="dot">Date of Travel:</label>
			<input type="date" name="dot" value="${datetoday}" /><br>
			<label for="num_passenger">Enter a Number of Passenger:</label>
			  <!-- select id="num_passenger" name="num_passenger">
			    <option value="1">1</option>
			    <option value="2">2</option>
			    <option value="3">3</option>
			    <option value="4">4</option>
			  </select-->
			  <input type="number" name="num_passenger" value="1" min="1" max="100">
			  
			  <br>
			<label for="source">Choose a Source:</label>
			<select id="source" name="source">
			<c:forEach items="${places}" var="places">
			    <option value="${places.placeid}">${places.name}</option>
			</c:forEach>	
			</select>
			<br>
 			<label for="destination">Choose a Destination:</label>
			<select id="destination" name="destination">
				<c:forEach items="${places}" var="places">
			    <option value="${places.placeid}">${places.name}</option>
			</c:forEach>	
			</select>
			<br>
		<!-- 
			<label for="airline">Choose a Airlines:</label>
			<select id="airline" name="airline">
			<c:forEach items="${airlines}" var="airline">
			    <option value="${airline.airlineId}">${airline.name}</option>
			</c:forEach>	
			</select>
			<br>
		-->
			<input type="submit" value="Search Flight"/>
			<input type="reset" value="Clear"/>
		</form>
	</div>	
</body>
</html>