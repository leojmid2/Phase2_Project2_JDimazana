<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booking Details</title>
</head>
<body>
    <div class="container">
        <h2>Your flight is Successfully Booked!</h2>
        <br>
        <h3>Booking Details:</h3>
        <div class="col-sm-8">
        <table class="table">
            <tr>
                <td>Name:</td>
                <td>${reg.firstname}&nbsp${reg.lastname}</td>
            </tr>
            <tr>
                <td>Date</td>
                <td>${reg.dot}</td>
            </tr>
            <tr>
                <td>Source</td>
                <td>${reg.source}</td>
            </tr>
            <tr>
                <td>Destination</td>
                <td>${reg.destination}</td>
            </tr>
            <tr>
                <td>Airline</td>
                <td>${reg.airline}</td>
            </tr>
            <tr>
            	<td>Price</td>
                <td>$${reg.price}</td>
             </tr>   
            <tr>
            	<td>Number of Passengers</td>
                <td>${reg.num_passenger}</td>
             </tr>   
            <tr>
            	<td>Total Price</td>
                <td>$${reg.totalPrice}</td>
             </tr>   
             </table>
             
             <a href="/FlyAway/">Back to Main</a>
             </div>
    </div>
</body>
</html>