<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑案例</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>

<body>
	<div class="main-body-position">
	
		<div class="position-for-head2 thick ">外观库管理>编码案例库>色彩编码>
			<span>
	        	<c:if test="${empty item.cid}">
	        		添加新案例
	        	</c:if>
	        	<c:if test="${not empty item.cid}">
	        		编辑已有案例
	        	</c:if>
	        </span>
		</div>
		<div class="container-position">
				<div class="mydiv gray-background" >
					<span>
		        		<c:if test="${empty item.cid}">
			        		添加新案例
			        	</c:if>
			        	<c:if test="${not empty item.cid}">
			        		编辑已有案例
			        	</c:if>
		           </span>
				</div> 
				<form:form id="editForm"  class="editForm" method="post"  action="${contextPath}/manager/code/load/savecolorType"
					commandName="item"  methodParam="post">
					<form:hidden path="cid" />
					<%-- <form:hidden path="cbid" /> --%>
					<form:hidden path="tid" />
				<div class="mydiv " style=" width: initial;height: initial;" >
						<br> 
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">色彩名称</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="cdescription"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name"><span class="thick label-name">色彩类型</span></label>
							  <div class="my-no-br-right" >
							 		<form:select class="form-control "   path="cbid"  items="${typesList}"  itemLabel="cbname" itemValue="cbid" ></form:select>
							  </div>
						</div>
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">色彩数据</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="crgb"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">特征图片</strong></label>
							  <div class="my-no-br-right" >
							     <form:hidden path="cimg" />
								    <form:hidden path="cimg1" />
								    <form:hidden path="cimg2" />
								    <form:hidden path="cimg3" />
								    <form:hidden path="cimg4" />
								    <table>
								    <thead>
										<tr>
										<th>
								       <div id="filePicker0" class="btn filePicker "  number="0" style=" padding: 0;">选择图片</div> 
										</th>
										<th>
								      <div id="filePicker1" class="btn filePicker "  number="1" style=" padding: 0;">选择图片</div> 
								     	</th>
								     	<th>
								      <div id="filePicker2" class="btn filePicker "  number="2" style=" padding: 0;">选择图片</div> 
								     </th>
								     	<th>
								      <div id="filePicker3" class="btn filePicker "  number="3" style=" padding: 0;">选择图片</div> 
								      </th>
								     	<th>
								      <div id="filePicker4" class="btn filePicker "  number="4" style=" padding: 0;">选择图片</div> 
									</th>
									</tr>
								 </thead>
								 <tbody>
									<tr>
									<td>
									<div id="filename0" class="uploader-list " ></div>  
									</td>
									<td>
									<div id="filename1" class="uploader-list"></div> 
									</td>
									<td>
									<div id="filename2" class="uploader-list "></div> 
									</td>
									<td>
									<div id="filename3" class="uploader-list"></div>
									</td>
									<td>
									<div id="filename4" class="uploader-list "></div>
									</td>
									</tr>  
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
							<button type="button" class="btn btn-primary savebtn">保存1</button> 
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
<script type="text/javascript" src="${contextPath}/js/manager/appearance/code/editcolorType.js"></script>
</body>
</html>
