
var listUrl =contextPath + "/manager/newcase/list";
//var toSaveUrl =contextPath + "/manager/bottom/load/edit";
$(".cancelbtn").click(function(){
		debugger
		 window.location.href= listUrl;
	});

	$(".savebtn").click(function(){
		debugger
		var form = $("#editForm");
		 var params = form.serialize()+"&tid="+tid;
	     var action = form.attr("action");
	     //如果验证通过
			$.post(action, params, function(data) {
				alert("保存成功！");
			});
			 window.location.href= listUrl;
	});
	
	
	var newcasename0=$('#newcasertotal').val();
	var newcasename1=$('#newcaseroutline').val();
	var newcasename2=$('#newcasercolor').val();
	var newcasename3=$('#newcasertexture').val();
	var newcasename4=$('#newcaseatotal').val();
	var newcasename5=$('#newcaseaoutline').val();
	var newcasename6=$('#newcaseacolor').val();
	var newcasename7=$('#newcaseatexture').val();
	debugger
	var nameArray={
			newcasename0:newcasename0,
			newcasename1:newcasename1,
			newcasename2:newcasename2,
			newcasename3:newcasename3,
			newcasename4:newcasename4,
			newcasename5:newcasename5,
			newcasename6:newcasename6,
			newcasename7:newcasename7
	};
	var oldfilename="";
	for(var i=0;i<8;i++){
		debugger
		oldfilename=nameArray["newcasename"+i];
		if(oldfilename!=""){
			$('#filename'+i).html('<a  href="'+contextPath+'/file/download?filename='+encodeURIComponent(oldfilename)+
					'"><div class="file-item thumbnail upload-state-done" style="	margin-bottom: 15px;margin-top: 12; display:inline-block ;margin-right:12px;width:170px;"><img src="'+contextPath+
					"/image/"+oldfilename+'" alt="'+oldfilename+
			'"/>	<div class="info"></div></div></a>');
			 oldfilename="";
		}
	}
		
	
	$(function(){  
	 	   /*init webuploader*/  
//	 	   var $list=$(".filename"); 
//	 	   var $btn =$("#ctlBtn");   //开始上传  
	 	   var thumbnailWidth = 170;   //缩略图高度和宽度 （单位是像素），当宽高度是0~1的时候，是按照百分比计算，具体可以看api文档  
	 	   var thumbnailHeight = 200;  
//	 	   number是0~4
	 	   for(var i=0;i<8;i++){
	 		  uploaderFun(i);
	 	   }
	 	  function uploaderFun(number){
	 		 var $list=$("#filename"+number); 
	 		   var uploader = WebUploader.create({  
		 	       // 选完文件后，是否自动上传。  
		 	       auto: true,  
		 	       // swf文件路径  
		 	       swf: contextPath+'/lib/webuploader/Uploader.swf',  
		 	       // 文件接收服务端。  
		 	       server: contextPath+'/file/upload',  
		 	       // 选择文件的按钮。可选。  
		 	       // 内部根据当前运行是创建，可能是input元素，也可能是flash.  
		 	       pick: '#filePicker'+number,  
		 	       // 只允许选择图片文件。  
		 	       accept: {  
		 	           title: 'Images',  
		 	           extensions: 'gif,jpg,jpeg,bmp,png,txt,psd',  
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
//		 	      fileArray.push(file.name);
		 	       // $list为容器jQuery实例  
//		 	       $list.append( $li );  //追加
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
						if(number=="0"||number==0){
							$( '#newcasertotal' ).val(filename);  
						}
						if(number=="1"||number==1){
							$( '#newcaseroutline' ).val(filename);  
						}
						if(number=="2"||number==2){
							$( '#newcasercolor' ).val(filename);  
						}
						if(number=="3"||number==3){
							$( '#newcasertexture' ).val(filename);  
						}
						if(number=="4"||number==4){
							$( '#newcaseatotal' ).val(filename);  
						}
						if(number=="5"||number==5){
							$( '#newcaseaoutline' ).val(filename);  
						}
						if(number=="6"||number==6){
							$( '#newcaseacolor' ).val(filename);  
						}
						if(number=="7"||number==7){
							$( '#newcaseatexture' ).val(filename);  
						}
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
	 	  }
	  });  	  
		
	