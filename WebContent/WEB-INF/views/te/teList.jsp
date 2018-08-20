<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp"%>
<body>
	<div class="container">
		<div class="container">
			<select id="teType">
				<option value="teNum">번호</option>
				<option value="teName">이름</option>
				<option value="teId">아이디</option>
				<option value="teDesc">설명</option>
			</select> <input type="text" id="teText">
			<button onclick="searchbtn()">검색</button>

		</div>
		<table class="table table-bordered table-hover">
			<tr>
				<th>te번호</th>
				<th>te이름</th>
				<th>te아이디</th>
				<th>te설명</th>
			</tr>

			<c:set var="ti" value="${tiList}"></c:set>
			<c:forEach var="ti" items="${tiList}">
				<tr onclick="goPage(${ti.teNum})">
					<th>${ti.teNum}</th>
					<th>${ti.teName}</th>
					<th>${ti.teId}</th>
					<th>${ti.teDesc}</th>
				</tr>

			</c:forEach>
		</table>
		<div class="container">
			<button onclick="goInsert()">등록</button>
		</div>
	</div>
	<script type="text/javascript">
		function searchbtn() {
			var teType = document.querySelector("#teType").value;
			var teText = document.querySelector("#teText").value;
			
			if(teText.trim()==''){
				alert('검색할게 옴는걸~?');
				return;
			}
			if(teType=='teNum' && isNaN(teText) == true){
				alert('숫자로 검색해야지?');
				
				return;
			}
			location.href="<%=rPath%>te/teList?teType=" + teType + "&teText=" + teText;
		}
		
		function goPage(teNum){
			alert(teNum);
			location.href="<%=rPath%>te/teView?teNum=" + teNum;
		}
		function goInsert(){
			location.href="<%=rPath%>te/teInsert";
		}
		
		 function msg(){
			 var rCnt = '<c:out value="${teIn}"/>';
			 console.log(rCnt);
			  if(rCnt!=null || rCnt!=''){
				alert(rCnt);  
			  }
			  return;
			 }
			 window.onload=msg;

	</script>
</body>
</html>