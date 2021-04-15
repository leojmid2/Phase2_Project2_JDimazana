<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Airlines</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container" align="center">
		<h2>List of Airlines</h2>
		<table class="table table-hover">
		<tbody>
			<tr>
				<th>Name</th>
			</tr>
			<c:forEach items="${airlines}" var="airline">
				<tr>
					<td>${airline.name}</td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
	<br>
	<a href="logout_admin">[Logout]</a>

	</div>	
		
</body>
</html>