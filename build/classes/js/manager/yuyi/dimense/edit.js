var count1 = 2;
var count2 = 2;
var listUrl = "list";
	$(".cancelbtn").click(function(){
		 window.location.href= listUrl;
//		 opener.location.reload();
	});
	debugger
	//changeProduct();
	function changeProduct(){
		var tid=$("#tid").find("option:selected").val();
		$("input[name='checkbox']").prop("checked",false);
		loadUrl="load/JWord?tid="+tid;
		$.ajax({  
	        type : "get",  
	        async : false,  //同步请求  
	        url : loadUrl,  
	        timeout:1000,  
	        success:function(data){  
	        	debugger
	        	for(var i=0;i<data.length;i++){
	        		var dataWid=data[i].wid;
	        		$("input[myid='"+dataWid+"']").prop('checked','true');
	        	}
	        }, error: function() {  
	            alert("失败，请稍后再试！");  
	        }  
    });
	}
$("#tid").change(function(){
	debugger
	changeProduct();
});
//window.onload=function(){	}//js写法
//$(function(){
//		//设置checkbox的样式，就是美化
//		$("input[type='checkbox']").iCheck({
//		    checkboxClass: 'icheckbox_flat-blue'
//		});
//	});
$(document).on("click",".savebtn",function(){
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

	$(document).on("click",".addnewtypebtn",function(){
		debugger
		
		addbottomCaseType(count1);
//		chooseType(tid);
		count1=count1+1;
	});
	$(document).on("click",".addnewtypebtn2",function(){
		debugger
		
		addbottomCaseType2(count2);
//		chooseType(tid);
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
//});