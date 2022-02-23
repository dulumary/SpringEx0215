<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리</title>
</head>
<body>
	<h2>변수 정의하기</h2>
	<%-- int number1 = 100 --%>
	<c:set var="number1" value="100" />
	<c:set var="number2">200</c:set>
	
	<h3>${number1 }</h3>
	<h3>${number2 }</h3>
	
	<%-- 100 + 200 --%>
	<h3>${number1} + ${number2 }</h3>
	
	<%-- 300 --%>
	<h3>${number1 + number2 }</h3>
	
	<h2>변수 출력</h2>
	
	<h3> <c:out value="999" /> </h3>
	<h3> <c:out value="${number1}" /></h3>
	
	<%-- 태그 문구가 그대로 출력 --%>
	<c:out value="<script>alert('출력'); </script>" />
	<c:out value="<script>alert('출력'); </script>" escapeXml="true" />
	<%-- 스크립트가 실행 --%>
	<%-- <c:out value="<script>alert('출력'); </script>" escapeXml="false" />   --%>
	
	<h2> 조건문 </h2>
	<c:if test="true" >
		<h4>조건이 참이다!!</h4>
	</c:if>
	
	<c:if test="${number1 > 50 }" >
		<h4>number1이 50보다 크다</h4>
	</c:if>
	
	<c:if test="${number1 == 100 }" >
		<h4>number1 이 100이다</h4>
	</c:if>
	
	<c:if test="${number1 eq 100}" >
		<h4>number1이 100이다</h4>
	</c:if>
	
	<c:if test="${number1 ne 100 }" >
		<h4>number1은 100이 아니다</h4>
	</c:if>
	
	<c:if test="${!empty number1 }" >
		<h4>number1이 비어 있지 않다</h4>
	</c:if>
	

</body>
</html>