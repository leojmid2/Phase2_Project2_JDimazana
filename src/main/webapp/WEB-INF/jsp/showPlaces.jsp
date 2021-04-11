<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Places</title>
</head>
<body>
<div>
		<h2>List of Sources and Destinations</h2>
		<table>
		<tbody>
			<tr>
				<th>Name</th>
				<th>Country</th>
			</tr>
			<c:forEach items="${places}" var="place">
				<tr>
					<td>${place.name}</td>
					<td>${place.country}</td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
</div>		
</body>
</html>