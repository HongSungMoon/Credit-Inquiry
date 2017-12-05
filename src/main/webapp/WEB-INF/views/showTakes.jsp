<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/homework.css">
<body>
	<table>
		<tr>
			<th>수강년도</th>
			<th>학기</th>
			<th>교과코드</th>
			<th>교과목명</th>
			<th>구분</th>
			<th>학점</th>
		</tr>
		<c:forEach var="take" items="${takes}">
			<tr>
				<td><c:out value="${take.year }" /></td>
				<td><c:out value="${take.semester }" /></td>
				<td><c:out value="${take.code }" /></td>
				<td><c:out value="${take.subject }" /></td>
				<td><c:out value="${take.separation }" /></td>
				<td><c:out value="${take.credit }" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>