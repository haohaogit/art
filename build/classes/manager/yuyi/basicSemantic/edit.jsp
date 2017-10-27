<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑词汇</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>

<body>
	<div class="main-body-position">
		<div class="position-for-head2 thick ">语义库管理>基础意象语义库>首字母分类>
			<span>
	        	<c:if test="${empty item.wid}">
	        		添加新词汇
	        	</c:if>
	        	<c:if test="${not empty item.wid}">
	        		编辑已有词汇
	        	</c:if>
	        </span>
		</div>
		<div class="container-position">
				<div class="mydiv gray-background" >
					<span>
		        	<c:if test="${empty item.wid}">
		        		添加新词汇
		        	</c:if>
		        	<c:if test="${not empty item.wid}">
		        		编辑已有词汇
		        	</c:if>
		           </span>
				</div> 
		<form:form id="editForm"  class="editForm" method="post"  action="${contextPath}/manager/basicSemantic/load/save"
					commandName="item"  methodParam="post">
					<form:hidden path="wid" />
				<div class="mydiv " style=" width: initial;height: initial;" >
						<br> 
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">词汇名称</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="wword"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">基本释义</strong></label>
							  <div class="my-no-br-right" >
							  		 <form:textarea  class="form-control textarea-size" path="wbasic"  />
							  </div>
						</div> 
						<br>	
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">详细释义</strong></label>
							  <div class="my-no-br-right" >
							  		 <form:textarea  class="form-control textarea-size" path="wdetail"  />
							  </div>
						</div> 	
						<br>
						<div class="input-title-position" >
							  <label for="product_name " ><strong   class="label-name">近义词</strong></label>
							  <div style="width:630px;margin-left:11px;">
								  <div class="my-no-br-right1" style="display: flex;flex-wrap:wrap;">
								  		<form:input path="wsimilar" class="form-control "  size="10"  value="" style="margin-right:3px;margin-bottom:2px;width:102px;	"/>
								  		<%-- <form:textarea  class="form-control textarea-size" path="wdetail"  /> --%>
								  </div>
							  </div>
						</div>
						<div class="input-title-position">
								 <button type="button" myid="" class="btn btn-link  addnewtypebtn">+添加新类型</button>  
						</div>
						<br>
						<div class="input-title-position" >
							  <label for="product_name " ><strong   class="label-name">反义词</strong></label>
							  <div style="width:630px;margin-left:11px;">
								  <div class="my-no-br-right2" style="display: flex;flex-wrap:wrap;"><!-- justify-content: left; -->
								  		<form:input path="woposite" class="form-control " size="10"  value="" style="margin-right:3px;margin-bottom:2px;width:102px;	"/>
								  		<%-- <form:textarea  class="form-control textarea-size" path="wdetail"  /> --%>
								  </div>
							  </div>
						</div>
						<div class="input-title-position">
								 <button type="button" myid="" class="btn btn-link  addnewtypebtn2">+添加新类型</button>  
						</div>
				       <br><br>
				       <div class=" text-center">
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
// 	var bottomCaseTypeList="${bottomCaseTypeList }";
// 	var outLineTypeJa="${outLineTypeJa }";
</script>
<script type="text/javascript" src="${contextPath}/js/manager/yuyi/basicSemantic/edit.js"></script>
</body>
</html>
