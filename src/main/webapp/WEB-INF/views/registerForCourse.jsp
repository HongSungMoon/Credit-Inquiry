<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/homework.css">
</head>
<body>
	<sf:form method="post"
		action="${pageContext.request.contextPath}/addTake"
		modelAttribute="take">
		<table>
			<tr>
				<td class="label">년도</td>
				<td><sf:input type="text" path="year" value="2018" /> <br>
					<sf:errors path="year" class="error" /></td>
			</tr>
			<tr>
				<td class="label">학기</td>
				<td><sf:input type="text" path="semester" value="1" /> <br>
					<sf:errors path="semester" class="error" /></td>
			</tr>
			<tr>
				<td class="label">과목코드</td>
				<td><sf:input type="text" path="code" /> <br> <sf:errors
						path="code" class="error" /></td>
			</tr>
			<tr>
				<td class="label">과목이름</td>
				<td><sf:input type="text" path="subject" /> <br> <sf:errors
						path="subject" class="error" /></td>
			</tr>
			<tr>
				<td class="label">과목구분</td>
				<td><sf:input type="text" path="separation" /> <br> <sf:errors
						path="separation" class="error" /></td>
			</tr>
			<tr>
				<td class="label">학점</td>
				<td><sf:input type="text" path="credit" /> <br> <sf:errors
						path="credit" class="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="register" value="수강 신청" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>