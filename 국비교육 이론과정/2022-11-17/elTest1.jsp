<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	블리언 : ${true}, ${false} <br>
	널 : ${null} <br>
	정수와 실수 : ${10}, ${11.2}, ${2+4} <br>
	문자열 : ${"Hello"}, ${'Hello'}<br> <!--  큰 따옴표, 작은 따옴표 둘 다 가능 -->
	
	<h1>표현언어 이스케이프</h1>
	\${10+100}
	
	<h1>연산</h1>
	10+2 : ${10+2} <br>
	9-2 : ${9-2} <br>
	9*2 : ${9*2} <br>
	10/8 : ${10/8} <br>
	
	<h1>문자열 연산</h1>
	<%-- ${'Hello'+' world'} --%> <!-- error  -->
	<%-- ${"Hello"+" world"} --%> <!-- error  -->
	${"Hello"+=" world"}
	
	<h1>숫자형 문자열의 계산</h1>
	"10" + "2" : ${"10"+"2"} <br>
	"10" + 2 : ${"10"+"2"} <br>
	10 + 2 : ${10+"2"} <br>
	
	<h2>null과의 연산</h2>
	${null+10} <br>
	${null+"10"} <br>
	<!-- 숫자, 숫자형 문자와 null 연산시 null값은 0으로 간주함. -->
	
	
</body>
</html>