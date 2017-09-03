var typeUrl =contextPath + "/manager/productMaintenance/load/type";
var delUrl =contextPath + "/manager/productMaintenance/load/delete";
var editUrl =contextPath + "/manager/productMaintenance/edit";


typeLIst();
function typeLIst(){
	var loadUrl =typeUrl;
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
        		listHtml+="<div class='mydiv'  myid='"+data[i].tid+"'>"+data[i].tname+
        		"<button type='button' myid='"+data[i].tid+
        		"' class='btn btn-link pull-right deletebtn' data-toggle='modal' data-target='#myModal'>删除</button>"+ 
				"<button type='button'  myid='"+data[i].tid+ 
				"' class='btn btn-link pull-right addbtn'>编辑</button> </div>";
        	}
        	$("#typesList").html(listHtml);
        }, error: function() {  
            alert("失败，请稍后再试！");  
        }  
    }); 
}

$(document).on("click",".addbtn",function(){
	debugger
	var id= $(this).attr("myid");
	 var url = editUrl + "?tt=" + Math.random(0, 100);
       debugger;
       if(id != ""){
       	 url += "&id=" + id;
       }
       window.location.href= url;
});

$(document).on("click",".deletebtn",function(){//修改成这样的写法
	//$(".deletebtn").click(function(){
		 var id= $(this).attr("myid");
		  $(".deleteOK").click(id,function(){
			  debugger
			  var url = delUrl + "?id=" + id;
			  $.post(url);
			  location.reload([true]);
		  });
	});











//
//$(document).ready(function(){
////	 location.reload([true]);
//	$(".deletebtn").click(function(){
//		 var id= $(this).attr("myid");
//		  $(".deleteOK").click(id,function(){
//			  debugger
//			  var url = delUrl + "?id=" + id;
//			  $.post(url,id);
//			  location.reload([true]);
//		  });
//	});
//	$(".addbtn").click(function(){
//		var id= $(this).attr("myid");
//		 var url = toEditUrl + "?tt=" + Math.random(0, 100);
//	        debugger;
//	        if(id != null){
//	        	 url += "&id=" + id;
//	        }
//	        window.location.href= url;
//	});
//});