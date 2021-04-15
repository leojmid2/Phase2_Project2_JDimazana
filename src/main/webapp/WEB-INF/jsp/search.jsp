<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Search Flights</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Search for Flights</h2>
	    <p class="text-danger">${message}</p>
 		<form class="form-horizontal" method="post" action="search">
 		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Date of Travel</label>
    		<div class="col-sm-9">
      			<input type="date" class="form-control" id="dot" name="dot" value="${datetoday}">
    		</div>
  		</div>
 		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Number of Passenger</label>
    		<div class="col-sm-9">
      			<input type="number" class="form-control" id="num_passenger" name="num_passenger" value="1" min="1" max="100">
    		</div>
  		</div>
 		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Choose Source</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="source" name="source">
      			<c:forEach items="${places}" var="places">
			    <option value="${places.placeid}">${places.name}</option>
			</c:forEach>	
      			</select>
    		</div>
  		</div>
		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Choose Destination</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="destination" name="destination">
      			<c:forEach items="${places}" var="places">
				    <option value="${places.placeid}">${places.name}</option>
				</c:forEach>	
      			</select>
      			</div>
		</div>
 		 <div class="form-group col-sm-8" align="center">
			<input type="submit" value="Search Flight" class="btn btn-primary"/>
			<input type="reset" value="Clear" class="btn btn-primary"/>
			<a href="/FlyAway">[Back to Main]</a>
			
		</div>	
		</form>
	</div>	
</body>
</html>