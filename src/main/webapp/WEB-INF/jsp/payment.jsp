<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <h1>New Customer</h1>
        <form action="payment" method="post">
        <table>
            <tr>
                <td>Name on the Card:</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>Type of Card:</td>
                <td><input type="text" name="type" /></td>
            </tr>
            <tr>
                <td>Card Number:</td>
                <td><input type="number" name="ccnumber" /></td>
            </tr>
            <tr>
                <td>Expiration Date:</td>
                <td><input type="date" name="ccdate" /></td>
            </tr>
            <tr>
            	<td>CVV CODE</td>
                <td><input type="number" name="cvv" /></td>
            <tr>
                <td colspan="2" align="center">
                	<input type="submit" value="Pay Now">
                </td>
                               <td colspan="2" align="center">
                	<input type="reset" value="Clear">
                </td>
  
            </tr>
        </table>
        </form>
           <a href="search">[Back to Search]</a>
 
    </div>
</body>
</html>