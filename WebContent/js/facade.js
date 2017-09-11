function fillBottomGoblet(data){
	
	var kHtml="";
	var sHtml="";
	var k=0;
	var s=0;
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].bctname)
		{
			case "扩口型":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>扩口型</div></div><div class='macro'>";
			  }
			  if(k<4){
				  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  k++;
			  }else{
				  kHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  k++;
			  }
			  break;
			case "收口型":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>收口型</div></div><div class='macro'>";
				}
				if(k<4){
					sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					s++;
				}else{
					sHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					s++;
				}
			    break;
		}
	}
	var html="";
	if(k!=0){
		kHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(s!=0){
		sHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	html=html+kHtml+sHtml;
	
	$(".bottomContent").html(html);
	
}

function fillBottomDetailInfo(data){
	
	$("#mainpic").attr("src",data.caseimg);
	$("#p2").html(data.casebrand);
	$("#p3").html(data.casename);
	$(".m1").attr("src",data.caseimg1);
	$(".m2").attr("src",data.caseimg2);
	$(".m3").attr("src",data.caseimg3);
	
}


function fillBottomfabric(data){
	
	var aHtml="";
	var bHtml="";
	var cHtml="";
	var dHtml="";
	
	var a=0;
	var b=0;
	var c=0;
	var d=0;
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].bctname)
		{
			case "兽纹图案型":
			  if(aHtml==""){
				  aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>兽纹图案型</div></div><div class='macro'>";
			  }
			  if(a<4){
				  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }else{
				  aHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }
			  break;
			case "花草图案型":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>花草图案型</div></div><div class='macro'>";
				}
				if(b<4){
					bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}else{
					bHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}
			    break;
			case "几何图案型":
				  if(cHtml==""){
					  cHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>几何图案型</div></div><div class='macro'>";
				  }
				  if(c<4){
					  cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }else{
					  cHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }
				  break;
			case "鸟纹图案型":
			
				if(dHtml==""){
					dHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>鸟纹图案型</div></div><div class='macro'>";
				}
				if(d<4){
					dHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					d++;
				}else{
					dHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					d++;
				}
			    break;
			default:
				break;
		}
	}
	var html="";
	if(a!=0){
		aHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(b!=0){
		bHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	if(c!=0){
		cHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	if(d!=0){
		dHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore3()' /></div>";
	}
	html=html+aHtml+bHtml+cHtml+dHtml;
	
	$(".bottomFabric").html(html);
	
}


function fillBottomgascooker(data){
	
	var aHtml="";
	var bHtml="";
	/*var cHtml="";
	var dHtml="";*/
	
	var a=0;
	var b=0;
	/*var c=0;
	var d=0;*/
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].bctname)
		{
			case "数字极简型":
			  if(aHtml==""){
				  aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>数字极简型</div></div><div class='macro'>";
			  }
			  if(a<4){
				  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }else{
				  aHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }
			  break;
			case "美式风格型":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>美式风格型</div></div><div class='macro'>";
				}
				if(b<4){
					bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}else{
					bHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}
			    break;
			default:
				break;
		}
	}
	var html="";
	if(a!=0){
		aHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(b!=0){
		bHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	/*if(c!=0){
		cHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	if(d!=0){
		dHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore3()' /></div>";
	}*/
	html=html+aHtml+bHtml;
	
	$(".bottomGascooker").html(html);
	
}	



function fillBottomHouseboat(data){
	
	var aHtml="";
	var bHtml="";
	var cHtml="";
	var dHtml="";
	
	var a=0;
	var b=0;
	var c=0;
	var d=0;
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].bctname)
		{
			case "端庄型":
			  if(aHtml==""){
				  aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>端庄型</div></div><div class='macro'>";
			  }
			  if(a<4){
				  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }else{
				  aHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }
			  break;
			case "流线型":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>流线型</div></div><div class='macro'>";
				}
				if(b<4){
					bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}else{
					bHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}
			    break;
			case "轻巧型":
				  if(cHtml==""){
					  cHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>轻巧型</div></div><div class='macro'>";
				  }
				  if(c<4){
					  cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }else{
					  cHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }
				  break;
			case "稳重型":
			
				if(dHtml==""){
					dHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>稳重型</div></div><div class='macro'>";
				}
				if(d<4){
					dHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					d++;
				}else{
					dHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					d++;
				}
			    break;
			default:
				break;
		}
	}
	var html="";
	if(a!=0){
		aHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(b!=0){
		bHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	if(c!=0){
		cHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	if(d!=0){
		dHtml+="</div><div><img class='loadMore' src='../images/appearance/waiguan (18).png' onclick='loadmore3()' /></div>";
	}
	html=html+aHtml+bHtml+cHtml+dHtml;
	
	$(".bottomHouseboat").html(html);
	
}

function fillCodeGoblet(data){
	
	var a1Html="";
	var b1Html="";
	var c1Html="";
	var d1Html="";
	
	var a1=0;
	var b1=0;
	var c1=0;
	var d1=0;
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].type)
		{
			case "outline":
			
			  if(a1Html==""){
				  a1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>轮廓编码</div></div><div class='macro'>";
			  }
			  if(a1<4){
				  a1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				  a1++;
			  }/*else{
				  a1Html+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				  a1++;
			  }*/
			  break;
			case "color":
				
				if(b1Html==""){
					b1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>色彩编码</div></div><div class='macro'>";
				}
				if(b1<4){
					b1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
					b1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
					b1++;
				}/*else{
					b1Html+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
					b1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
					b1++;
				}*/
			    break;
			case "part":
				
				  if(c1Html==""){
					  c1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>部件编码</div></div><div class='macro'>";
				  }
				  if(c1<4){
					  c1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
					  c1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
					  c1++;
				  }/*else{
					  c1Html+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
					  c1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
					  c1++;
				  }*/
				  break;
			case "texture":
				
				if(d1Html==""){
					d1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>材质编码</div></div><div class='macro'>";
				}
				if(d1<4){
					d1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
					d1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
					d1++;
				}/*else{
					d1Html+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
					d1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
					d1++;
				}*/
			    break;
			default:
				break;
		}
	}
	var html="";
	if(a1!=0){
		a1Html+="</div><div><img class='loadMore more1' src='../images/appearance/waiguan (18).png' /></div>";
		
	}
	if(b1!=0){
		b1Html+="</div><div><img class='loadMore more2' src='../images/appearance/waiguan (18).png' /></div>";
		
	}
	if(c1!=0){
		c1Html+="</div><div><img class='loadMore more3' src='../images/appearance/waiguan (18).png' /></div>";
		
	}
	if(d1!=0){
		d1Html+="</div><div><img class='loadMore more4' src='../images/appearance/waiguan (18).png' /></div>";
		
	}
	html=html+a1Html+b1Html+c1Html+d1Html;
	
	$(".codeCgoblet").html(html);
	
	
}

function fillCodeoutline(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "扩口型":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>扩口型轮廓编码</div></div><div class='macro'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "收口型":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>收口型轮廓编码</div></div><div class='macro'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>";
	$(".outlineContent").html(html);
	
}

function fillCodecolor(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "暖色调":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>暖色系编码</div></div><div class='color'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "冷色调":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>冷色系编码</div></div><div class='color'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>";
	$(".colorContent").html(html);
	
}


function fillCodepart(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "杯柄":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>杯柄部件编码</div></div><div class='macro'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "杯肚":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>杯肚部件编码</div></div><div class='macro'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>";
	$(".partContent").html(html);
}

function fillCodetexture(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		
		switch(data[i].codetypename)
		{
			case "玻璃":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>玻璃材质编码</div></div><div class='texture'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "磨砂":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>磨砂材质编码</div></div><div class='texture'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>";
	$(".textureContent").html(html);
}

