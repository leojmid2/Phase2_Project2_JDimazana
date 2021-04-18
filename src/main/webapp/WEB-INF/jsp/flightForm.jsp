<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Learner's Academy</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>New Flight</h2>
	    <p class="text-danger">${message}</p>	    
 		<f:form class="form-horizontal" method="post" modelAttribute="flight" action="save2Flight">
 		
 		<f:hidden path="flightid"/>
			 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Choose Source</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="source" name="source">
      			<c:forEach items="${places}" var="place">
			    <option value="${place.placeid}">${place.name}</option>
			</c:forEach>	
      			</select>
    		</div>
  		</div>
		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Choose Destination</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="destination" name="destination">
      			<c:forEach items="${places}" var="place">
				    <option value="${place.placeid}">${place.name}</option>
				</c:forEach>	
      			</select>
      			</div>
		</div>
	 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Choose Airline</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="airline" name="airline">
      			<c:forEach items="${airlines}" var="airline">
				    <option value="${airline.airlineId}">${airline.name}</option>
				</c:forEach>	
      			</select>
      			</div>
		</div>
 	 	<div class="form-group col-sm-8" align="center">
			<input type="submit" value="Save" class="btn btn-primary"/>
			<input type="reset" value="Clear" class="btn btn-primary"/>
		</div>	
   	</f:form>
	</div>	
</body>
</html>		
 		
 