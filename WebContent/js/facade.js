function fillBottomGoblet(data){
	
	var kHtml="";
	var sHtml="";
	var aHtml="";
	var k=0;
	var s=0;
	var a=0;
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].bctname)
		{
			case "扩口型":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>扩口型</div></div><div class='macro'>";
			  }
			  if(k<4){
				  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  k++;
			  }else{
				  kHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  k++;
			  }
			  break;
			case "收口型":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>收口型</div></div><div class='macro'>";
				}
				if(s<4){
					sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					s++;
				}else{
					sHtml+="<div class='hengStep isLoadMore1 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					s++;
				}
			    break;
			case "收口外扩型":
				
				if(aHtml==""){
					aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>收口外扩型</div></div><div class='macro'>";
				}
				if(a<4){
					aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					a++;
				}else{
					aHtml+="<div class='hengStep isLoadMore2 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					a++;
				}
			    break;
		}
	}
	var html="";
	if(k!=0){
		kHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(s!=0){
		sHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	if(a!=0){
		aHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	html=html+kHtml+sHtml+aHtml;
	
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
				  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }else{
				  aHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }
			  break;
			case "花草图案型":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>花草图案型</div></div><div class='macro'>";
				}
				if(b<4){
					bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}else{
					bHtml+="<div class='hengStep isLoadMore1 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}
			    break;
			case "几何图案型":
				  if(cHtml==""){
					  cHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>几何图案型</div></div><div class='macro'>";
				  }
				  if(c<4){
					  cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }else{
					  cHtml+="<div class='hengStep isLoadMore2 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }
				  break;
			case "鸟纹图案型":
			
				if(dHtml==""){
					dHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>鸟纹图案型</div></div><div class='macro'>";
				}
				if(d<4){
					dHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					d++;
				}else{
					dHtml+="<div class='hengStep isLoadMore3 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
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
		aHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(b!=0){
		bHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	if(c!=0){
		cHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	if(d!=0){
		dHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore3()' /></div>";
	}
	html=html+aHtml+bHtml+cHtml+dHtml;
	
	$(".bottomFabric").html(html);
	
}

function fillBottomgascooker(data){
	
	var aHtml="";
	var bHtml="";
	var cHtml="";
	/*var dHtml="";*/
	
	var a=0;
	var b=0;
	var c=0;
	/*var d=0;*/
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].bctname)
		{
			case "数字极简型":
			  if(aHtml==""){
				  aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>数字极简型</div></div><div class='macro'>";
			  }
			  if(a<4){
				  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }else{
				  aHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }
			  break;
			case "美系风格型":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>美式风格型</div></div><div class='macro'>";
				}
				if(b<4){
					bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}else{
					bHtml+="<div class='hengStep isLoadMore1 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}
			    break;
			case "韩系居家型":
				
				if(cHtml==""){
					cHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>韩系居家型</div></div><div class='macro'>";
				}
				if(c<4){
					cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					c++;
				}else{
					cHtml+="<div class='hengStep isLoadMore2 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					c++;
				}
			    break;
			default:
				break;
		}
	}
	var html="";
	if(a!=0){
		aHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(b!=0){
		bHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	if(c!=0){
		cHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	/*if(d!=0){
		dHtml+="</div><div><img class='loadMore' src='../image/appearance/waiguan (18).png' onclick='loadmore3()' /></div>";
	}*/
	html=html+aHtml+bHtml+cHtml;
	
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
			case "奢华型":
			  if(aHtml==""){
				  aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>奢华型</div></div><div class='macro'>";
			  }
			  if(a<4){
				  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }else{
				  aHtml+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
				  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
				  a++;
			  }
			  break;
			case "运动型":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>运动型</div></div><div class='macro'>";
				}
				if(b<4){
					bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}else{
					bHtml+="<div class='hengStep isLoadMore1 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					b++;
				}
			    break;
			case "个性型":
				  if(cHtml==""){
					  cHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>个性型</div></div><div class='macro'>";
				  }
				  if(c<4){
					  cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }else{
					  cHtml+="<div class='hengStep isLoadMore2 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					  cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					  c++;
				  }
				  break;
			case "品质型":
			
				if(dHtml==""){
					dHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>品质型</div></div><div class='macro'>";
				}
				if(d<4){
					dHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
					dHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].casename+"</div></div></div>";
					d++;
				}else{
					dHtml+="<div class='hengStep isLoadMore3 isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].bcid+"'/></div>";
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
		aHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore()' /></div>";
	}
	if(b!=0){
		bHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore1()' /></div>";
	}
	if(c!=0){
		cHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore2()' /></div>";
	}
	if(d!=0){
		dHtml+="</div><div><img class='loadMore' src='../image/waiguan (18).png' onclick='loadmore3()' /></div>";
	}
	html=html+aHtml+bHtml+cHtml+dHtml;
	
	$(".bottomHouseboat").html(html);
	
}

function fillCodeCcontent(data){
	//alert("qqqq"+data.length);
	var a1Html="";
	var b1Html="";
	var c1Html="";
	var d1Html="";
	
	var a1=0;
	var b1=0;
	var c1=0;
	var d1=0;
	
	for(var i=0;i<data.length;i++){
		var qwe = data[i].wfirstchar;
		switch(data[i].type)
		{
			case "outline":
			
			  if(a1Html==""){
				  a1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>轮廓编码</div></div><div class='macro'>";
			  }
			  if(a1<4){
				  a1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				  a1++;
			  }else{
				  a1Html+="<div class='hengStep isLoadMore isclick'><div><img class='imgfabric' src='"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				  a1++;
			  }
			  break;
			case "color":
				
				if(b1Html==""){
					b1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>色彩编码</div></div><div class='macro'>";
				}
				if(b1<4){
					b1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
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
					  c1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
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
					d1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-bcid='"+data[i].id+"'/></div>";
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
		a1Html+="</div><div><img class='loadMore more1' src='../image/waiguan (18).png' /></div>";
		
	}
	if(b1!=0){
		b1Html+="</div><div><img class='loadMore more2' src='../image/waiguan (18).png' /></div>";
		
	}
	if(c1!=0){
		c1Html+="</div><div><img class='loadMore more3' src='../image/waiguan (18).png' /></div>";
		
	}
	if(d1!=0){
		d1Html+="</div><div><img class='loadMore more4' src='../image/waiguan (18).png' /></div>";
		
	}
	html=html+a1Html+b1Html+c1Html+d1Html;
	
	$(".codeCcontent").html(html);
	
}



function fillCodeoutline(data){
	var aHtml="";
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "收口型":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>收口型轮廓编码</div></div><div class='macro'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "满口型":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>满口型轮廓编码</div></div><div class='macro'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "收口外扩型":
				
				if(aHtml==""){
					aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>收口外扩型轮廓编码</div></div><div class='macro'>";
				}
				aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>"+aHtml+"</div>";
	$(".outlineContent").html(html);
	
}

function fillCodecolor(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "暖色":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>暖色系编码</div></div><div class='color'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "冷色":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>冷色系编码</div></div><div class='color'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
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

function fillCodecolorHouseboat(data){
	
	var kHtml="";
	var sHtml="";
	var cHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "船身色彩":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>船身色彩编码</div></div><div class='color'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "船身装饰":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>船身装饰色彩编码</div></div><div class='color'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "船身装饰线":
				
				if(cHtml==""){
					cHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>船身装饰线色彩编码</div></div><div class='color'>";
				}
				cHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
				cHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>"+cHtml+"</div>";
	$(".codeChouseboat").html(html);
}

function fillCodecolorGascooker(data){
	var kHtml="";
	var sHtml="";
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "面板色彩":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>面板色彩编码</div></div><div class='color'>";
			  }
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "冷色调":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>冷色系编码</div></div><div class='color'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	if(kHtml!=""){
		html=html+kHtml+"</div>"
	}
	if(sHtml!=""){
		html=html+sHtml+"</div>"
	}
	$(".codeCgascooker").html(html);
}

function fillCodecolorFabric(data){
	var aHtml="";
	var kHtml="";
	var sHtml="";
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "织物色彩":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>面料色彩编码</div></div><div class='color'>";
			  }
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "冷色调":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>冷色系编码</div></div><div class='color'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "全部":
				if(aHtml==""){
					aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>面料色彩编码</div></div><div class='color'>";
				}
				aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-cid='"+data[i].id+"'/></div>";
				aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+aHtml+"</div>";
	$(".codeCfabric").html(html);
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
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "杯肚":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>杯肚部件编码</div></div><div class='macro'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
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

function fillCodepartHouseboat(data){
	var a1Html="";
	var b1Html="";
	var c1Html="";
	var d1Html="";
	var e1Html="";
	var f1Html="";
	var g1Html="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "船室":
			  if(a1Html==""){
				  a1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>船室部件编码</div></div><div class='macro'>";
			  }
			  a1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
			  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "船舱":
				
				if(b1Html==""){
					b1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>船舱部件编码</div></div><div class='macro'>";
				}
				b1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				b1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "船舱2":
				  if(c1Html==""){
					  c1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>船舱2部件编码</div></div><div class='macro'>";
				  }
				  c1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				  c1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			 
				  break;
			case "顶棚":
				if(d1Html==""){
					d1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>顶棚部件编码</div></div><div class='macro'>";
				}
				d1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				d1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			case "艉部甲板":
				if(e1Html==""){
					e1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>艉部甲板部件编码</div></div><div class='macro'>";
				}
				e1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				e1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			case "通信部件":
				if(f1Html==""){
					f1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>通信部件编码</div></div><div class='macro'>";
				}
				f1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				f1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			case "舷窗":
				if(g1Html==""){
					g1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>舷窗部件编码</div></div><div class='macro'>";
				}
				g1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				g1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			default:
				break;
		}
	}
	var html="";
	
	html=html+a1Html+"</div>"+b1Html+"</div>"+c1Html+"</div>"+d1Html+"</div>"+e1Html+"</div>"+f1Html+"</div>"+g1Html+"</div>";
	
	$(".codepart").html(html);
}

function fillCodepartGascooker(data){
	var a1Html="";
	var b1Html="";
	var c1Html="";
	var d1Html="";
	var e1Html="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "炉灶":
			  if(a1Html==""){
				  a1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>炉灶部件编码</div></div><div class='macro'>";
			  }
			  a1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
			  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "面板":
				
				if(b1Html==""){
					b1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>面板部件编码</div></div><div class='macro'>";
				}
				b1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				b1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "开关":
				  if(c1Html==""){
					  c1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>开关部件编码</div></div><div class='macro'>";
				  }
				  c1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				  c1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			 
				  break;
			case "面板2":
				if(d1Html==""){
					d1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>面板2部件编码</div></div><div class='macro'>";
				}
				d1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				d1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			case "Logo":
				if(e1Html==""){
					e1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>Logo部件编码</div></div><div class='macro'>";
				}
				e1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				e1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			default:
				break;
		}
	}
	var html="";
	
	html=html+a1Html+"</div>"+b1Html+"</div>"+c1Html+"</div>"+d1Html+"</div>"+e1Html+"</div>";
	
	$(".codepart").html(html);
}

function fillCodepartFabric(data){
	var a1Html="";
	var b1Html="";
	var c1Html="";
	var d1Html="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "边框":
			  if(a1Html==""){
				  a1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>边框部件编码</div></div><div class='macro'>";
			  }
			  a1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
			  a1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "主图":
				
				if(b1Html==""){
					b1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>主图部件编码</div></div><div class='macro'>";
				}
				b1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				b1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "辅图":
				  if(c1Html==""){
					  c1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>辅图部件编码</div></div><div class='macro'>";
				  }
				  c1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				  c1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			 
				  break;
			case "织物边框":
				if(d1Html==""){
					d1Html+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>织物边框部件编码</div></div><div class='macro'>";
				}
				d1Html+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-pid='"+data[i].id+"'/></div>";
				d1Html+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				
			    break;
			default:
				break;
		}
	}
	var html="";
	
	html=html+a1Html+"</div>"+b1Html+"</div>"+c1Html+"</div>"+d1Html+"</div>";
	
	$(".codepart").html(html);
}

