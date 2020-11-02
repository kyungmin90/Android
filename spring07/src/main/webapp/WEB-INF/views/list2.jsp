<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>전체 검색 정보</h2>
<hr>
<c:forEach var="vo" items="${list}">
아이디: ${vo.id },
비밀번호: ${vo.pw },
이름: ${vo.name },
전화번호: ${vo.tel }<br>
</c:forEach>
</body>
</html>