<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>웹어플리케이션의 경로 구하기</h1>
	ContextPath = <%= request.getContextPath()%>
	URI =  <%= request.getRequestURI() %>
	URL =  <%= request.getRequestURL() %>
</body>
</html>