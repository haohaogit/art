//var toSaveUrl = "load/edit";
//var newcaseUrl = "load/newcase";
var newcaseUrl =contextPath + "/manager/newcase/load/newcase";
var delUrl =contextPath + "/manager/newcase/load/delete";
var toEditUrl =contextPath + "/manager/newcase/edit";

var tid="";
debugger
$("#producttype button").first().addClass("orange chooseTypebtn");
tid=$("#producttype button").first().attr("myid");

//$(".chooseTypebtn").trigger("click");
$(document).on("click",".addbtn",function(){
		debugger
		var id= $(this).attr("myid");
		 var url = toEditUrl + "?tt=" + Math.random(0, 100)+"&tid=" + tid;
	       debugger;
	       if(id != null||id != ""){
	       	 url += "&id=" + id;
	       }
	       window.location.href= url;
	});

$(".temp").click(function(){
	$(this).siblings().removeClass('orange chooseTypebtn');
	$(this).addClass("orange chooseTypebtn");
});

//默认显示第一个
chooseType(tid);

function chooseType(tid){
	var loadUrl =newcaseUrl+'?tid='+tid;
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
        		listHtml+="<div class='mydiv'  myid='"+data[i].nid+"'>"+data[i].newcasename+
        		"<button type='button' myid='"+data[i].nid+
        		"' class='btn btn-link pull-right deletebtn' data-toggle='modal' data-target='#myModal'>删除</button>"+ 
				"<button type='button'  myid='"+data[i].nid+ 
				"' class='btn btn-link pull-right addbtn'>编辑</button> </div>";
        	}
        	$("#newCaseList").html(listHtml);
        }, error: function() {  
            alert("失败，请稍后再试！");  
        }  
    }); 
}
$(document).on("click",".chooseTypebtn",function(){
			tid=$(this).attr("myid");  //取tid值
			$(this).siblings().removeClass('orange');
			$(this).addClass("orange");
			debugger
			chooseType(tid);
});
$(document).on("click",".deletebtn",function(){
//$(".deletebtn").click(function(){
	 var id= $(this).attr("myid");
	  $(".deleteOK").click(id,function(){
		  debugger
		  var url = delUrl + "?id=" + id;
		  $.post(url);
		  location.reload([true]);
	  });
});



