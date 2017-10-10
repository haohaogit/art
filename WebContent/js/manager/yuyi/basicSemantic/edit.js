var listUrl =contextPath + "/manager/basicSemantic/list";
//var listUrl = "list";
$(document).on("click",".cancelbtn",function(){
//$(".cancelbtn").click(function(){
		debugger
		 window.location.href= listUrl;
	});
//$("#editForm").submit(function() { 
//    $(this).ajaxSubmit(function() {   
//    		}); 
//       return false; //阻止表单默认提交
//});
$(document).on("click",".savebtn",function(){
//	$(".savebtn").click(function(){
		debugger
		var form =$("#editForm");
		var params = form.serialize();
	    var action = form.attr("action");
	     //如果验证通过
			$.post(action, params,	function(data) {
				alert("保存成功！");
			});
			 window.location.href= listUrl;
	});