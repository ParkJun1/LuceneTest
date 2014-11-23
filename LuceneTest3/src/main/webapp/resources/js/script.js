/**
 * 
 */


//function writeData() {
	
//	document.msgForm.method = "post";
//	document.msgForm.action = "/luc/input";
//	document.msgForm.submit();
		
/*	var div = document.getElementById("wordList");
	
	var xhr = (typeof XMLHttpRequest != 'undefined') ? new XMLHttpRequest() : new ActiveXObject('Microsoft.XMLHTTP');
	xhr.open('POST', '/luc/analyze', true);
 	
	xhr.onreadystatechange = function() {// 비동기를할때 이벤트를 쓰기때문에 콜백을 쓴다.
    	var status;
    	var data;
    	if (xhr.readyState == 4) { 
      		status = xhr.status;
     		 if (status == 200) {
        		data = xhr.responseText; // 이 안의 내용이 이벤트가 된다.
        		//document.getElementById("ajaxRead").innerHTML = data;
        		div.innerHTML = data;
     		 } else {
        		alert("실패");
      		}
    	}
	};
  xhr.send();*/
 $(document).ready(function() {	
	 
	//console.log("1111111111111111111111111111111111");
	$("#inputBtn").on("click", function(event) {
		//console.log("22222222222222222222222222222222");
		var $formData = $("#msgForm").serialize();
		var $analyzeDiv = $("#analyze");
		
		$.ajax({
			type    : "POST",
			url     : "/luc/input",
			data    : $formData,
			success : function(data) {
				//console.log(data);
				$analyzeDiv.html(data);
			}
		});
		//console.log("3333333333333333333333333333333");
	});
	
/*	$("#resultBtn").on("click", function(event) {
		console.log("1111111111111111111111111111111");
		var $formData = $("#resultForm").serialize();
		var $resultDiv = $("#result");
		
		$.ajax({
			type    : "POST",
			url     : "/luc/result",
			data    : $formData,
			success : function(data) {
				//console.log(data);
				$resultDiv.html(data);
			}
		});		
	});*/
	
 });	
//}

