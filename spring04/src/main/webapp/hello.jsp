<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Hello" method="get">
ID <input type="text" name="id">
PW <input type="text" name="pw">
<button type="submit">get 헬로</button>
</form>
<hr>
<form action="Hello" method="post">
ID <input type="text" name="id">
PW <input type="text" name="pw">
<button type="submit">post 헬로</button>
</form>


</body>
</html>