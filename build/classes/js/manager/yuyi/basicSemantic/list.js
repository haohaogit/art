//var toEditUrl = "${contextPath}/manager/basicSemantic/edit";
var toEditUrl ="edit";
var toDeleteUrl ="todelete";
var id;
$(document).ready(function(){
	
	$(".addVocabtn").click(function(){
		debugger
		 var id= $(this).attr("myid");
		 var url = toEditUrl + "?tt=" + Math.random(0, 100);
	      debugger
	      if(id != undefined){
	      	 url += "&id=" + id;
	      }
	      window.location.href= url;
	});
	$(".addbtn").click(function(){
		debugger;
		 id= $(this).attr("myid");
		 //alert($(this).html());
		 //alert("aaa");
		/* var url = toEditUrl + "?tt=" + Math.random(0, 100);
	      debugger
	      if(id != undefined){
	      	 url += "&id=" + id;
	      }
	      window.location.href= url;*/
	});
	$(".editbtn").click(function(){
		 
		  var url = toEditUrl + "?tt=" + Math.random(0, 100);
	      debugger
	      if(id != undefined){
	      	 url += "&id=" + id;
	      	window.location.href= url;
	      }else{
	    	  alert("plaese select vocabulary ");
	      }
	      
	});
	$(".table-responsive").on('click','.deletebtn',function(){ 
		debugger;
	      window.location.href= toDeleteUrl;
	});
	

});
