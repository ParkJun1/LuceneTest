<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script type="text/javascript" src="/resources/js/mainScript.js"></script>
	
	
</head>

<body>
	<h1>메인 페이지</h1>
	
	<div align="right">
		<c:if test='${userName == null}'> 
			<input type='button' value='로그인' onclick="javascript:loginView()"/>
			<input type='button' value='회원가입' onclick="javascript:addUserView()"/>
		</c:if>
		<c:if test='${userName != null}'>
			${userName} 님, 환영합니다.
			<a href="http://localhost:8080/login/logout">로그아웃</a>
		</c:if>
	</div>
	
	<label><h2> 여기는 메인 페이지 입니다.....</h2></label>
	
	<a href="http://localhost:8080/luc/start"><h2>write</h2></a>
	
	<div id='login'></div>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<div id='addUser'></div>
	
</body>
</html>