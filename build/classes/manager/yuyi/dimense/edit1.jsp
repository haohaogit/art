<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新词对</title>
<%-- <link rel="stylesheet" href="${contextPath}/lib/iCheck/skins/flat/blue.css" /> --%>
</head>
<body>
	<div class="main-body-position">
		<form:form id="editForm"  method="post"  action="${contextPath}/manager/dimense/load/save"
					commandName="item"  methodParam="post">
					<form:hidden path="jwid" />
			<div class="position-for-head2 thick ">语义库管理>降维词汇库>添加新词汇</div>
			<div class="container-position">
					<div class="input-title-position">
							  <label for="product_name"><h5><span class="thick label-name">产品类型</span></h5></label>
							  <div class="my-no-br-right" >
							 		<form:select class="form-control"   path="tid"  items="${typesList}"  itemLabel="tname" itemValue="tid" ></form:select>
							  </div>
					</div> 
					<br>
			<div class="table-responsive">          
			       	<table class="table table-striped table-bordered">
					<thead>
						<tr>
								<th  style="width: 80px;">
									<span class="my-no-br-right" > 
											首字母
									</span>
								</th>
								<th>
									<span class="my-no-br-right" style="display: inline-block; padding-top: 7px; "> 
											已有词汇
									</span>
<!-- 									<button type="button" class="btn btn-link pull-right deletebtn" >删除</button>  -->
<!-- 									<button type="button" class="btn btn-link pull-right addbtn" >+添加新词汇</button> -->
								</th>
						</tr>
					</thead>
		         	<tbody>
					<tr>
	             		<td>A</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'A'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>B</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'B'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>C</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'C'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>D</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'D'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>E</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'E'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>F</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'F'}">
								<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>G</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'G'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>H</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'H'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>I</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'I'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>J</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'J'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>K</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'K'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>L</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'L'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>M</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'M'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>N</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'N'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>O</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'O'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>P</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'P'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>Q</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'Q'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr><tr>
	             		<td>R</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'R'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>S</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'S'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>T</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'T'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>U</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'U'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr><tr>
	             		<td>V</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'V'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>W</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'W'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>X</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'X'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>Y</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'Y'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>Z</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'Z'}">
									<span class="my-left"> 
									<input type="checkbox" name="checkbox"   myid="${item.wid}" value="${item.wword} " />
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button> 
									</span>								
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		         	</tbody>
			       	</table>
			</div>
			<div class=" text-center">
							<button type="button" class="btn btn-primary savebtn">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
			</div>	
  	</div>
		</form:form>	
		
	</div>
<%-- 	<script type="text/javascript" src="${contextPath }/lib/iCheck/icheck.min.js"></script>   --%>
<script type="text/javascript" src="${contextPath}/js/manager/yuyi/dimense/edit.js"></script>
</body>
</html>
