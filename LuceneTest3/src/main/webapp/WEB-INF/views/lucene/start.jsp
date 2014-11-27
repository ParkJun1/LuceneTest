<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script type="text/javascript" src="/resources/js/script.js"></script>
	
</head>
<body>
	
	<h1> 사용자 메시지 입력 </h1>
	
	<form id='msgForm'>
		<li><label>아이디</label> <input type='text' name='username'></li>
		<li><label>메시지</label> <input type='text' name='massage'></li>
	</form>
	
	<button id='inputBtn'>입력</button>
	
	<div id='analyze'></div>
	
</body>
</html>