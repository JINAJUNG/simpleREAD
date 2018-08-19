<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/common/common.jsp"%>
<body>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>lvl</th>
				<th>lvl 이름</th>
				<th>lvl 설명</th>
			</tr>
			<c:set var="li" value="liList"></c:set>
			<c:if test="${empty li}">
				<tr>
					<td colspan="5">테이블이 비엇어</td>
				</tr>
			</c:if>
			<c:forEach var="li" items="${liList}">
				<tr>
					<td>${li.lvl}</td>
					<td>${li.liName}</td>
					<td>${li.liDesc}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>