function fillCodetexture(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "透明":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>透明材质编码</div></div><div class='texture'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "不透明":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>不透明材质编码</div></div><div class='texture'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
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

function fillCodetextureBoat(data){
	var aHtml="";
	var bHtml="";
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "亮光漆":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>亮光漆材质编码</div></div><div class='texture'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "珠光漆":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>珠光漆材质编码</div></div><div class='texture'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "磨砂漆":
				if(aHtml==""){
					aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>磨砂漆材质编码</div></div><div class='texture'>";
				}
				aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
				aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
				break;
			case "哑光漆":
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>哑光漆材质编码</div></div><div class='texture'>";
				}
				bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
				bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>";
	$(".textureContent").html(html);
}
function fillCodetextureGascooker(data){
	
	var kHtml="";
	var sHtml="";
	var aHtml="";
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		
		switch(data[i].codetypename)
		{
			case "钢化玻璃":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>钢化玻璃材质编码</div></div><div class='texture'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "磨砂玻璃":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>磨砂玻璃材质编码</div></div><div class='texture'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "金属拉丝":
				if(aHtml==""){
					aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>金属拉丝材质编码</div></div><div class='texture'>";
				}
				aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
				aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+kHtml+"</div>"+sHtml+"</div>"+aHtml+"</div>";
	$(".textureContent").html(html);
}
function fillCodetextureFabric(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		
		switch(data[i].codetypename)
		{
			case "织物材质":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>面料材质编码</div></div><div class='texture'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "磨砂":
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>磨砂材质编码</div></div><div class='texture'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-texid='"+data[i].id+"'/></div>";
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

function fillNewcase(data){
	
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		if(kHtml==""){
			kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>新造型案例</div></div><div class='macro'>";
		}
		kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].newcaseimg+"' data-nid='"+data[i].nid+"'/></div>";
		kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].newcasename+"</div></div></div>";
		
	}
	var html="";
	html=html+kHtml+"</div>";
	$(".newcaseContent").html(html);
}

