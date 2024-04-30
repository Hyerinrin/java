<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 1에서부터 10까지의 합계구하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int sum=0;
		for(int i=1;i<=10;i++){
			sum +=i;
		}
	%>
	1~10까지의 합은 <%= sum %>입니다.
	<hr />
	
	<%
		sum=0;
		for(int i=1;i<=100;i++){
			sum +=i;
		}
	%>
	1~100 까지의 합은 <%= sum %>입니다.
</body>
</html>