/**
 * 
 */

function loginView() {
	
	var div = document.getElementById("login");
	
	if(div.innerHTML !== ""){
		div.innerHTML = "";	
		return;
	}
	
	var xhr = (typeof XMLHttpRequest != 'undefined') ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
	
	xhr.open('GET', '/login/start', true);
 	
	xhr.onreadystatechange = function() {
    	var status;
    	var data;
    	if (xhr.readyState == 4) { 
      		status = xhr.status;
     		 if (status == 200) {
        		data = xhr.responseText; 
        		div.innerHTML = data;
     		 } else {
        		alert("실패");
      		}
    	}
	};
  xhr.send();	
}

function addUserView() {
	
	var div = document.getElementById("addUser");
	
	if(div.innerHTML !== ""){
		div.innerHTML = "";	
		return;
	}
	
	var xhr = (typeof XMLHttpRequest != 'undefined') ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
	
	xhr.open('GET', '/login/addUser', true);
 	
	xhr.onreadystatechange = function() {
    	var status;
    	var data;
    	if (xhr.readyState == 4) { 
      		status = xhr.status;
     		 if (status == 200) {
        		data = xhr.responseText; 
        		div.innerHTML = data;
     		 } else {
        		alert("실패");
      		}
    	}
	};
  xhr.send();	
}

function login() {
	
	var $formData = $("#loginForm").serialize();
	console.log("1");
	$.ajax({
		type:"post",
		url: "/login/login",
		data: $formData, 
		success: function(data){
			if(data == '아이디 혹은 비밀번호가 일치하지 않습니다.' ) {
				console.log("2");
				$("#check").html(data)
				$("#use_id").html("");
				$("password").html("")
			} else {
				
			}
			
		}
  });
}

//function logout(){
//	console.log("들어오네");
//	$.ajax({
//		type:"GET",
//		url:"/login/logout"
//	}).done(function(res){
//		if(res.redirect){
//            window.location.href = response.redirect;
//        }
//	}).fail(function(res){
//		console.log(res);
//		console.log("실패");
//	});
//	console.log("나가네");
//}