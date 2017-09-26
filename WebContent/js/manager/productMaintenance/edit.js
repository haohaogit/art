var listUrl =contextPath + "/manager/productMaintenance/list";
var bottomcasetypeUrl =contextPath + "/manager/productMaintenance/load/bottomcasetype";
var codetypeUrl=contextPath + "/manager/productMaintenance/load/codetype";
var upload=contextPath + "/file/upload";
//var delUrl =contextPath + "/manager/productMaintenance/load/delete";
var count=3;
var outLineType="outLineType";
var colorType="colorType";
var partType="partType";
var textureType="textureType";
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
 debugger
//默认显示三个输入框
 for(var i=0;i<3;i++){
	 addbottomCaseType(i);
//	 addInput(outLineType);
//	 addInput(colorType);
//	 addInput(partType);
//	 addInput(textureType);
 }
//增加输入框
 function addbottomCaseType(number){
 	addHtml=$("#bottomCaseTypeList").html();
 	addHtml+='<div class="input-title-position">'+
	  '<label for="product_name"><span class="thick label-name">类型'+(number+1)+
	  '</span></label> <div class="my-no-br-right" >'+
	  '<input type="text" class="form-control " id="type'+number+'"  size="10"  value=""/> </div></div> ';
 	$("#bottomCaseTypeList").html(addHtml);
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
//	        	bottomCaseTypeList=data;
	        	var length=data.length;
	        	if(length>3){
	        		$("#bottomCaseTypeList").html("");
		        	for(var i=0;i<length;i++){
		        		addbottomCaseType(i);
		        	}
	        	}
	        	
	        	for(var i=0;i<length;i++){
//	        		$("#type"+i).val(data[i].bctname);
	        		$("#type"+i).attr("value",data[i].bctname);
	        	}
	        }, error: function() {  
	            alert("失败，请稍后再试！");  
	        }  
	    }); 
		
	}
 debugger
// outLineTypeList=$(outLineTypeJa);
// list(outLineTypeList);
// function  list(data) {  
//
//	 for(var i=0;i<data.length;i++){
////			$("#type"+i).val(data[i].bctname);
//			$("#outLineType"+i).attr("value",data[i].oname);
//		}
// }  
 
 
 //value值
 $(document).on("input","input",function(){
		$(this).attr("value",$(this).val());
	});
 $(document).on("click",".addnewtypebtn",function(){
		debugger
		addbottomCaseType(count);
//		chooseType(tid);
		count=count+1;
	});
 ////////////////////////
 
 $(document).on("click",".addcodetypebtn",function(){
		debugger
		var myname =$(this).attr("myname");
//		var number=$("#"+myname+"List").find("input").length;
		addInput(myname);
	});
 
//增加输入框2
 var addInputHtml="";
 function addInput(typeName){
	 addInputHtml=$("#"+typeName+"List").html();
	 var number=$("#"+typeName+"List").find("input").length+1;
	 addInputHtml+='<div class="my-no-br-right"  >'+
		'<input type="text" class="form-control " id="'+number+'"  value="" size="2"/></div>';
 	$("#"+typeName+"List").html(addInputHtml);
 }
 
 function typeNameList(typeName){
	 var typeNameInput=$("#"+typeName+"List").find("input");
	 var  typeNameList =new Array();
	 $.each(typeNameInput,function(){
		 typeNameList.push(  $(this).attr("value"));
	 })
	 return typeNameList;
 }
 
$(".savebtn").click(function(){
	debugger
	var wordList =new Array();
	var outLineTypeList =typeNameList(outLineType);
	var colorTypeList =typeNameList(colorType);
	var partTypeList =typeNameList(partType);
	var textureTypeList =typeNameList(textureType);
	   for(var i=0;i<count;i++){
		   var bottomCaseType= $("#type"+i).val();
		   if(bottomCaseType!=null||bottomCaseType!=undefined)
		   wordList.push(bottomCaseType);
	       }
	   
	 var bottomCaseTypes=wordList.join(",");
	 var outLineTypes=outLineTypeList.join(",");
	 var colorTypes=colorTypeList.join(",");
	 var partTypes=partTypeList.join(",");
	 var textureTypes=textureTypeList.join(",");
	var form =$(this).parents(".editForm");
	debugger
	 var params = form.serialize();
	 params+="&bottomCaseTypes="+bottomCaseTypes+
	 "&outLineTypes="+outLineTypes+
	 "&colorTypes="+colorTypes+
	 "&partTypes="+partTypes+
	 "&textureTypes="+textureTypes;
     var action = form.attr("action");
     //如果验证通过
		$.post(action, params,	function(data) {
			alert("保存成功！");
		});
		 window.location.href= listUrl;
});



var oldfilename=$('#thelist').attr("value");
//$('#thelist').html('<a class=" " href="'+contextPath+'/file/download?filename='+encodeURIComponent(oldfilename)+'">'+oldfilename+'</a>');
//srcUrl=contextPath+"/image/"+oldfilename;

