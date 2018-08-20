<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp"%>
<body>
	<div class="container">
		<div class="form-group">
			<label class="col-sm-2 control-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" placeholder="Name">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">ID</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="id" placeholder="ID">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">Desc</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="desc" placeholder="Desc">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button class="btn btn-default" onclick="inser()">등록</button>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	function inser(){
		var name = document.querySelector('#name').value;
		var id = document.querySelector('#id').value;
		var desc = document.querySelector('#desc').value;
		
		if(id.trim()==null || id.trim()==='' || name.trim()==null || name.trim()===''){
			alert('머 등록할라구');
			return;
		}
		
		location.href='<%=rPath%>te/teInsert?name='+name+'&id='+id+'&desc='+desc;
	}
	</script>
</body>
</html>