<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/out.css" />
<script type="text/javascript">

$(function() { //dom tree 로딩 후 
	//alert("환영합니다")
	$('#b1').click(function() {
		replyValue = $('#reply').val()
		$.ajax({
			url: "reply.do",
			data: {
				reply: replyValue
			},
			success: function(result) {
				$('#d1').append(result)
			}
			
		})
	})
	
	$('#b2').click(function() {
		idValue = $('#id').val()
		$.ajax({
			url: "id.do",
			data: {
				id: idValue
			},
			success: function(result) {
				$('#iddiv').empty();
				$('#iddiv').append(result);
			}
			
		})
	})
	
	
	
	
	
})

</script>
<body>
<h1>좋아하는 영화</h1>
<form action="movie.do">
제목: <input type="text" name="title"><br>
가격: <input type="text" name="price"><br>
<button type="submit">확인</button>
</form>
<!-- 댓글 -->
<hr color="blue">

댓글: <input type="text" id="reply">
<button id="b1">댓글달기</button>
<br>
<div id="d1"></div>
<hr>
<!-- ID 입력 -->

ID 확인: <input type="text" name="id" id="id"> <button id="b2">중복확인</button><br>

<div id="iddiv"></div>

 
</body>
</html>