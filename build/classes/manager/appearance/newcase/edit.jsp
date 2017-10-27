<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑新造型库</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>

<body>
	<div class="main-body-position">
	
		<div class="position-for-head2 thick ">外观库管理>新造型库>
			<span>
	        	<c:if test="${empty newcase.nid}">
	        		添加新案例
	        	</c:if>
	        	<c:if test="${not empty newcase.nid}">
	        		编辑已有案例
	        	</c:if>
	        </span>
		</div>
		<div class="container-position">
				<div class="mydiv gray-background" >
					<span>
		        		<c:if test="${empty newcase.nid}">
			        		添加新案例
			        	</c:if>
			        	<c:if test="${not empty newcase.nid}">
			        		编辑已有案例
			        	</c:if>
		           </span>
				</div> 
				<form:form id="editForm"  class="editForm" method="post"  action="${contextPath}/manager/newcase/load/save"
					commandName="newcase"  methodParam="post">
					<form:hidden path="nid" />
					<form:hidden path="tid" />
					
					<form:hidden path="newcasertotal"  val=""/>
					<form:hidden path="newcaseroutline" />
					<form:hidden path="newcasercolor" />
					<form:hidden path="newcasertexture" />
					<form:hidden path="newcaseatotal" />
					<form:hidden path="newcaseaoutline" />
					<form:hidden path="newcaseacolor" />
					<form:hidden path="newcaseatexture" />
					
					
				<div class="mydiv " style=" width: initial;height: initial;" >
						<br> 
						<div class="input-title-position">
								  <label for="product_name"><h4><span class="thick label-name">产品名称</span></h4></label>
								  <div class="my-no-br-right" >
								  <form:input path="newcasename"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name"><h4><span class="thick label-name">推荐方案</span></h4></label>
							  <div class="my-no-br-right" >
							  </div>
						</div>
						 <table>
								    <thead>
										<tr>
										<th>
											<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">整体效果</span></h5></label>
												  <div class="my-no-br-right" >
												  <!-- <button id="filePicker0" class="btn filePicker "  number="0" style=" padding: 0;">浏览上传</button> -->
												  <div id="filePicker0" class="btn filePicker "  number="0" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">方案详文件</span></h6>
										</th>
										<th>
											<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">轮廓推荐</span></h5></label>
												  <div class="my-no-br-right" >
												  <div id="filePicker1" class="btn filePicker "  number="1" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">轮廓源文件1</span></h6>
<!-- 								      <button id="filePicker1" class="btn filePicker "  number="1" style=" padding: 0;">选择图片</button>  -->
								     	</th>
								     	<th>
								     	<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">色彩推荐</span></h5></label>
												  <div class="my-no-br-right" >
												  <div id="filePicker2" class="btn filePicker "  number="2" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">色彩源文件1</span></h6>
<!-- 								      <button id="filePicker2" class="btn filePicker "  number="2" style=" padding: 0;">选择图片</button>  -->
								     </th>
								     	<th>
								     	<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">材质推荐</span></h5></label>
												  <div class="my-no-br-right" >
												  <div id="filePicker3" class="btn filePicker "  number="3" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">材质源文件1</span></h6>
<!-- 								      <button id="filePicker3" class="btn filePicker "  number="3" style=" padding: 0;">选择图片</button>  -->
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
									</tr>  
									</tbody>
								 </table>
						<div class="input-title-position">
							  <label for="product_name"><h4><span class="thick label-name">调整后方案</span></h4></label>
							  <div class="my-no-br-right" >
							  </div>
						</div>
						 <table>
								    <thead>
										<tr>
										<th>
											<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">整体效果</span></h5></label>
												  <div class="my-no-br-right" >
												  <button id="filePicker4" class="btn filePicker "  number="4" style=" padding: 0;">浏览上传</button> 
												  </div>
											</div>
											<h6><span class="thick label-name">方案详文件</span></h6>
										</th>
										<th>
											<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">轮廓推荐</span></h5></label>
												  <div class="my-no-br-right" >
												  <div id="filePicker5" class="btn filePicker "  number="5" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">轮廓源文件1</span></h6>
<!-- 								      <button id="filePicker1" class="btn filePicker "  number="1" style=" padding: 0;">选择图片</button>  -->
								     	</th>
								     	<th>
								     	<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">色彩推荐</span></h5></label>
												  <div class="my-no-br-right" >
												  <div id="filePicker6" class="btn filePicker "  number="6" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">色彩源文件1</span></h6>
<!-- 								      <button id="filePicker2" class="btn filePicker "  number="2" style=" padding: 0;">选择图片</button>  -->
								     </th>
								     	<th>
								     	<div class="input-title-position">
												  <label for="product_name"><h5><span class="thick label-name">材质推荐</span></h5></label>
												  <div class="my-no-br-right" >
												  <div id="filePicker7" class="btn filePicker "  number="7" style=" padding: 0;">浏览上传</div> 
												  </div>
											</div>
											<h6><span class="thick label-name">材质源文件1</span></h6>
<!-- 								      <button id="filePicker3" class="btn filePicker "  number="3" style=" padding: 0;">选择图片</button>  -->
								      </th>
									</tr>
								 </thead>
								 <tbody>
									<tr>
									<td>
									<div id="filename4" class="uploader-list " ></div>  
									</td>
									<td>
									<div id="filename5" class="uploader-list"></div> 
									</td>
									<td>
									<div id="filename6" class="uploader-list "></div> 
									</td>
									<td>
									<div id="filename7" class="uploader-list"></div>
									</td>
									</tr>  
									</tbody>
								 </table>

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
<script type="text/javascript" src="${contextPath}/js/manager/appearance/newcase/edit.js"></script>
</body>
</html>
