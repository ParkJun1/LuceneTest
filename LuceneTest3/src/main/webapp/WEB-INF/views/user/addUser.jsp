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
	
	<h1>회원 가입 페이지</h1>
	
	<form id='addUserForm'>
		<li>아이디 <input type='text' name='user_id'></li>
		<div id='check'></div>
		<li>비밀번호 <input type='password' name='password'></li>
		<li>이메일 <input type='text' name='email'></li>
		<li>휴대전화 <input type='text' name='phone_num'></li>
		
		<input type='submit' value='회원 가입'>
		<input type='reset' value='되돌리기'>
	</form>

</body>
</html>