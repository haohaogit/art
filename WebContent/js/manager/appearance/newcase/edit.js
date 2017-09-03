
var listUrl =contextPath + "/manager/newcase/list";
//var toSaveUrl =contextPath + "/manager/bottom/load/edit";
$(".cancelbtn").click(function(){
		debugger
		 window.location.href= listUrl;
	});

	$(".savebtn").click(function(){
		debugger
//		 var wordList =new Array();
//		   for(var i=0;i<count;i++){
//			   var wordsurvey6= $("#wordsurvey"+i).val();
//			   wordList.push(wordsurvey6);
//		       }
//		 var wordsurveys=wordList.join("，");
//		  $("#wordsurvey").val(wordsurveys);
		var form = $("#editForm");
		 var params = form.serialize();
	     var action = form.attr("action");
	     //如果验证通过
			$.post(action, params, function(data) {
				alert("保存成功！");
			});
			 window.location.href= listUrl;
	});