function GetRequest(loc) {
    var url = loc; //获取url中"?"符后的字串   
    var theRequest = new Object();//新建对象
    if (url.indexOf("?") != -1) { //排除没有参数的情况
        var str = url.substr(1);//抽取从第二个字符到结尾的字符子串
        strs = str.split("&");//将str以&作为分隔符分成多个部分，以数组形式存在strs里
        for (var i = 0; i < strs.length; i++) {//遍历strs数组
            theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);//使theRsquest[key] = value
        }
    }
    return theRequest;
}

function fillNewcaseGoblet(data) {
	//alert("111111111");
    $(".recomImg").attr("src","../image/"+data.newcaseimg);
    $("#comp2").html(data.newcasename);
    $(".imgtotal").attr("src","../image/"+data.newcasertotal);
    $(".imgoutline").attr("src","../image/"+data.newcaseroutline);
    $(".imgcolor").attr("src","../image/"+data.newcasercolor);
    $(".imgtexture").attr("src","../image/"+data.newcasertexture);
    $(".imgAtotal").attr("src","../image/"+data.newcaseatotal);
    $(".imgAoutline").attr("src","../image/"+data.newcaseaoutline);
    $(".imgAcolor").attr("src","../image/"+data.newcaseacolor);
    $(".imgAtexture").attr("src","../image/"+data.newcaseatexture);
    var strs = data.newcasearg;
    var result=strs.split(",");
    
    var score1 = 1;
    var score2 = 1;
    var score3 = 1;
    var score4 = 1;
    var score5 = 1;
    var score6 = 1;
    score1 = result[0];
    score2 = result[1];
    score3 = result[2];
    score4 = result[3];
    score5 = result[4];
    score6 = result[5];
    $('.score1').width(score1*90-90);
    $('.score2').width(score2*90-90);
    $('.score3').width(score3*90-90);
    $('.score4').width(score4*90-90);
    $('.score5').width(score5*90-90);
    $('.score6').width(score6*90-90);
}

