<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp"%>
<body>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>맴버 번호</th>
				<th>맴버 아이디</th>
				<th>맴버 ETC</th>
				<th>맴버 이메일</th>
				<th>부서 번호</th>
			</tr>
			<c:set var="si" value="siList"></c:set>
			<c:if test="${empty si }">
				<tr>
					<td colspan="5">테이블이 비엇어</td>
				</tr>
			</c:if>
			<c:forEach var="si" items="${siList}">
				<tr>
					<td>${si.miNo}</td>
					<td>${si.miId}</td>
					<td>${si.miEtc}</td>
					<td>${si.miEmail}</td>
					<td>${si.diNo}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>