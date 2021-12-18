<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<form action="guess" method="POST">
	<span><c:out value="${error}"/></span>
	<p><input type  = "text" name="code" placeholder="What is the code?"/></p>
	<p><button>Submit</button></p>
	</form>
</body>
</html>