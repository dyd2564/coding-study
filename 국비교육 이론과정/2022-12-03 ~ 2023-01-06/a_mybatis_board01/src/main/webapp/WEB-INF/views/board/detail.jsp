<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<div class="jumbotron">
		<h1>게시물 조회</h1>
	</div>
	<div>
		<input type="hidden" name="bno" value="${board.bno}">
		번호 : ${board.bno}
	</div>
	<div>
		내용 : ${board.content} 
	</div>
	<div>
		작성자 : ${board.writer} 
	</div>
	<div>
		작성일 : ${board.writeDate} 
	</div>
	<div>
		<button class="modifyForm">수정</button>
		<button class="delProceed">삭제</button>
	</div>
</div>

<script>
$(function(){
	let bno = $('[name="bno"]')
	let form = $("<form/>")
	
	// 수정폼이동
	$('.modifyForm').on('click',function(){
		form.attr("action","${contextPath}/board/modify")
			.attr("method","get")
			.append(bno)
			.appendTo('body')
			.submit()
	})
	
	// 삭제처리
	$('.delProceed').on('click',function(){
		form.attr("action","${contextPath}/board/delete")
			.attr("method","post")
			.append(bno)
			.appendTo('body')
			.submit()
	})
})
</script>

<%@ include file="../layout/footer.jsp" %>

