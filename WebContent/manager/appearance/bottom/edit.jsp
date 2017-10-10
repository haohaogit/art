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
							<label for="product_name"><span class="thick label-name">产品外观类型</span></label>
<!-- 							  <label for="product_name"><h5><span class="thick label-name">产品外观类型</span></h5></label> -->
							  <div class="my-no-br-right" >
							 		<form:select class="form-control "   path="bctid"  items="${bottomCaseTypeList}"  itemLabel="bctname" itemValue="bctid" ></form:select>
							  </div>
						</div>
						<div class="input-title-position">
							 <label for="product_name"><span class="thick label-name">案例图片</span></label>
<!-- 							  <label for="product_name " ><strong   class="label-name">案例图片</strong></label> -->
							  <div class="my-no-br-right" >
								    <form:hidden path="caseimg" />
								    <form:hidden path="caseimg1" />
								    <form:hidden path="caseimg2" />
								    <form:hidden path="caseimg3" />
								    <form:hidden path="caseimg4" />
								    <table>
								    <thead>
<!-- 								     <div style="display:inline-block ;"> -->
										<tr>
										<th>
								       <button id="filePicker0" class="btn filePicker "  number="0" style=" padding: 0;">选择图片</button> 
										</th>
<!-- 								     <div id="thelist" class="uploader-list "></div>   -->
										<th>
								      <button id="filePicker1" class="btn filePicker "  number="1" style=" padding: 0;">选择图片</button> 
								     	</th>
								     	<th>
								      <button id="filePicker2" class="btn filePicker "  number="2" style=" padding: 0;">选择图片</button> 
								     </th>
								     	<th>
								      <button id="filePicker3" class="btn filePicker "  number="3" style=" padding: 0;">选择图片</button> 
								      </th>
								     	<th>
								      <button id="filePicker4" class="btn filePicker "  number="4" style=" padding: 0;">选择图片</button> 
									</th>
									</tr>
								 </thead>
								 <tbody>
<!-- 									 <div style="display:inline-block ;"> -->
									<tr>
									<td>
									<div id="filename0" class="uploader-list  thelist" ></div>  
									</td>
									<td>
									<div id="filename1" class="uploader-list thelist"></div> 
									</td>
									<td>
									<div id="filename2" class="uploader-list thelist"></div> 
									</td>
									<td>
									<div id="filename3" class="uploader-list thelist"></div>
									</td>
									<td>
									<div id="filename4" class="uploader-list thelist"></div>
									</td>
									</tr>  
<!-- 									</div> -->
									</tbody>
								 </table>
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
