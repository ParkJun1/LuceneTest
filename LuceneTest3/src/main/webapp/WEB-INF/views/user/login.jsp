<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	
	<form id='loginForm' action="/login/login" method="post">
    	<li><label>아이디</label> <input type='text' name='user_id' id='user_id'></li>
		<li><label>비밀번호</label> <input type='password' name='password' id='password'></li>
		<div id='check'></div>
    	<!-- <input type='button' value="로그인" onclick="javascript:login()" /> --> 
    	<input type='submit' value="로그인"/>
	</form>
	
</body>
</html>