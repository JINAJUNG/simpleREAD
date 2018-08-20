<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp"%>
<body>
	나는 테스트뷰 제이에스피 파일입니다.
	<br>
	<%=request.getAttribute("teInfo")%><br>
	<c:set var="ti" value="${teInfo}"></c:set>
	<c:if test="${!empty ti}">
		${ti.teNum}<br>
		${ti.teName}<br>
		${ti.teId}<br>
		${ti.teDesc}<br>
	</c:if>
</body>
</html>