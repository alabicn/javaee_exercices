<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>TP1 - liste</title>
	</head>
	<body>
		<form action="Liste" method="post">
			<label>Appuyez sur OK pour continuer</label>
			<input type="submit" value="OK"/>
		</form>
		<c:if test="${ formValid }">
			<p>Mes films préférés : </p>
			<select name="myFilms">
				<c:forEach items="${ films }" var="film">
					<option><c:out value="${ film }" /></option>
				</c:forEach>
			</select>
		</c:if>
	</body>
</html>