<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath() %>/hello/hello.do"> hello</a>
	<br />
	<a href="<%=request.getContextPath() %>/method/method.do"> method</a>
	<br />
	<a href="<%=request.getContextPath() %>/form/joinForm.do"> form </a>
	<br />
	<a href="<%=request.getContextPath() %>/ajax/resBody.do"> 문자열 응답 </a>
	<br />
	<a href="<%=request.getContextPath()%>/ajax/resBody.json"> JSON 응답 </a>
	<br />
	<a href="<%=request.getContextPath() %>/ajax/resVOBody.json"> JSON VO 응답 </a>
	<br />

	<a href="<%=request.getContextPath() %>/ajax/resStringListBody.json"> JSON VO 응답 </a>
	<br />

	<a href="<%=request.getContextPath() %>/ajax/resVOListBody.json"> JSON VO 응답 </a>
	<br />

	<br>
	<br>

	<a href="<%=request.getContextPath() %>/ajax/restBody.do"> 문자열 응답 </a>
	<br />
	<a href="<%=request.getContextPath()%>/ajax/restBody.json"> JSON 응답 </a>
	<br />
	<a href="<%=request.getContextPath() %>/ajax/restVOBody.json"> JSON VO 응답 </a>
	<br />

	<a href="<%=request.getContextPath() %>/ajax/restStringListBody.json"> JSON VO 응답 </a>
	<br />

	<a href="<%=request.getContextPath() %>/ajax/restVOListBody.json"> JSON VO 응답 </a>
	<br />

	<a href="<%=request.getContextPath() %>/file/uploadForm.do"> 파일 업로드 </a>
	<br />

</body>
</html>