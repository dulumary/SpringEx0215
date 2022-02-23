<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리</title>
</head>
<body>
	<h2>조건문 (if else)</h2>
	
	<%-- 몸무게가 70 이하면 치킨 80이하면 샐러드 그게 아니면 굶 --%>
	<c:set var="weight" value="85" />
	<c:choose>
		<%-- if(weight <= 70) --%>
		<c:when test="${weight <= 70 }" >
			<h4>치킨 먹자</h4>
		</c:when>
		<%-- else if(weight <= 70) --%>
		<c:when test="${weight <= 80 }" >
			<h4>샐러드 먹자</h4>
		</c:when>
		<%-- else  --%>
		<c:otherwise>
			<h4>굶어</h4>
		</c:otherwise>
	</c:choose>
	
	<h2>반복문</h2>
	
	<%-- 0 ~ 4 까지 반복 --%>
	<%-- for(int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1" >
		${i } 
	</c:forEach>
	
	<%-- for(Sting fruit:fruits) --%>
	<c:forEach var="fruit" items="${fruits }" varStatus="status" >
		<h3>${fruit }  :::: ${status.count } ${status.index } ${status.first } ${status.last }</h3>
		
	</c:forEach>
	
	
	

</body>
</html>