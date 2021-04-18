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
		<h2>New Place</h2>
	    <p class="text-danger">${message}</p>
	    
	    
 		<f:form class="form-horizontal" method="post" modelAttribute="place" action="savePlace">
 		
 		<f:hidden path="placeid"/>
 		
 		 <div class="form-group col-sm-10">
  		<label class="control-label col-sm-3">Name of Place</label>
    		<div class="col-sm-9">
      			<f:input type="text" class="form-control" id="name" name="name" path="name"/>
    		</div>		 
 		 </div>
 		 <div class="form-group col-sm-10">
  		<label class="control-label col-sm-3">Country</label>
    		<div class="col-sm-9">
      			<f:input type="text" class="form-control" id="country" name="country" path="country"/>
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
 		
 