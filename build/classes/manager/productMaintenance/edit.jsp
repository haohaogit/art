<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑新类型</title>
<style type="text/css">
</style>

</head>

<body >
<div class="main-body-position">
<div id="div2"></div>
	<div class="position-for-head2 thick">产品类型维护>
	        	<c:if test="${empty item.tid }">
	        		添加新类型
	        	</c:if>
	        	<c:if test="${not empty item.tid }">
	        		编辑产品
	        	</c:if>
	</div>
	<div class="container-position " >
<!-- 	<div class="mydiv"style=" width: initial;"> -->
			<ul id="myTab" class="nav nav-tabs">
				<li class="active">
					<a href="#home" data-toggle="tab">产品基本信息	</a>
				</li>
				<li ><a href="#myTab1" data-toggle="tab">底层案例库</a></li>
				<li ><a href="#myTab2" data-toggle="tab">编码案例库</a></li>
				<li ><a href="#myTab3" data-toggle="tab">新造型库</a></li>
				<li ><a href="#myTab4" data-toggle="tab">参数设置</a></li>
				<li ><a href="#myTab5" data-toggle="tab">造型生成</a></li>
				<li ><a href="#myTab6" data-toggle="tab">造型调整</a></li>
			</ul>
	<div class="mydiv"style=" width: initial;height: initial;">
			<div id="myTabContent" class="tab-content">
				<div class="tab-pane fade in active" id="home">
				<form:form id="editForm0"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post">
					<form:hidden path="tid" />
<%-- 					<form:hidden path="tname" /> --%>
<%-- 					<form:hidden path="talgorithm" /> --%>
<%-- 					<form:hidden path="twordtype" /> --%>
<%-- 					<form:hidden path="tyuyi" /> --%>
					<form:hidden path="tanli" />
					<form:hidden path="tbianma" />
					<form:hidden path="tzaoxing" />
					<form:hidden path="tcanshu" />
					<form:hidden path="tshengcheng" />
					<form:hidden path="ttiaozheng" />
					<form:hidden path="ticon" />
						<br>
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">产品名称</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="tname"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
								  <label for="product_ico"><span class="thick label-name">产品图标</span></label>
								  <div class="my-no-br-right" >
								  <!--用来存放item-->  
								     <div id="filePicker" class="btn filePicker " style=" padding: 0;">选择图片</div> 
								     <div id="thelist" class="uploader-list " value="${filename }"></div>  
								     <div id="filename" value="${filename }"></div>
<!-- 								     <div id="thelist" class="uploader-list"></div>   -->
<!-- 								    <div>   -->
<!-- 								       <button id="filePicker" class="btn filePicker " style=" padding: 0;">选择图片</button>  -->
<%-- 								        <div id="filename" value="${filename }"></div>  --%>
<!-- 								    </div>   -->
<!-- 								</div>   -->
								 <!--用来存放item end-->  
<!-- 								  <input path="ticon"   class="form-control "  size="10"  type="hidden"/>  -->
								  <!-- 									  		<a href="#">浏览上传</a>  -->
<%-- 								  <form:input path="tico"   class="form-control " size="10"/> --%>
<!-- 								  		<input type="file" class="form-control " id="file"  size="10"/> -->
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
							  <div class="my-no-br-right" >
							  		 <form:textarea  class="form-control textarea-size" path="tyuyi"  />
							  </div>
						</div> 	
						 <br>
				        <span class="thick ">产品降维词汇</span>
				        <p class=" blank-left">
				          	<label>词汇组织方式 </label>
				          	<span  id="wordtype">
				          		<button type="button" class="btn btn-default twordtypebtn"   data="1">词汇</button>
				          		<button type="button" class="btn btn-default twordtypebtn"   data="2">词对</button>
				          		<form:input path="twordtype"   class="form-control " size="10"  type="hidden"/>
				          	</span>
				        </p>
				        <p>
					        <label class="thick">算法选择</label>
					        	<span >
				          		<button type="button" class="btn btn-default talgorithmbtn"  id="gaojiaobei" data="111">高脚杯算法</button>
				          		<button type="button" class="btn btn-default talgorithmbtn"  id="youting"   data="222">游艇算法</button>
				          		<button type="button" class="btn btn-default talgorithmbtn"  id="zhiwu"  data="333">织物算法</button>
				          		<button type="button" class="btn btn-default talgorithmbtn"  id="meiqizao"   data="444">煤气灶算法</button>
				          		<form:input path="talgorithm"   class="form-control " size="10" type="hidden"/>
				          	</span>
					     </p>
				        <br><br>
				       <div class=" text-center">
							<button type="button" class="btn btn-primary savebtn" id="submit0">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
				      </form:form>
				
				</div>
				<div class="tab-pane fade" id="myTab1">
						<form:form id="editForm1" class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post"> 
						<form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
