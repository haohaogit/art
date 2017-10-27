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
		/*debugger
		var form =$("#editForm");
		var params = form.serialize();
	    var action = form.attr("action");
	     //如果验证通过
			$.post(action, params,	function(data) {
				alert("保存成功！");
			});
			 window.location.href= listUrl;*/
		debugger
		var widArray=[];
		var form =$("#editForm");
		var params = form.serialize();
	    var action = form.attr("action");
	    var  wordList=$("input[name='checkbox']");
	    var similar = ""+$("#similar2").val();
	    var opposite = ""+$("#opposite2").val();
	    var temp = "";
	    var temp2 = "";
	    for(var i=3;i<=10;i++){
	    	temp = "#similar"+i;
	    	//temp2 = $(temp).val();
	    	if(typeof($(temp).val())=="undefined"){
	    		break;
	    	}
	    	similar = similar+","+$(temp).val();
	    	//alert("similar "+similar);
	    }
	    for(var i=3;i<=10;i++){
	    	temp = "#opposite"+i;
	    	if(typeof($(temp).val())=="undefined"){
	    		break;
	    	}
	    	opposite = opposite+","+$(temp).val();
	    	//alert("opposite "+opposite);
	    }
		$.each(wordList,function(index,value){
			debugger
			if($(value).is(':checked')){
				widArray.push(value.attributes.myid.nodeValue);
			}
		})
		 var widsString=widArray.join("，");
		var tid=$("#tid").find("option:selected").val();
		//alert("params "+params);
		params+="&widsString="+widsString+"&tid="+tid+"&similar="+similar+"&opposite="+opposite;
	     //如果验证通过
			$.post(action, params,	function(data) {
				alert("保存成功！");
				window.location.href= listUrl;
			});
	});
var count1 = 2;
var count2 = 2;
$(document).on("click",".addnewtypebtn",function(){
	debugger
	
	addbottomCaseType(count1);
//	chooseType(tid);
	count1=count1+1;
});
$(document).on("click",".addnewtypebtn2",function(){
	debugger
	
	addbottomCaseType2(count2);
//	chooseType(tid);
	count2=count2+1;
});

//增加近义词输入框
 function addbottomCaseType(number){
 	addHtml=$(".my-no-br-right1").html();
 	
 	/*addHtml+='<div class="input-title-position">'+
	  '<label for="product_name"><span class="thick label-name">类型'+(number+1)+
	  '</span></label> <div class="my-no-br-right" >'+
	  '<input type="text" class="form-control " id="type'+number+'"  size="10"  value=""/> </div></div> ';*/
 	addHtml+="<input type='text' class='form-control ' id='similar"+number+"'  size='10'  value='' style='margin-right:3px;margin-bottom:2px;width:102px;'/>";
 	//addHtml+="<form:input path='wsimilar' class='form-control '  size='10'  value='' style='margin-right:3px;margin-bottom:2px;width:102px;	'/>";
 	$(".my-no-br-right1").html(addHtml);
 }
//增加反义词输入框
 function addbottomCaseType2(number){
 	addHtml=$(".my-no-br-right2").html();
 	/*addHtml+='<div class="input-title-position">'+
	  '<label for="product_name"><span class="thick label-name">类型'+(number+1)+
	  '</span></label> <div class="my-no-br-right" >'+
	  '<input type="text" class="form-control " id="type'+number+'"  size="10"  value=""/> </div></div> ';*/
 	addHtml+="<input type='text' class='form-control ' id='opposite"+number+"'  size='10'  value='' style='margin-right:3px;margin-bottom:2px;width:102px;'/>";
 	$(".my-no-br-right2").html(addHtml);
 }