<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<title>Registration</title>
</head>
<body>
    <div class="container">
        <h1>Payment Details</h1>
        
        <p class="text-danger">${message} </p>
        
        <form class="form-horizontal" action="payment" method="post">
        
		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Name on the Card</label>
    		<div class="col-sm-9">
      			<input type="text" class="form-control" id="name" name="name">
    		</div>
  		</div>
     		 <div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Type of Card</label>
    		<div class="col-sm-9">
    			<select id="type" name="type" class="form-control">
			    <option value="VS">VISA</option>
			    <option value="MC">Master Card</option>
			    <option value="DS">Discover</option>
			    <option value="AE">American Express</option>
				</select>    			
    		</div>
  		</div>
  	 	<div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Credit Card Number</label>
    		<div class="col-sm-9">
      			<input type="text" class="form-control" id="ccn" name="ccn">
    		</div>
  		</div>
  	 	<div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Expiration Date</label>
    		<div class="col-sm-9">
      			<input type="date" class="form-control" id="exp" name="exp">
    		</div>
  		</div>
  	 	<div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">CVV CODE</label>
    		<div class="col-sm-9">
      			<input type="text" class="form-control" id="cvv" name="cvv">
    		</div>
  		</div>
  	 	<div class="form-group col-sm-8" align="center">
    		 <input type="submit" value="Pay Now" class="btn btn-primary">
             <input type="reset" value="Clear"class="btn btn-primary">
             <a href="search">[Back to Search]</a>
             
  		</div>
        
       </form>
 
    </div>
</body>
</html>