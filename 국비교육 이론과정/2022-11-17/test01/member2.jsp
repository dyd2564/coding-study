<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/* String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email"); */
	//request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 아이디 : <%=id %><br>
비밀번호 : <%=pwd %><br>
이름 : <%=name %><br>
이메일 : <%=email %><br> --%>

아이디 : ${param.id}<br>
비밀번호 : ${param.pwd}<br>
이름 : ${param.name}<br>
이메일 : ${param.email}<br>
주소 : ${param.addr}<br>
<%-- 전공 : <%= request.getAttribute("major") %> --%>
전공 : ${major}
</body>
</html>