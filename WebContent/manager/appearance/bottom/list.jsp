<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>降维词汇库</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>

</head>

<body>
	<div class="main-body-position">
		<form:form id="editForm"  method="post"  action="${contextPath}/manager/bottom/list"
					commandName="bottomcase" methodParam="post"> 
		<div class="position-for-head2 thick ">外观库管理>底层案例库</div>
		<div class="container-position">
				<div class="mydiv gray-background" >底层案例库</div> 
				<div class="mydiv"   id="producttype">产品类型
					<c:forEach var="type" items="${typesList}" varStatus="status">
						<button type="button"  class="btn btn-link  chooseTypebtn" myid="${type.tid }">${type.tname }</button> 
					</c:forEach>
				</div>
					<div class="mydiv" >底层类型
					<span  id="bottomCaseTypeList">
					</span>
					</div>
				<br>
					<div class="mydiv gray-background" >底层案例库
					<button type="button" myid="" class="btn btn-link pull-right addbtn">+添加新案例</button> 
					</div> 
					<div id="bottomCaselist">
<!-- 					这里是列表 -->
					</div>
					
				<br>
				<br>
		</div>
		</form:form>
	</div>
	<!-- 按钮触发模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content" style=" width: 65%;">
						<div class="mydiv gray-background "  style="width: 100%;">
							底层案例库  
						</div>
						<div class="mydiv  text-center" style=" height: 130px; width: 100%;">
							您确定需要删除该案例吗？ 
						<div  style="padding: 28px;    text-align: right;">
							<button type="submit" class="btn btn-primary  deleteOK" >确定</button>
							<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
						</div>
						</div>
				</div>
				</div>
	</div>
<script type="text/javascript">
	var contextPath='${contextPath}';
</script>
<script type="text/javascript" src="${contextPath}/js/manager/appearance/bottom/list.js"></script>

</body>

</html>
