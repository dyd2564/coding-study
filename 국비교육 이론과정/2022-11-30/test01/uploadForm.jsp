<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${contextPath}/upload" method="post" enctype="multipart/form-data">
	파일 1 : <input type="file" name="file1"><br>
	파일 2 : <input type="file" name="file2"><br>
	제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="content"><br>
	작성자 : <input type="text" name="writer"><br>
	<button>전송</button>
</form>

</body>
</html>