<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	if ("${msg}") {
		alert("${msg}");
	}
</script>
</head>
<body>
<body>
<h1>회원 정보</h1>
id : ${member.id}<br />
password : ${member.password}<br />
name : ${member.name}<br />
</body>
</body>
</html>