<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑底层案例</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>

<body>
	<div class="main-body-position">
	
		<div class="position-for-head2 thick ">外观库管理>编码案例库>部件编码>
			<span>
	        	<c:if test="${empty item.pid}">
	        		添加新案例
	        	</c:if>
	        	<c:if test="${not empty item.pid}">
	        		编辑已有案例
	        	</c:if>
	        </span>
		</div>
		<div class="container-position">
				<div class="mydiv gray-background" >
					<span>
		        		<c:if test="${empty item.pid}">
			        		添加新案例
			        	</c:if>
			        	<c:if test="${not empty item.pid}">
			        		编辑已有案例
			        	</c:if>
		           </span>
				</div> 
				<form:form id="editForm"  class="editForm" method="post"  action="${contextPath}/manager/code/load/savepartType"
					commandName="item"  methodParam="post">
<%-- 					<form:hidden path="bctid" /> --%>
					<form:hidden path="pid" />
					<form:hidden path="tid" />
				<div class="mydiv " style=" width: initial;height: initial;" >
						<br> 
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">部件名称</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="pdescription"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name"><span class="thick label-name">部件类型</span></label>
							  <div class="my-no-br-right" >
							 		<form:select class="form-control "   path="pbid"  items="${typesList}"  itemLabel="pbname" itemValue="pbid" ></form:select>
							  </div>
						</div>
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">特征图片</strong></label>
							  <div class="my-no-br-right" >
<!-- 							  浏览上传 -->
<%-- 							  		 <form:textarea  class="form-control textarea-size" path="wbasic"  /> --%>
							  </div>
						</div> 
						<br>	
				       <br><br>
				       <div class=" text-center">
<!-- 							<button type="submit" class="btn btn-primary savebtn">保存</button> -->
							<button type="button" class="btn btn-primary savebtn">保存</button> 
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
				</div>
				</form:form>  
				</div>
				
		</div>
<script type="text/javascript">
	var contextPath='${contextPath}';
</script>
<script type="text/javascript" src="${contextPath}/js/manager/appearance/code/edit.js"></script>
</body>
</html>
