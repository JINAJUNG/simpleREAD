<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/common/common.jsp"%>
<body>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>부서 번호</th>
				<th>부서 이름</th>
				<th>부서 설명</th>
				<th>부서 인원</th>
			</tr>
			<c:set var="di" value="diList"></c:set>
			<c:if test="${empty di}">
				<tr>
					<td colspan="5">테이블이 비엇어</td>
				</tr>
			</c:if>
			<c:forEach var="di" items="${diList}">
				<tr>
					<td>${di.diNo}</td>
					<td>${di.diName}</td>
					<td>${di.diDesc}</td>
					<td>${di.diCnt}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>