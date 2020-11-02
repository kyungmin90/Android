<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판</h1>
<form action="insert.do">
번호: <input type="text" name="no"><br>
제목: <input type="text" name="title"><br>
작성자: <input type="text" name="writer"><br>
내용: <input type="text" name="contents"><br>
<button type="submit">확인</button>
</form>
</body>
</html>