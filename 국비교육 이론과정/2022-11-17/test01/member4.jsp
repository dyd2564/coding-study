<%@ page import="sec01.ex01.MemberBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="m1" class="sec01.ex01.MemberBean" />
<jsp:setProperty property="*" name="m1" />
<jsp:useBean id="memberList" class="java.util.ArrayList" />
<%
	MemberBean m2 = new MemberBean();
	m2.setId("son");
	m2.setPwd("1234");
	m2.setName("손흥민");
	m2.setEmail("son@exmaple.com");
	memberList.add(m1);
	memberList.add(m2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><br>
	<h3>첫 번째 회원</h3>
	아이디 : ${memberList[0].id}<br>
	비밀번호 : ${memberList[0].pwd}<br>
	이름 : ${memberList[0].name}<br>
	이메일 : ${memberList[0].email}<br>
</div><br><br>
<div>
	<h3>두 번째 회원</h3>
	아이디 : ${memberList[1].id}<br>
	비밀번호 : ${memberList[1].pwd}<br>
	이름 : ${memberList[1].name}<br>
	이메일 : ${memberList[1].email}<br> 
</div>

</body>
</html>