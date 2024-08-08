<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 정보 조회 (사원 번호 검색)</h1>
	<!-- 원인 : form 태그에 action 속성 미기입 = /search -->
	<form action="/search"> 
							   <!-- 원인 : name 속성 미기입 name="id" -->
		<input type="text" placeholder="사원 번호 입력" name="id"> 
		<input type="submit" value="조회">
	</form>
</body>
</html>