<%-- 						<form:hidden path="tanli" /> --%>
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
						  <br> 
						  <div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">产品介绍</strong></label>
							  <div class="my-no-br-right" >
							  		<form:textarea  class="form-control textarea-size" path="tanli"  />
							  </div>
						</div> 
						  <br>
				        <div id="bottomCaseTypeList"  >
<!-- 				        <input type="text" class="form-control " id="bottomCaseType"   type="hidden" /> -->
<!-- 						  <div class="input-title-position"> -->
<!-- 								  <label for="product_name"><span class="thick label-name">类型1</span></label> -->
<!-- 								  <div class="my-no-br-right" > -->
<!-- 								  		<input type="text" class="form-control " id="type1"   value="阔口型" size="10"/> -->
<!-- 								  </div> -->
<!-- 							</div>  -->
					      
				        </div>
				         <div class="input-title-position">
								 <button type="button" myid="" class="btn btn-link  addnewtypebtn">+添加新类型</button>  
						</div> 
					
				       <br><br>
						<div class=" text-center">
							<button type="button" class="btn btn-primary savebtn"  id="submit1">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
			</form:form>
				</div>
				<div class="tab-pane fade" id="myTab2">
					 	<form:form id="editForm2"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post">
					 	<form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
<%-- 						<form:hidden path="tbianma" /> --%>
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
					 	<br>
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
							  <div class="my-no-br-right" >
							  		<form:textarea  class="form-control textarea-size" path="tbianma"  />
							  </div>
						</div> 	
				        <br>
				         <div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">轮廓编码</span></label>
						</div> 
						<div class="input-title-position" id="outLineTypeList"  >
						<c:forEach var="outLineType" items="${outLineTypeList}" varStatus="status">
						  <div class="my-no-br-right"  >
								  		<input type="text" class="form-control "  id="${status.count}"  myid="${outLineType.otid }"  value="${outLineType.oname}" size="2"/>
						</div>
						</c:forEach>
						</div> 
				         <div class="input-title-position">
								 <button type="button" myname="outLineType" class="btn btn-link  addcodetypebtn">+添加新类型</button>  
						</div> 
						
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">部件编码</span></label>
						</div> 
						<div class="input-title-position" id="partTypeList"  >
<!-- 								  <div class="my-no-br-right"  > -->
<!-- 								  		<input type="text" class="form-control " id="textureType1"   value="" size="2"/> -->
<!-- 								  </div> -->
						<c:forEach var="partType" items="${partTypeList}" varStatus="status">
						 <div class="my-no-br-right"  >
								  		<input type="text" class="form-control "  id="${status.count}"  myid="${partType.pbid }"  value="${partType.pbname}" size="2"/>
						</div>
						</c:forEach>
						</div> 
				         <div class="input-title-position">
								 <button type="button" myname="partType" class="btn btn-link  addcodetypebtn">+添加新类型</button>  
						</div> 
						
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">色彩编码</span></label>
						</div> 
						<div class="input-title-position" id="colorTypeList"  >
						<c:forEach var="colorType" items="${colorTypeList}" varStatus="status">
						  <div class="my-no-br-right"  >
								  		<input type="text" class="form-control "  id="${status.count}"  myid="${colorType.cbid }"  value="${colorType.cbname}" size="2"/>
						</div>
						</c:forEach>
						</div> 
				         <div class="input-title-position">
								 <button type="button" myname="colorType" class="btn btn-link  addcodetypebtn">+添加新类型</button>  
						</div> 
						
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">材质编码</span></label>
						</div> 
						
						<div class="input-title-position" id="textureTypeList"  >
						<c:forEach var="textureType" items="${textureTypeList}" varStatus="status">
						  <div class="my-no-br-right"  >
								  		<input type="text" class="form-control "  id="${status.count}"  myid="${textureType.ttid }"  value="${textureType.ttname}" size="2"/>
						</div>
						</c:forEach>
						</div> 
				         <div class="input-title-position">
								 <button type="button" myname="textureType" class="btn btn-link  addcodetypebtn">+添加新类型</button>  
						</div> 
				        
				        <br><br>
						<div class=" text-center">
							<button type="button" class="btn btn-primary savebtn"  id="submit2">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
				</form:form>
				</div>
				<div class="tab-pane fade" id="myTab3">
					<form:form id="editForm3"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post"> 
					        <form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
