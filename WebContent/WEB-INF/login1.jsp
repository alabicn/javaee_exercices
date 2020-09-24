<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>TP1 - login</title>
	</head>
	<body>
	
		<c:if test="${ !empty form.result }">
			<p><c:out value="${ form.result }"/></p>
		</c:if>
	
		<form action="Login1" method="post">
			<p>
				<label for="username">Username</label>
				<input type="text" id="username" name="username"/>
			</p>
			<p>
				<label for="pass">Password</label>
				<input type="password" id="pass" name="pass"/>
			</p>
			<input type="submit" value="Submit"/>
		</form>
	</body>
</html>