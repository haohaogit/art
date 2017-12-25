function fillModelFabric(data){
	var aHtml="";
	var bHtml="";
	var cHtml="";
	var dHtml="";
	
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].oname)
		{
			case "兽纹":
			  if(aHtml==""){
				  aHtml+="<div class='lunkuo'><div class='descri' >兽纹图案轮廓</div></div><div class='macro'>";
			  }
			  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
			  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
			 
			  break;
			case "花草纹":
			
				if(bHtml==""){
					bHtml+="<div class='lunkuo'><div class='descri' >花草纹图案轮廓</div></div><div class='macro'>";
				}
				
				bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
				bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
			
			    break;
			case "几何纹":
				  if(cHtml==""){
					  cHtml+="<div class='lunkuo'><div class='descri' >几何纹图案轮廓</div></div><div class='macro'>";
				  }
				
				  cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
				  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].oname+"</div></div></div>";
				 
				  break;
			case "鸟纹":
			
				if(dHtml==""){
					dHtml+="<div class='lunkuo'><div class='descri' >鸟纹图案轮廓</div></div><div class='macro'>";
				}
				
				dHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].oimg+"' data-oid='"+data[i].oid+"'/></div>";
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
var GASaHtml="<ul>";
var GASbHtml="<ul>";
function filllunbo(data){

	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].cbname)
		{
			case "开关色彩":
				/*GASaHtml+="<li class='lunbo-item LColor'><img src='../image/"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].crgb+"</span></li>";*/
				break;
			case "面板色彩":
				GASbHtml+="<li class='lunbo-item bLColor'><img src='../image/"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].cdescription+"</span></li>";
				break;
			default:
				break;
		}
	}
	
	GASaHtml+="</ul>";
	GASbHtml+="</ul>";
	
	
	$(".lunbo-window").html(GASbHtml);
	
	AddCarousel();
}

var GASaHtml1="<ul>";
var GASbHtml1="<ul>";
function filllunboGlobet(data){
	
	
	for(var i=0;i<data.length;i++){
		
		switch(data[i].cbname)
		{
			case "暖色":
				GASaHtml1+="<li class='lunbo-item LColor'><img src='../image/"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].crgb+"</span></li>";
				break;
			case "冷色":
				GASbHtml1+="<li class='lunbo-item LColor'><img src='../image/"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].cdescription+"</span></li>";
				break;
			default:
				break;
		}
	}
	
	GASaHtml1+="</ul>";
	GASbHtml1+="</ul>";
	
	
	$(".lunbo-window").html(GASaHtml1);
	
	AddCarousel();
}

function fillHouseboatlunbo(data){
	
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item Cboat'><img src='../image/"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].cdescription+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}


function filllunboTexture(data){
	//alert(data.length);
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item LTexture'><img src='../image/"+data[i].timg+"' alt='"+data[i].textureid+"'><span>"+data[i].tdescription+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}
function filllunboTextureBoat(data){
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item TextureBoat'><img src='../image/"+data[i].timg+"' alt='"+data[i].textureid+"'><span>"+data[i].tdescription+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}

function filllunboTextureFabric(data){
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item TextureFabric'><img src='../image/"+data[i].timg+"' alt='"+data[i].textureid+"'><span>"+data[i].tdescription+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}

function filllunboTextureGlobet(data){
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item TextureGlobet'><img src='../image/"+data[i].timg+"' alt='"+data[i].textureid+"'><span>"+data[i].tdescription+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}


function filllunbopartFabric(data){
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		aHtml+="<li class='lunbo-item PartFabric'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}

function filllunboPart(data){
	var aHtml="<ul>";
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].pbname)
		{
			case "开关色彩":
				/*GASaHtml+="<li class='lunbo-item LColor'><img src='../image/"+data[i].cimg+"' alt='"+data[i].crgb+"'><span>"+data[i].crgb+"</span></li>";*/
				break;
			case "Logo":
				aHtml+="<li class='lunbo-item LPart'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
				break;
			default:
				break;
		}
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	
	AddCarousel();
}

var boatHtml1="<ul>";
var boatHtml2="<ul>";
var boatHtml3="<ul>";
function filllunboPartBoat(data){
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].pbname)
		{
			case "通信部件":
				boatHtml1+="<li class='lunbo-item LPart'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
				break;
			case "艉部甲板":
				boatHtml2+="<li class='lunbo-item LPart'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
				break;
			case "顶棚":
				boatHtml3+="<li class='lunbo-item LPart'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
				break;
			default:
				break;
		}
	}
	boatHtml1+="</ul>";
	boatHtml2+="</ul>";
	boatHtml3+="</ul>";
	$(".lunbo-window").html(boatHtml1);
	
	AddCarousel();
}

var globetHtml1="<ul>";
var globetHtml2="<ul>";
function filllunboPartGlobet(data){
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].pbname)
		{
			case "杯肚":
				globetHtml1+="<li class='lunbo-item LPart'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
				break;
			case "杯柄":
				globetHtml2+="<li class='lunbo-item LPart'><img src='../image/"+data[i].pimg+"' alt='"+data[i].pid+"'><span>"+data[i].pdescription+"</span></li>";
				break;
			default:
				break;
		}
	}
	globetHtml1+="</ul>";
	globetHtml2+="</ul>";
	$(".lunbo-window").html(globetHtml1);
	
	AddCarousel();
}

function filllunboFabric(timeid){
	var aHtml="<ul>";
	for(var i=0;i<7;i++){
		aHtml+="<li class='lunbo-item CFabric'><img src='../image/3Colors_Template"+i+"_"+timeid+".jpg' alt='"+i+"'><span>色块"+(i+1)+"</span></li>";
	}
	aHtml+="</ul>";
	$(".lunbo-window").html(aHtml);
	AddCarousel();
}

function fillwordSurveyHref(data){
	alert(data.wordsurvey);
	$('.href1').eq(0).attr('data-url',data.wordsurvey);
	$('.href1').eq(1).attr('data-url',data.wordresult);
}
