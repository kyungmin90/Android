<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<form action="create2.do">
ID: <input type="text" name="id"><br>
PW: <input type="text" name="pw"><br>
NAME: <input type="text" name="name"><br>
TEL: <input type="text" name="tel"><br>
<button type="submit" style="width: 200px; height: 50px; background-color: red; color: white;">
회원가입</button>
</form>

<h1>회원삭제</h1>
<form action="delete.do">
ID: <input type="text" name="id"><br>
<button type="submit" style="width: 200px; height: 50px; background-color: black; color: white;">
삭제</button>
</form>

<h1>회원수정</h1>
<form action="update.do">
ID: <input type="text" name="id"><br>
TEL: <input type="text" name="tel"><br>
<button type="submit" style="width: 200px; height: 50px; background-color: steelblue; color: white;">
수정</button>
</form>

<h1>회원검색</h1>
<form action="one2.do">
ID: <input type="text" name="id"><br>
<button type="submit" style="width: 200px; height: 50px; background-color: darkgray; color: white;">
검색</button>
</form>
<br>
<a style="font-size: 20px; font-weight: bold;" href="list2.do">전체회원검색>></a>
</body>
</html>