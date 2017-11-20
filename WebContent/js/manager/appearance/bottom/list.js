//var toSaveUrl = "load/edit";
//var bottomcaseUrl = "load/bottomcase";

var bottomcaseUrl =contextPath + "/manager/bottom/load/bottomcase";
var delUrl =contextPath + "/manager/bottom/load/delete";
var toEditUrl =contextPath + "/manager/bottom/edit";
var bottomcasetypeUrl =contextPath + "/manager/bottom/load/bottomcasetype";

var tid="";
var bctid="";
debugger
$("#producttype button").first().addClass("orange");
tid=$("#producttype button").first().attr("myid");

//对于动态生成的元素
$(document).on("click",".addbtn",function(){
		debugger
		var id= $(this).attr("myid");
		 var url = toEditUrl + "?tt=" + Math.random(0, 100);
	       debugger;
	       if(id!= ""){
	       	 url += "&id=" + id;
	       }
	       else
	    	   if(tid!=""&&bctid!=""){
		       	 url += "&tid="+tid+"&bctid="+bctid;
		       }
	       window.location.href= url;
	});

chooseType(tid);
function chooseType(tid){
	$("#bottomCaselist").html("");
	var loadUrl =bottomcasetypeUrl+'?tid='+tid;
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
        		listHtml+="<button type='button' myid='"+data[i].bctid+ 
        		"' class='btn btn-link choosebtn'>"+data[i].bctname +"</button> ";
        	}
        	$("#bottomCaseTypeList").html(listHtml);
        }, error: function() {  
            alert("失败，请稍后再试！");  
        }  
    }); 
	
}



$(document).on("click",".chooseTypebtn",function(){//修改成这样的写法
			$(this).siblings().removeClass('orange');
			$(this).addClass("orange");
			tid=$(this).attr("myid");  //取tid值
			debugger
			chooseType(tid);
	      
});

bctid=$("#bottomCaseTypeList button").first().attr("myid");
$("#bottomCaseTypeList button").first().addClass("orange");
chooseCase(tid,bctid);


function chooseCase(tid,bctid){
	var loadUrl =bottomcaseUrl;
	 if(tid!= ""&&bctid!=""){
		 loadUrl +='?tid='+tid+"&bctid="+bctid;
	 }
   $.ajax({  
       type : "get",  
       async : false,  //同步请求  
       url : loadUrl,  
//       data : data,  
       timeout:1000,  
       success:function(data){  
//           alert("成功！"); 
       	var listHtml="";
       	for(var i=0;i<data.length;i++){
       		listHtml+="<div class='mydiv'  myid='"+data[i].bcid+"'>"+data[i].casename+
       		"<button type='button' myid='"+data[i].bcid+
       		"' class='btn btn-link pull-right deletebtn' data-toggle='modal' data-target='#myModal'>删除</button>"+ 
				"<button type='button'  myid='"+data[i].bcid+ 
				"' class='btn btn-link pull-right addbtn'>编辑</button> </div>";
       	}
       	$("#bottomCaselist").html(listHtml);
       }, error: function() {  
           alert("失败，请稍后再试！");  
       }  
   }); 
	
}

$(document).on("click",".choosebtn",function(){//修改成这样的写法
//$(".choosebtn").on('click', function() {
			bctid=$(this).attr("myid");  //取tid值
			$(this).siblings().removeClass('orange');
			$(this).addClass("orange");
			debugger
			chooseCase(tid,bctid);
	      
//		});
});
$(document).on("click",".deletebtn",function(){
//$(".deletebtn").click(function(){
	  var id= $(this).attr("myid");
	  $(".deleteOK").click(id,function(){
		  debugger
		  //alert("id="+id);
		  var url = delUrl + "?id=" + id;
		  $.post(url,function(){
			  location.reload([true]);
		  });
		  /*location.reload([true]);*/
	  });
});