<%-- 						<form:hidden path="tzaoxing" /> --%>
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
					        <br>
							<div class="input-title-position">
								  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
								  <div class="my-no-br-right" >
								  		<form:textarea  class="form-control textarea-size" path="tzaoxing"  />
								  </div>
							</div> 	
				       	 <br><br>
						 <div class=" text-center">
							<button type="button" class="btn btn-primary savebtn"  id="submit3">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						 </div>
						 <br>
					</form:form>

				</div>
				<div class="tab-pane fade" id="myTab4">
				     	<form:form id="editForm4"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post"> 
					      <br>
				          <form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
<%-- 						<form:hidden path="tcanshu" /> --%>
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
							  <div class="my-no-br-right" >
							  		<form:textarea  class="form-control textarea-size" path="tcanshu"  />
							  </div>
						</div> 	
				        <br>
				        <div>
							<label for="questionarylink"><span class="thick">用户选择调查说明链接</span></label>
							<div class="my-no-br-right" >
								<input id="choosesurvey"   class="form-control " size="20"/>
							</div>
						</div> 
				        <div>
							<label for="suanfa_link"><span class="thick">算法说明链接</span></label>
							<div class="my-no-br-right" >
								<input id="algorithm"   class="form-control " size="20"/>
							</div>
						</div> 
						<br><br>
						<div class=" text-center">
							<button type="button" class="btn btn-primary savebtn"  id="submit4">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
				</form:form>
				</div>
				<div class="tab-pane fade" id="myTab5">
					<form:form id="editForm5"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
 					commandName="item" methodParam="post"> 
					        <form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
<%-- 						<form:hidden path="tshengcheng" /> --%>
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
					        <br>
							<div class="input-title-position">
								  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
								  <div class="my-no-br-right" >
								  		<form:textarea  class="form-control textarea-size" path="tshengcheng"  />
								  </div>
							</div> 	
				       	 <br><br>
						 <div class=" text-center">
							<button type="button" class="btn btn-primary savebtn"  id="submit5">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						 </div>
						 <br>
					</form:form>
				</div>
				<div class="tab-pane fade" id="myTab6">
						<form:form id="editForm6"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
 					commandName="item" methodParam="post"> 
							      	<form:hidden path="tid" />
									<form:hidden path="tid" />
									<form:hidden path="tname" />
									<form:hidden path="talgorithm" />
									<form:hidden path="twordtype" />
									<form:hidden path="tyuyi" />
									<form:hidden path="tanli" />
									<form:hidden path="tbianma" />
									<form:hidden path="tzaoxing" />
									<form:hidden path="tcanshu" />
									<form:hidden path="tshengcheng" />
<%-- 									<form:hidden path="ttiaozheng" /> --%>
									<form:hidden path="ticon" />
							        <br>
									<div class="input-title-position">
										  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
										  <div class="my-no-br-right" >
										  		<form:textarea  class="form-control textarea-size" path="ttiaozheng"  />
										  </div>
									</div> 	
						       	 <br><br>
								 <div class=" text-center">
									<button type="button" class="btn btn-primary savebtn"  id="submit6">保存</button>
									<button type="reset" class="btn btn-primary cancelbtn">取消</button>
								 </div>
								 <br>
					</form:form>
				</div>
			</div>
		</div>

	</div>

</div>
<script type="text/javascript">
	var contextPath='${contextPath}';
// 	var bottomCaseTypeList="${bottomCaseTypeList }";
// 	var outLineTypeJa="${outLineTypeJa }";
</script>
<script type="text/javascript" src="${contextPath}/js/manager/productMaintenance/edit.js"></script>
</body>
</html>
    