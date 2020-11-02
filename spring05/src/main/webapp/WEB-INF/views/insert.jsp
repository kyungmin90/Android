<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록 정보</h3>
<hr>
번호: ${bbsVO.no}<br>
제목: ${bbsVO.title}<br>
작성자: ${bbsVO.writer}<br>
내용: ${bbsVO.contents}<br>
<a href="index.jsp">처음으로</a>
<a href="update.do">수정페이지</a>
</body>
</html>