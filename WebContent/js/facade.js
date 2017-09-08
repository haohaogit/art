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
				