//	$("#thelist").html('<a class=" " href="'+contextPath+'/file/download?filename='+encodeURIComponent(oldfilename)+'"><img src="'+contextPath+"/image/"+oldfilename+'" alt="'+oldfilename+
//			'" style=" margin-top: 12px; margin-bottom: 15px;width: 125px;"/></a>');
$("#thelist").html('<a  href="'+contextPath+'/file/download?filename='+encodeURIComponent(oldfilename)+
		'"><div class="file-item thumbnail upload-state-done" style="	margin-bottom: 15px;margin-top: 12; display:inline-block ;margin-right:12px;width:100px"><img src="'+contextPath+
		"/image/"+oldfilename+'" alt="'+oldfilename+
'"/>	<div class="info">"'+oldfilename+'"</div></div></a>');

//var oldfilename=$('#filename').attr("value");
//$('#filename').html('<a class=" " href="'+contextPath+'/file/download?filename='+encodeURIComponent(oldfilename)+'">'+oldfilename+'</a>');
	$(function(){  
 	   /*init webuploader*/  
 	   var $list=$("#thelist");   
 	   var $btn =$("#ctlBtn");   //开始上传  
 	   var thumbnailWidth = 100;   //缩略图高度和宽度 （单位是像素），当宽高度是0~1的时候，是按照百分比计算，具体可以看api文档  
 	   var thumbnailHeight = 100;  
 	  
 	   var uploader = WebUploader.create({  
 	       // 选完文件后，是否自动上传。  
 	       auto: true,  
 	  
 	       // swf文件路径  
 	       swf: contextPath+'/lib/webuploader/Uploader.swf',  
 	  
 	       // 文件接收服务端。  
 	       server: contextPath+'/file/upload',  
//  	       server: 'http://localhost:8080/webUpload/manager/upload',
 	       // 选择文件的按钮。可选。  
 	       // 内部根据当前运行是创建，可能是input元素，也可能是flash.  
 	       pick: '#filePicker',  
 	  
 	       // 只允许选择图片文件。  
 	       accept: {  
 	           title: 'Images',  
 	           extensions: 'gif,jpg,jpeg,bmp,png,txt',  
 	           mimeTypes: 'image/*'  
 	       },  
 	       method:'POST',  
 	   });  
 	   // 当有文件添加进来的时候  
 	   uploader.on( 'fileQueued', function( file ) {  // webuploader事件.当选择文件后，文件被加载到文件队列中，触发该事件。等效于 uploader.onFileueued = function(file){...} ，类似js的事件定义。  
 	       debugger
 	      var $li = $(  
 				  '<a class=" " href="'+contextPath+'/file/download?filename='+encodeURIComponent(file.name)+'">'+
 	               '<div id="' + file.id + '" class="file-item thumbnail" style="	margin-bottom: 15px;margin-top: 12; display:inline-block ;margin-right:12px">' +  
 	                   '<img>' +  
 	                   '<div class="info">' + file.name + '</div>' +  
 	               '</div>'  +'</a>'
 	               ),  
 	           $img = $li.find('img');  
 	  
 	       // $list为容器jQuery实例  
// 	       $list.append( $li );  //追加
 	      $list.html( $li );  
 	       // 创建缩略图  
 	       // 如果为非图片文件，可以不用调用此方法。  
 	       // thumbnailWidth x thumbnailHeight 为 100 x 100  
 	       uploader.makeThumb( file, function( error, src ) {   //webuploader方法  
 	           if ( error ) {  
 	               $img.replaceWith('<span>不能预览</span>');  
 	               return;  
 	           }  
 	  
 	           $img.attr( 'src', src );  
 	       }, thumbnailWidth, thumbnailHeight );  
 	   });  
 	   // 文件上传过程中创建进度条实时显示。  
 	   uploader.on( 'uploadProgress', function( file, percentage ) {  
 	       var $li = $( '#'+file.id ),  
 	           $percent = $li.find('.progress span');  
 	  
 	       // 避免重复创建  
 	       if ( !$percent.length ) {  
 	           $percent = $('<p class="progress"><span></span></p>')  
 	                   .appendTo( $li )  
 	                   .find('span');  
 	       }  
 	  
 	       $percent.css( 'width', percentage * 100 + '%' );  
 	   });  
 	  
 	   // 文件上传成功，给item添加成功class, 用样式标记上传成功。  
 	   uploader.on( 'uploadSuccess', function( file,response ) {  
 		   debugger
 		   var filename=response.filename;
 	       $( '#'+file.id ).addClass('upload-state-done');  
//				$('#filename').html('<a class=" " href="'+contextPath+'/file/download?filename='+encodeURIComponent(filename)+'">'+filename+'</a>');
				$( '#ticon' ).val(filename);  
				});  
 	  
 	   // 文件上传失败，显示上传出错。  
 	   uploader.on( 'uploadError', function( file,reason  ) {  
 		   debugger
 	       var $li = $( '#'+file.id ),  
 	           $error = $li.find('div.error');  
 	  
 	       // 避免重复创建  
 	       if ( !$error.length ) {  
 	           $error = $('<div class="error"></div>').appendTo( $li );  
 	       }  
 	  
 	       $error.text('上传失败');  
 	   });  
 	  
 	   // 完成上传完了，成功或者失败，先删除进度条。  
 	   uploader.on( 'uploadComplete', function( file ) {  
 	       $( '#'+file.id ).find('.progress').remove();  
 	   });  
 	   //点击上传
 	      $btn.on( 'click', function() {  
 	        console.log("上传...");  
 	        uploader.upload();  
 	        console.log("上传成功");  
 	      });  
 	  });  
	
	
	
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
