//index.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <form action="welcome.jsp" method="post">
        이름을 입력해주세요: <input type="text"  name="My name">
        <input type="submit" value="Submit">
    </form>
</body>
</html>

---------------------------------------------------------
//welcome.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>

<body>
    <% 
        request.setCharacterEncoding("UTF-8");
    
        String name = request.getParameter("name");
        if (name != null && !name.isEmpty()) { //이름 입력칸이 비어있지 않다는 조건
            session.setAttribute("name", name);
            %>
            <h2>반갑습니다, <%= name %>님</h2>
            <% 
        } else {
            %>
            <h3>이름을 입력받지 못했습니다</h3>
            <%
        }
    %>
</body>
</html>
