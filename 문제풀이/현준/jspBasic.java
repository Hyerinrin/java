<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1. JSP로 "Hello, World!" 출력하기 -->
	<h3>"Hello, World"</h3>
	 <hr />
	 
	<!-- 2. JSP에서 아래의 변수를 만들어서 사용하기 -->
	<% String name = "John";%>
	Hello, <%= name %>
	 <hr />
	 
	<!-- 3. 아래의 조건문을 JSP에서 사용하기 -->
	<% boolean weather = true; %><br />
	
	<%  if(weather) { %>
	         우산을 가져가라
	<%   
		} else { 
	%>
	         우산을 가져가지마라
	<% 
	   }
    %>
    <hr />
    
    <!-- 4. JSP에서 반복문(for 또는 while) 사용하기 -->
    <%
    	for(int i=1; i<=5; i++) {
    %>
        	<p> item <%=i %></p>
    <%
    	}
    %>
     <hr />
     
    <!-- 5. JSP에서 아래의 배열  선언 후 for문으로 출력하기 -->
    <% String[] fruits = {"Apple", "Banana", "Orange"}; %>
    
    <% 
    for(int i=0;i<fruits.length;i++) {
    %>
    	<h3><%= fruits[i] %></h3>
    <%
    }
    %>
    <hr />
    <!-- 6. JSP에서 아래의 함수(메소드) 정의하고 호출하기 (<%! %>)-->
    <%!
    	int add(int a, int b) {
    
        	 return a + b;
    	}
    %>
	Results : 	<%= add(3,5) %>
	 <hr />
	        
    <!-- 7. JSP에서 HTML 폼(form) 사용하기 -->
    문제 .7
    
    <form action="<%= request.getContextPath()%>/WEB-JSP/userInfo.jsp" method="post">
    	<table>
    		<tr>
    			<th>이름</th>
    			<td><input type="text" name="name" size=10 /></td>
    		</tr>
    		<tr>
    			<th>주소</th>
    			<td><input type="text" name="addr" size=20 /></td>
    		</tr>
    		<tr>
    			<th>취미</th>
    			<td><input type="text" name="hobby" size=10 /></td>
    		</tr>
    		<tr>
				<td colspan="4" align="center">
					<input type="submit" value="회원가입"/>
				</td>
			</tr>
    	</table>
    	
    </form>
    
     <hr />
    <!-- 8. JSP에서 예외 처리하기 -->
    <!--
    8. JSP에서 예외 처리하기
    int result = 5 / 0를 try catch문을 사용하여 예외 처리하기
    출력문 >> 오류 발생 : / by zero
     -->
 
   <% 
    String errorMessage = "";
    try {
        int result = 5 / 0;
    } catch(Exception e) {
        errorMessage = "오류 발생 : " + e.getMessage();
    }
%>
<%= errorMessage %>

</body>
</html>

