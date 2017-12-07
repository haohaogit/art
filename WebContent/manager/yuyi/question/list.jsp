<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>问卷调查与检验</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.input-length{
    width: 250px!important;
}
</style>

</head>

<body>
	<div class="main-body-position">
	<form:form id="editForm"  method="post"  action="${contextPath}/manager/question/load/edit"
					commandName="survey" methodParam="post"> 
		<div class="position-for-head2 thick ">语义库管理>问卷调查与检验</div>
		<div class="container-position">
				<div class="mydiv gray-background" >问卷调查与检验</div> 
				<div class="mydiv"  id="producttype">产品类型
						<c:forEach var="type" items="${typeList}" varStatus="status">	
									<button type="button" class="btn btn-link chooseTypebtn" myid="${type.tid }" >${type.tname }</button>  
						</c:forEach>
				</div>
				<div class="mydiv mydiv1"  id="SurveyType">调查类型
						<button type="button" class="btn btn-link orange choosebtn" surveytypename="wordsurvey" myname="意象映射造型调查问卷" >意象映射造型调查问卷</button>  
						<button type="button" class="btn btn-link choosebtn" surveytypename="wordresult" myname="意象映射造型调查问卷原始数据" >意象映射造型调查问卷原始数据</button>  
						<button type="button" class="btn btn-link choosebtn" surveytypename="connectsurvey" myname="意象映射造型验证调查问卷" >意象映射造型验证调查问卷</button>  
						<button type="button" class="btn btn-link  choosebtn" surveytypename="connectresult" myname="意象映射造型验证调查问卷原始数据" >意象映射造型验证调查问卷原始数据</button>  
						<button type="button" class="btn btn-link choosebtn" surveytypename="ratio" myname="正交分析SPSS原文件" >正交分析SPSS原文件</button> 
						<button type="button" class="btn btn-link choosebtn" surveytypename="choosesurvey" myname="联合分析SPSS原文件" style="margin-left: 59px;">联合分析SPSS原文件</button> 
						<button type="button" class="btn btn-link choosebtn" surveytypename="algorithms" myname="PYTHON算法程序代码" style="margin-left: 5px;">PYTHON算法程序代码</button>  
						 
				</div>
				<br>
				<div class="mydiv gray-background"  id="questionTitle">意象映射造型调查问卷	</div> 
				<div class="mydiv"  id="SurveyDetial" style=" width: initial;height: initial;" >
						<br>
						<form:hidden path="tid"   class="form-control " />
						<form:hidden path="sid"   class="form-control " />
						<form:hidden path="wordsurvey"   class="form-control " />
						<form:hidden path="wordresult"   class="form-control " />
						<form:hidden path="connectsurvey"   class="form-control " />
						<form:hidden path="connectresult"   class="form-control " />
						<form:hidden path="ratio"   class="form-control " />
						<form:hidden path="choosesurvey"   class="form-control " />
						<form:hidden path="algorithms"   class="form-control " />
						
						
<!-- 							<div class="input-group"> -->
<%-- 							<img src="${contextPath}/manager/yuyi/basicSemantic/delete.png" class="deleteimg" style="width: 9px;" /> --%>
<!-- 							<input id="wordsurvey0"   class="form-control " style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							</div> -->
<!-- 							<div class="input-group"> -->
<%-- 							<img src="${contextPath}/manager/yuyi/basicSemantic/delete.png" class="deleteimg" style="width: 9px;" /> --%>
<!-- 							<input id="wordsurvey1"   class="form-control " style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							</div> -->
<!-- 							<div class="input-group"> -->
<%-- 							<img src="${contextPath}/manager/yuyi/basicSemantic/delete.png" class="deleteimg" style="width: 9px;" /> --%>
<!-- 							<input id="wordsurvey2"   class="form-control " style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							</div> -->
							
						<div id="addinput">
<!-- 							<input id="wordsurvey3"   class="form-control "  style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							<input id="wordsurvey4"   class="form-control "  style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							<input id="wordsurvey5"   class="form-control "  style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							<input id="wordsurvey6"   class="form-control "  style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							<input id="wordsurvey7"   class="form-control "  style=" width: 250px; margin-bottom: 20px;"/> -->
<!-- 							<input id="wordsurvey8"   class="form-control "  style=" width: 250px; margin-bottom: 20px;"/> -->
        				</div>
						<button type="button" class="btn btn-link addinputbtn">+添加新链接</button>
<!-- 						<a href="javascript:void(0)" class="blue" id="addNewLink" >+添加新链接  </a>  -->
						<br>
						<div class=" text-center">
									<button type="button" class="btn btn-primary savebtn">添加</button>
									<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>	
				</div>
				
				<br>
		</div>
		<script type="text/javascript">
		debugger
			var contextPath='${contextPath}';
		</script>
		</form:form>
	</div>
	<!-- 按钮触发模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content" style=" width: 65%;">
						<div class="mydiv gray-background "  style="width: 100%;">
							产品类型维护  
						</div>
						<div class="mydiv  text-center" style=" height: 130px; width: 100%;">
							您确定需要删除这个类型吗？ 
						<div  style="padding: 28px;    text-align: right;">
							<button type="submit" class="btn btn-primary  deleteOK">确定</button>
							<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
						</div>
						</div>
				</div>
				</div>
			</div>
<script type="text/javascript" src="${contextPath}/js/manager/yuyi/question/list.js"></script>

</body>

</html>
