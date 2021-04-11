<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<body>
	<h2>Change Password</h2>
	
	<form name="input" method="post" action="change_password">
		Enter old password: <input type="password" name="old_password"/><br>
		Enter new password: <input type="password" name="password"/><br>
		Enter re-enter new password: <input type="password" name="password2"/><br>
		<input type="hidden" name="userid" value="${id}"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>