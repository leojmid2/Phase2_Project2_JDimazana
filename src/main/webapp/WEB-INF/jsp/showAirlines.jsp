<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Airlines</title>
</head>
<body>
<div>
		<h2>List of Airlines</h2>
		<table>
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
</div>		
</body>
</html>