function fillModelFabric(data){
	var aHtml="";
	var bHtml="";
	var cHtml="";
	var dHtml="";
	
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].oname)
		{
			case "兽纹图案":
			  if(aHtml==""){
				  aHtml+="<div class='lunkuo'><div class='descri' >鸟纹图案轮廓</div></div><div class='macro'>";
			  }
			  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
			  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
			 
			  break;
			case "花草图案":
			
				if(bHtml==""){
					bHtml+="<div class='lunkuo'><div class='descri' >花草图案轮廓</div></div><div class='macro'>";
				}
				
				bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
				bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
			
			    break;
			case "几何图案":
				  if(cHtml==""){
					  cHtml+="<div class='lunkuo'><div class='descri' >几何图案轮廓</div></div><div class='macro'>";
				  }
				
				  cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
				  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
				 
				  break;
			case "鸟纹图案":
			
				if(dHtml==""){
					dHtml+="<div class='lunkuo'><div class='descri' >鸟纹图案轮廓</div></div><div class='macro'>";
				}
				
				dHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
				dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
				
			    break;
			default:
				break;
		}
	}
	var html="";
	
	html=html+aHtml+"</div>"+bHtml+"</div>"+cHtml+"</div>"+dHtml+"</div>";
	$("#fabricLunkuo").html(html);
}
function filllunbo(data){
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item'><img src='"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].cbname+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}
