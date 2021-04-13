<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <h1>New Customer</h1>
        <form action="register" method="post">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstname" /></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastname" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" /></td>
            </tr>
            <tr>
            	<td>Contact Number</td>
                <td><input type="text" name="address" /></td>
            <tr>
                <td colspan="2" align="center">
                	<input type="submit" value="Register">
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