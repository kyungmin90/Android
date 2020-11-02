<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.do">
	<h2>상품 등록</h2>
	no <input type="text" name="no">
	name <input type="text" name="name">
	content <input type="text" name="content">
	price <input type="text" name="price">
	<button type="submit">확인</button>
	</form>
	
	<hr color="red">
	
	
	<form action="update.do">
	<h2>상품 수정</h2>
	no <input type="text" name="no" placeholder="아이디 기준으로 가격을 수정">
	price <input type="text" name="price">
	<button type="submit">확인</button>
	</form>
	
	<hr color="red">
	
	<form action="delete.do">
	<h2>상품 삭제</h2>
	no <input type="text" name="no">
	<button type="submit">확인</button>
	</form>
	
	<hr color="red">
	
	<form action="one.do">
	<h2>번호로 검색</h2>
	no <input type="text" name="no">
	<button type="submit">확인</button>
	</form>
	
	<hr color="red">
	
	<form action="list.do">
	<h2>전체검색</h2>
	<button type="submit">전체검색!!!</button>
	</form>
	
	
</body>
</html>