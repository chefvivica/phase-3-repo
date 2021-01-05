<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>

<body>
	<h1>Register as a new user</h1>
	<form method="post">
		Name: <input type="text" name="uname" required="required"><br />
		Email: <input type="email" name="email" required="required"><br />
		Password: <input type="password" name="pass" required="required"><br />
		City: <input type="text" name="city" required="required"><br />
		<button type="submit">Submit</button>
	</form>
</body>

</html>