var toSaveUrl =contextPath + "/manager/question/load/edit";
var surveyUrl =contextPath + "/manager/question/load/survey";
var deletepng=contextPath +"/manager/yuyi/basicSemantic/delete.png";
debugger
$("#producttype button").first().addClass("orange");
tid=$("#producttype button").first().attr("myid");
$('#questionTitle').html("意象词汇降维调查");
var surveytypename="wordsurvey"; 
//动态增加input输入框
var addHtml="";
var count=1;
var wordListlengthOld=0;
var  wordArray=new Array();
//增加输入框
function addinput(number){
	addHtml=$("#addinput").html();
	addHtml+="<div class='input-group'><img src='"+deletepng+"' class='deleteimg' style='width: 9px;' />"+
	"<input id='wordsurvey"+number+"'   class='form-control '  style=' width: 250px; margin-bottom: 20px;'/></div>";
	$("#addinput").html(addHtml);
}
//默认显示三个输入框
for(var i=0;i<1;i++){
	addinput(i);
}

$(document).on("click",".addinputbtn",function(){
	debugger
	addinput(count);
	  for(var i=0;i<wordArray.length;i++){
     	   $("#wordsurvey"+i).val(wordArray[i]);
       }
	count=count+1;
});
	
$(document).on("click",".deleteimg",function(){
	$(this).parent(".input-group").remove();
});

surveyLinks(tid,surveytypename);

function surveyLinks(tid,surveytypename){
	var loadUrl =surveyUrl+'?tid='+tid;
    $.ajax({  
        type : "get",  
        async : false,  //同步请求  
        url : loadUrl,  
//        data : data,  
        timeout:1000,  
        success:function(data){  
        	debugger
//            alert("成功！");  
            $("#sid").val(data.sid);
            $("#tid").val(data.tid);
            $("#choosesurvey").val(data.choosesurvey);
            $("#wordsurvey").val(data.wordsurvey);
            $("#wordresult").val(data.wordresult);
            $("#connectsurvey").val(data.connectsurvey);
            $("#connectresult").val(data.connectresult);
            $("#algorithms").val(data.algorithms);
            $("#ratio").val(data.ratio);
            
            var surveytype= $("#"+surveytypename).attr("value");
            if(surveytype!=undefined){
            	wordList = surveytype.split("，");
            	wordArray=wordList;
            }
            
            var wordListlength=wordList.length;
        	$("#addinput").html("");
            for(var i=0;i<3;i++){
            	addinput(i);
            }
            count=3;
            if(wordListlength>3){
            	  count=wordListlength;
            	 for(var i=3;i<wordListlength;i++){
	                	addinput(i);
	                }
            }
            else if(wordListlengthOld>3){
            	$("#addinput").html("");
            	 for(var i=0;i<3;i++){
	                	addinput(i);
	                }
            }
            wordListlengthOld=wordListlength;
            for(var i=0;i<wordList.length;i++){
          	   $("#wordsurvey"+i).val(wordList[i]);
            }
        }, error: function() {  
            alert("失败，请稍后再试！");  
        }  
    }); 

}


var wordList=new Array();

$(".chooseTypebtn").click(function () {
	$(this).siblings().removeClass('orange');
	$(".choosebtn").removeClass('orange');
	$(this).addClass("orange");
	tid=$(this).attr("myid");  //取tid值
	
	$("input").val("");
	
});
$(".choosebtn").click(function () {
	var questionTitle=$(this).attr("myname");
	$('#questionTitle').html(questionTitle);
	$(this).siblings().removeClass('orange');
	$(this).addClass("orange");
	$("input").val("");
	surveytypename=$(this).attr("surveytypename"); 
	debugger
	surveyLinks(tid,surveytypename);
  
});

//for(var i=0;i<wordList.length;i++){
//	  if(i>3){
//		  $("#addinput").trigger("click");
//	   }
////	   $("#wordsurvey"+i).val(wordList[i]);
//  }


$(".savebtn").click(function(){
	debugger
	 var wordList =new Array();
	   for(var i=0;i<1;i++){
		   var wordsurvey6= $("#wordsurvey"+i).val();
		   if(wordsurvey6!= ""||wordsurvey6!=null||wordsurvey6!=undefined)
		   wordList.push(wordsurvey6);
	       }
	 var wordsurveys=wordList.join("，");
	  $("#"+surveytypename).val(wordsurveys);
	var form = $("#editForm");
	 var params = form.serialize();
     var action = form.attr("action");
     //如果验证通过
		$.post(action, params, function(data) {
			alert("保存成功！");
		});
});


