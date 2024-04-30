<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>3. ServletContext(application) 기본객체를 이용한 파일 읽기</h3>
	
	<%
		String resourcePath = "/jsp04_implict/message/notice.txt";
	%>
	
	실제 경로 : <%= application.getRealPath(resourcePath) %>
	<hr />
	<%= resourcePath %>의 내용 <br />
	<%
	char[] cbuf = new char[128];
	int len = -1;
	
	try(InputStreamReader fr = new InputStreamReader(application.getResourceAsStream(resourcePath), "utf-8")) {
		while((len=fr.read(cbuf)) != -1) {
			out.println(new String(cbuf, 0, len));
		}
		
		
	} catch(Exception e) {
		out.println("에러 발생 : " + e.getMessage());
	}
	%>
	
</body>
</html>