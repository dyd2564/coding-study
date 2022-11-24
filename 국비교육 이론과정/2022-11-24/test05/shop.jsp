<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바쇼핑몰</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<c:if test="${empty param.lang or param.lang=='ko'}">
	<fmt:setLocale value="ko_KR"/>
</c:if>

<c:if test="${param.lang=='en' }">
	<fmt:setLocale value="en_US"/>
</c:if>

<fmt:bundle basename="sec01.resources.shop">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">쇼핑몰</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#"><fmt:message key="shop.product.add" /></a></li>
      <li><a href="#"><fmt:message key="shop.product.update" /></a></li>
      <li><a href="#"><fmt:message key="shop.product.list" /></a></li>
      <li><a href="#"><fmt:message key="shop.product.detail" /></a></li>
    </ul>
    <a href="?lang=ko" class="btn btn-danger navbar-btn">
    	<fmt:message key="lang.ko" />
    </a>
    <a href="?lang=en" class="btn btn-danger navbar-btn">
    	<fmt:message key="lang.en" />
    </a>
  </div>
</fmt:bundle>
</nav>
</body>
</html>