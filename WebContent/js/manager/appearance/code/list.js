
var codecaseUrl =contextPath + "/manager/code/load/codecase";
//var delUrl =contextPath + "/manager/code/load/delete";
//var editUrl =contextPath + "/manager/code/edit";
var codecasetypeUrl =contextPath + "/manager/code/load/codecasetype";
//var outLineType="outLineType";
//var colorType="colorType";
//var partType="partType";
//var textureType="textureType";
var tid="";
var codeType="";
var codeTypeId="";
debugger
$("#producttype button").first().click();
$("#producttype button").first().addClass("orange");
tid=$("#producttype button").first().attr("myid");
$("#codeCaseTypeList button").first().addClass("orange");
codeType=$("#codeCaseTypeList button").first().attr("myname");
$(document).on("click",".chooseTypebtn",function(){
	$(this).siblings().removeClass('orange');
	$("#codeCaseTypeList button").removeClass('orange');
	$(this).addClass("orange");
	tid=$(this).attr("myid");
});

function clickchoosebtn(){
	
	
}
$(document).on("click",".choosebtn",function(){
	$(this).siblings().removeClass('orange');
	$(this).addClass("orange");
	codeType=$(this).attr("myname");
//	codeTypeId=$(this).attr("myid");
	debugger
	var loadUrl=contextPath + "/manager/code/load/"+codeType+"?tid="+tid;
//	 $.get(url, data, success); 
    $.ajax({  
        type : "get",  
        async : false,  //同步请求  
        url : loadUrl,  
//        data : data,  
        timeout:1000,  
        success:function(data){  
//            alert("成功！"); 
        	var listHtml="";
        	for(var i=0;i<data.length;i++){
        		listHtml+="<button type='button' myid='"+data[i].id+ 
        		"' mytid='"+data[i].tid+ 
        		"' class='btn btn-link chooseCasebtn'>"+data[i].name +"</button> ";
        	}
        	$("#codeTypeList").html(listHtml);
        }, error: function() {  
            alert("失败，请稍后再试！");  
        }  
    }); 
});

$(document).on("click",".chooseCasebtn",function(){
	$(this).siblings().removeClass('orange');
	$(this).addClass("orange");
	codeTypeId=$(this).attr("myid");
	tid=$(this).attr("mytid");
//	codeTypeId=$(this).attr("myid");
	debugger
	var loadUrl=contextPath + "/manager/code/codecase/"+codeType+"?tid="+tid+"&codeTypeId="+codeTypeId;
//	 $.get(url, data, success); 
    $.ajax({  
        type : "get",  
        async : false,  //同步请求  
        url : loadUrl,  
//        data : data,  
        timeout:1000,  
        success:function(data){  
//            alert("成功！"); 
        	var listHtml="";
        	for(var i=0;i<data.length;i++){
        		listHtml+="<div class='mydiv'  myid='"+data[i].id+"'>"+data[i].name+
        		"<button type='button' myid='"+data[i].id+
        		"' class='btn btn-link pull-right deletebtn' data-toggle='modal' data-target='#myModal'>删除</button>"+ 
				"<button type='button'  myid='"+data[i].id+ 
				"' class='btn btn-link pull-right addbtn'>编辑</button> </div>";
        	}
        	$("#codeCaselist").html(listHtml);
        }, error: function() {  
            alert("失败，请稍后再试！");  
        }  
    }); 
});

//对于动态生成的元素
$(document).on("click",".addbtn",function(){
		debugger
		if(tid==""||codeTypeId==""){
			 alert("请先正确选择类型！"); 
			return false;
	       }
		var id= $(this).attr("myid");
		 var url = contextPath + "/manager/code/edit"+codeType+ "?tt=" + Math.random(0, 100);
	       debugger;
 	       if(id!= ""){
	       	 url += "&id=" + id;
	       }
	       else
	    	   if(tid!=""&&codeTypeId!=""){
		       	 url += "&tid="+tid+"&codeTypeId="+codeTypeId;
		       }
	       window.location.href= url;
	});


$(document).on("click",".deletebtn",function(){
//$(".deletebtn").click(function(){
	 var id= $(this).attr("myid");
	  $(".deleteOK").click(id,function(){
		  debugger
		  var url = contextPath + "/manager/code/load/delete"+codeType + "?id=" + id;
		  //$.post(url);
		  $.ajax({  
		        type : "get",  
		        async : false,  //同步请求  
		        url : url,  
		        timeout:1000,  
		        success:function(data){  
//		            alert("成功！"); 
		        	location.reload([true]);
		        }, error: function() {  
		            alert("失败，请稍后再试！");  
		        }  
		    }); 
		  
	  });
});




