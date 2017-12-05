<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>homework2</title>
</head>

<body>
	<p>
		<a href="${pageContext.request.contextPath}/creditBySemester">credits
			by year and semester</a>
	</p>
	<!--   이 부분은 어플리케이션의 ContextRoot -->
	<p>
		<a href="${pageContext.request.contextPath}/creditBySeparation">credits
			by separation</a>
	</p>

	<p>
		<a href="${pageContext.request.contextPath}/registerForCourse">register
			for next semester</a>
	</p>

	<p>
		<a
			href="${pageContext.request.contextPath}/showTakes?year=2018&semester=1">show
			registration next semester</a>
	</p>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="javascript:document.getElementById('logout').submit()">Logout</a>
	</c:if>

	<form id="logout" action="<c:url value="/logout" />" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>


</body>

</html>