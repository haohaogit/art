
var listUrl = "list";
	$(".cancelbtn").click(function(){
		 window.location.href= listUrl;
//		 opener.location.reload();
	});
	debugger
	changeProduct();
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
		$.each(wordList,function(index,value){
			debugger
			if($(value).is(':checked')){
				widArray.push(value.attributes.myid.nodeValue);
			}
		})
		 var widsString=widArray.join("，");
		var tid=$("#tid").find("option:selected").val();
		params+="&widsString="+widsString+"&tid="+tid;
	     //如果验证通过
			$.post(action, params,	function(data) {
				alert("保存成功！");
			});
			 window.location.href= listUrl;
	});
//});