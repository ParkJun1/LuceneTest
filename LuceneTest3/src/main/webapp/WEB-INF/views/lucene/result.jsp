<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>메시지 분석 완료</h1>	
	
	<form id='resultForm'>
		<li><label>아이디</label><input type='text' name='username'></li>
	</form>
	
	<button id='resultBtn'>결과메시지</button>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<p></p>
	<div id='result'></div>
	
	<script>
		$("#resultBtn").on("click", function(event) {
			console.log("1111111111111111111111111111111");
			var $formData = $("#resultForm").serialize();
			var $resultDiv = $("#result");
			
			$.ajax({
				type    : "POST",
				url     : "/luc/result",
				data    : $formData,
				success : function(data) {
					$resultDiv.html("<li><h2>" + data + "</h2></li>");
				}
			});		
		});	
	</script>
	
</body>
</html>