function fillNewcaseHouseboat(data) {
    $(".recomImg").attr("src","../image/"+data.newcaseimg);
    $("#comp2").html(data.newcasename);
    $(".imgtotal").attr("src","../image/"+data.newcasertotal);
    $(".imgoutline").attr("src","../image/"+data.newcaseroutline);
    $(".imgcolor").attr("src","../image/"+data.newcasercolor);
    $(".imgtexture").attr("src","../image/"+data.newcasertexture);
    $(".imgAtotal").attr("src","../image/"+data.newcaseatotal);
    $(".imgAoutline").attr("src","../image/"+data.newcaseaoutline);
    $(".imgAcolor").attr("src","../image/"+data.newcaseacolor);
    $(".imgAtexture").attr("src","../image/"+data.newcaseatexture);
    var strs = data.newcasearg;
    var result=strs.split(",");
    
    var score1 = 1;
    var score2 = 1;
    var score3 = 1;
    var score4 = 1;
    var score5 = 1;
    var score6 = 1;
    score1 = result[0];
    score2 = result[1];
    score3 = result[2];
    score4 = result[3];
    score5 = result[4];
    score6 = result[5];
    
    /*$('.score1').width(score1*90-90);
    $('.score2').width(score2*90-90);
    $('.score3').width(score3*90-90);
    $('.score4').width(score4*90-90);
    $('.score5').width(score5*90-90);
    $('.score6').width(score6*90-90);*/
    if(score1>0){
    	//alert("11111111111111111111");
    	document.getElementById("score11").style.width=270+'px';
    	$(".point12").css("display","block");
        $(".point11").css("display","none");
        $('#score12').width(score1*90);
    }else{
    	document.getElementById("score12").style.width=0;
    	$(".point11").css("display","block");
        $(".point12").css("display","none");
        $('#score11').width(270-Math.abs(score1)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score2>0){
    	//alert("11111111111111111111");
    	document.getElementById("score21").style.width=270+'px';
    	$(".point22").css("display","block");
        $(".point21").css("display","none");
        $('#score22').width(score2*90);
    }else{
    	document.getElementById("score22").style.width=0;
    	$(".point21").css("display","block");
        $(".point22").css("display","none");
        $('#score21').width(270-Math.abs(score2)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score3>0){
    	//alert("11111111111111111111");
    	document.getElementById("score31").style.width=270+'px';
    	$(".point32").css("display","block");
        $(".point31").css("display","none");
        $('#score32').width(score3*90);
    }else{
    	document.getElementById("score32").style.width=0;
    	$(".point31").css("display","block");
        $(".point32").css("display","none");
        $('#score31').width(270-Math.abs(score3)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score4>0){
    	document.getElementById("score41").style.width=270+'px';
    	$(".point42").css("display","block");
        $(".point41").css("display","none");
        $('#score42').width(score4*90);
    }else{
    	document.getElementById("score42").style.width=0;
    	$(".point41").css("display","block");
        $(".point42").css("display","none");
        $('#score41').width(270-Math.abs(score4)*90);
    }

    if(score5>0){
    	document.getElementById("score51").style.width=270+'px';
    	$(".point52").css("display","block");
        $(".point51").css("display","none");
        $('#score52').width(score5*90);
    }else{
    	document.getElementById("score52").style.width=0;
    	$(".point51").css("display","block");
        $(".point52").css("display","none");
        $('#score51').width(270-Math.abs(score5)*90);
    }

    if(score6>0){
    	document.getElementById("score61").style.width=270+'px';
    	$(".point62").css("display","block");
        $(".point61").css("display","none");
        $('#score62').width(score6*90);
    }else{
    	document.getElementById("score62").style.width=0;
    	$(".point61").css("display","block");
        $(".point62").css("display","none");
        $('#score61').width(270-Math.abs(score6)*90);
    }

}

function fillNewcaseFabric(data) {
    $(".recomImg").attr("src","../image/"+data.newcaseimg);
    $("#comp2").html(data.newcasename);
    $(".imgtotal").attr("src","../image/"+data.newcasertotal);
    $(".imgoutline").attr("src","../image/"+data.newcaseroutline);
    $(".imgcolor").attr("src","../image/"+data.newcasercolor);
    $(".imgtexture").attr("src","../image/"+data.newcasertexture);
    $(".imgAtotal").attr("src","../image/"+data.newcaseatotal);
    $(".imgAoutline").attr("src","../image/"+data.newcaseaoutline);
    $(".imgAcolor").attr("src","../image/"+data.newcaseacolor);
    $(".imgAtexture").attr("src","../image/"+data.newcaseatexture);
    var strs = data.newcasearg;
    var result=strs.split(",");
    
    var score1 = 1;
    var score2 = 1;
    var score3 = 1;
    var score4 = 1;
   
    score1 = result[0];
    score2 = result[1];
    score3 = result[2];
    score4 = result[3];
    
   
    if(score1>0){
    	//alert("11111111111111111111");
    	document.getElementById("score11").style.width=270+'px';
    	$(".point12").css("display","block");
        $(".point11").css("display","none");
        $('#score12').width(score1*90);
    }else{
    	document.getElementById("score12").style.width=0;
    	$(".point11").css("display","block");
        $(".point12").css("display","none");
        $('#score11').width(270-Math.abs(score1)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score2>0){
    	//alert("11111111111111111111");
    	document.getElementById("score21").style.width=270+'px';
    	$(".point22").css("display","block");
        $(".point21").css("display","none");
        $('#score22').width(score2*90);
    }else{
    	document.getElementById("score22").style.width=0;
    	$(".point21").css("display","block");
        $(".point22").css("display","none");
        $('#score21').width(270-Math.abs(score2)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score3>0){
    	//alert("11111111111111111111");
    	document.getElementById("score31").style.width=270+'px';
    	$(".point32").css("display","block");
        $(".point31").css("display","none");
        $('#score32').width(score3*90);
    }else{
    	document.getElementById("score32").style.width=0;
    	$(".point31").css("display","block");
        $(".point32").css("display","none");
        $('#score31').width(270-Math.abs(score3)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score4>0){
    	document.getElementById("score41").style.width=270+'px';
    	$(".point42").css("display","block");
        $(".point41").css("display","none");
        $('#score42').width(score4*90);
    }else{
    	document.getElementById("score42").style.width=0;
    	$(".point41").css("display","block");
        $(".point42").css("display","none");
        $('#score41').width(270-Math.abs(score4)*90);
    }
}

function fillNewcaseGascooker(data) {
    $(".recomImg").attr("src","../image/"+data.newcaseimg);
    var s = data.newcasename.split("_");
    //alert("name = "+s[0]);
    $("#comp2").html(data.newcasename);
    $(".imgtotal").attr("src","../image/"+data.newcasertotal);
    $(".imgoutline").attr("src","../image/"+data.newcaseroutline);
    $(".imgcolor").attr("src","../image/"+data.newcasercolor);
    $(".imgtexture").attr("src","../image/"+data.newcasertexture);
    $(".imgAtotal").attr("src","../image/"+data.newcaseatotal);
    $(".imgAoutline").attr("src","../image/"+data.newcaseaoutline);
    $(".imgAcolor").attr("src","../image/"+data.newcaseacolor);
    $(".imgAtexture").attr("src","../image/"+data.newcaseatexture);
    var strs = data.newcasearg;
    var result=strs.split(",");
    
    var score1 = 1;
    var score2 = 1;
    var score3 = 1;
    var score4 = 1;
    var score5 = 1;
   
    score1 = result[0];
    score2 = result[1];
    score3 = result[2];
    score4 = result[3];
    score5 = result[4];
    
   
    if(score1>0){
    	//alert("11111111111111111111");
    	document.getElementById("score11").style.width=270+'px';
    	$(".point12").css("display","block");
        $(".point11").css("display","none");
        $('#score12').width(score1*90);
    }else{
    	document.getElementById("score12").style.width=0;
    	$(".point11").css("display","block");
        $(".point12").css("display","none");
        $('#score11').width(270-Math.abs(score1)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score2>0){
    	//alert("11111111111111111111");
    	document.getElementById("score21").style.width=270+'px';
    	$(".point22").css("display","block");
        $(".point21").css("display","none");
        $('#score22').width(score2*90);
    }else{
    	document.getElementById("score22").style.width=0;
    	$(".point21").css("display","block");
        $(".point22").css("display","none");
        $('#score21').width(270-Math.abs(score2)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score3>0){
    	//alert("11111111111111111111");
    	document.getElementById("score31").style.width=270+'px';
    	$(".point32").css("display","block");
        $(".point31").css("display","none");
        $('#score32').width(score3*90);
    }else{
    	document.getElementById("score32").style.width=0;
    	$(".point31").css("display","block");
        $(".point32").css("display","none");
        $('#score31').width(270-Math.abs(score3)*90);
        //$('#score11').csscss({"width":90px;});
    }

    if(score4>0){
    	document.getElementById("score41").style.width=270+'px';
    	$(".point42").css("display","block");
        $(".point41").css("display","none");
        $('#score42').width(score4*90);
    }else{
    	document.getElementById("score42").style.width=0;
    	$(".point41").css("display","block");
        $(".point42").css("display","none");
        $('#score41').width(270-Math.abs(score4)*90);
    }
    
    if(score5>0){
    	document.getElementById("score51").style.width=270+'px';
    	$(".point52").css("display","block");
        $(".point51").css("display","none");
        $('#score52').width(score5*90);
    }else{
    	document.getElementById("score52").style.width=0;
    	$(".point51").css("display","block");
        $(".point52").css("display","none");
        $('#score51').width(270-Math.abs(score5)*90);
    }
}

function fillCodeoutlineFabric(data){
	var aHtml="";
	var bHtml="";
	var kHtml="";
	var sHtml="";
	
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].codetypename)
		{
			case "兽纹图案":
			  if(aHtml==""){
				  aHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>兽纹图案轮廓编码</div></div><div class='macro'>";
			  }
			 
			  aHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
			  aHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "鸟纹图案":
			
				if(bHtml==""){
					bHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>鸟纹图案轮廓编码</div></div><div class='macro'>";
				}
				bHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				bHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			case "几何图案":
			  if(kHtml==""){
				  kHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>几何图案轮廓编码</div></div><div class='macro'>";
			  }
			 
			  kHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
			  kHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			  break;
			case "花草图案":
			
				if(sHtml==""){
					sHtml+="<div><div id='inputcorpus' id='style1' style='padding-top: 5.5px;'>花草图案轮廓编码</div></div><div class='macro'>";
				}
				sHtml+="<div class='hengStep isclick'><div><img class='imgfabric' src='../image/"+data[i].caseimg+"' data-oid='"+data[i].id+"'/></div>";
				sHtml+="<div class='lunkuo1'><div class='descri1' >"+data[i].codename+"</div></div></div>";
			    break;
			default:
				break;
		}
	}
	var html="";
	html=html+aHtml+"</div>"+bHtml+"</div>"+kHtml+"</div>"+sHtml+"</div>";
	$(".outlineContent").html(html);
	
	
}



