<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Response</title>
</head>
<body>
	User registered successfully. User details are:
	<%=request.getAttribute("user")%>
</body>
</html>