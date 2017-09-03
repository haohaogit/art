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
	
		<div class="position-for-head2 thick ">外观库管理>底层案例库>
			<span>
	        	<c:if test="${empty bottomcase.bcid}">
	        		添加新案例
	        	</c:if>
	        	<c:if test="${not empty bottomcase.bcid}">
	        		编辑已有案例
	        	</c:if>
	        </span>
		</div>
		<div class="container-position">
				<div class="mydiv gray-background" >
					<span>
		        		<c:if test="${empty bottomcase.bcid}">
			        		添加新案例
			        	</c:if>
			        	<c:if test="${not empty bottomcase.bcid}">
			        		编辑已有案例
			        	</c:if>
		           </span>
				</div> 
				<form:form id="editForm"  class="editForm" method="post"  action="${contextPath}/manager/bottom/load/save"
					commandName="bottomcase"  methodParam="post">
					<form:hidden path="bctid" />
					<form:hidden path="bcid" />
					<form:hidden path="tid" />
				<div class="mydiv " style=" width: initial;height: initial;" >
						<br> 
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">产品名称</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="casename"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">产品品牌</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="casebrand"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name"><h5><span class="thick label-name">产品外观类型</span></h5></label>
							  <div class="my-no-br-right" >
<%-- 							 		<form:select class="form-control "   path="tid"  items="${typesList}"  itemLabel="tname" itemValue="tid" ></form:select> --%>
							  </div>
						</div>
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">案例图片</strong></label>
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
<script type="text/javascript" src="${contextPath}/js/manager/appearance/bottom/edit.js"></script>
</body>
</html>
