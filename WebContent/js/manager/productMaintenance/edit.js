var listUrl =contextPath + "/manager/productMaintenance/list";
var bottomcasetypeUrl =contextPath + "/manager/productMaintenance/load/bottomcasetype";
//var delUrl =contextPath + "/manager/productMaintenance/load/delete";
var count=3;
var  bottomcasetypeArray=new Array();
var tid="";
tid=$("#tid").attr("value");
//*****选择按钮开始
$(".twordtypebtn").click(function(){
	var wordtype =$(this).attr("data");
	$(this).siblings().removeClass('btn-primary');
	$(this).addClass('btn-primary');
	$("#twordtype").val(wordtype);
});

$(".talgorithmbtn").click(function(){
	var talgorithm =$(this).attr("data");
	$(this).siblings().removeClass('btn-primary');
	$(this).addClass('btn-primary');
	$("#talgorithm").val(talgorithm);
});
var twordtype=$("#twordtype").attr("value");
var talgorithm=$("#talgorithm").attr("value");
 $(".twordtypebtn").each(function(){ 
	 debugger
	 var data=$(this).attr("data");
	 if(data==twordtype)$(this).addClass('btn-primary');
 }); 

 $(".talgorithmbtn").each(function(){ 
	 var data=$(this).attr("data");
	 if(data==talgorithm)$(this).addClass('btn-primary');
 }); 

 //*****选择按钮结束
 
 
//增加输入框
 function addbottomCaseType(number){
 	addHtml=$("#bottomCaseTypeList").html();
 	addHtml+='<div class="input-title-position">'+
	  '<label for="product_name"><span class="thick label-name">类型'+(number+1)+
	  '</span></label> <div class="my-no-br-right" >'+
	  '<input type="text" class="form-control " id="type'+number+'"  size="10"/> </div></div> ';
 	$("#bottomCaseTypeList").html(addHtml);
 }
 //默认显示三个输入框
 for(var i=0;i<3;i++){
	 addbottomCaseType(i);
 }
 debugger
 chooseType(tid);
 function chooseType(tid){
		var loadUrl =bottomcasetypeUrl+'?tid='+tid;
	    $.ajax({  
	        type : "get",  
	        async : false,  //同步请求  
	        url : loadUrl,  
	        timeout:1000,  
	        success:function(data){  
	        	bottomCaseTypeList=data;
	        	var listHtml="";
	        	for(var i=0;i<data.length;i++){
	        		$("#type"+i).val(data[i].bctname);
	        	}
	        }, error: function() {  
	            alert("失败，请稍后再试！");  
	        }  
	    }); 
		
	}


 $(document).on("click",".addnewtypebtn",function(){
		debugger
		addbottomCaseType(count);
		chooseType(tid);
		count=count+1;
	});
 
 
$(".savebtn").click(function(){
	debugger
	var form =$(this).parents(".editForm");
	 var params = form.serialize();
     var action = form.attr("action");
     //如果验证通过
		$.post(action, params, function(data) {
			alert("保存成功！");
		});
		 window.location.href= listUrl;
});
	
	
	/**
	 * 提交保存
	 */
//	$("#submit0").click(function(){
//		debugger
//		 var form = $("#editForm0");
//		var action = form.attr("action");
//		$.post(action,item, function(data) {
//		});
//	});
	
//	$("#submit0").click(function(){
//		debugger;
//		var form = $("#editForm0");
//		var action = form.attr("action");
//        var options = {
//            url: action,
//            target: "#div2",
//            success: function () {
//                alert("ajax请求成功");
//            }
//        };
//        $("#editForm0").ajaxForm(options);
//    });
//	 $("#editForm0").submit(function() { 
//	        $(this).ajaxSubmit(function() {   
////	                $('#output').html("提交成功").show();    
//	        		}); 
//	           return false; //阻止表单默认提交
//		});
//	$(".savebtn").click(function(){
//		debugger;
//		 window.location.href= listUrl;
//		 $(this).parents(".editForm").submit(function() { 
//		        $(this).ajaxSubmit(function() {   
//		        		}); 
//		           return false; //阻止表单默认提交
//			});
//		var form = $("#editForm0");
//		var action = form.attr("action");
//		 location.reload([true]);
//	});
