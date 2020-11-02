<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정 페이지</h1>
검색결과: ${bbsVO2}<br>
<hr>
번호: ${bbsVO2.no}<br>
제목: ${bbsVO2.title}<br>
작성자: ${bbsVO2.writer}<br>
내용: ${bbsVO2.contents}<br>
<a href="index.jsp">처음으로</a>
<a href="delete.do">삭제페이지</a>
</body>
</html>