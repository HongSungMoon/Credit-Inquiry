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
</head>
<body>
	<table>
		<tr>
		<c:forEach var="take" items="${takes}">
			<th><c:out value="${take.separation }" /></th>
		</c:forEach>
		<th>총학점</th>
		</tr>
		<tr>
		<c:forEach var="take" items="${takes}">
			<td><c:out value="${take.credit }" /></td>
		</c:forEach>
		<td><c:out value="${totalCredit }"/></td>
		</tr>
		
	</table>
</body>
</html>