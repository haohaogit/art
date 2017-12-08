function getHtmlfirstchar(data){
				//alert(data[0].wsimilar);
				var aHtml="";
				var bHtml="";
				var cHtml="";
				var dHtml="";
				var eHtml="";
				var fHtml="";
				var gHtml="";
				var hHtml="";
				var iHtml="";
				var jHtml="";
				var kHtml="";
				var lHtml="";
				var mHtml="";
				var nHtml="";
				var oHtml="";
				var pHtml="";
				var qHtml="";
				var rHtml="";
				var sHtml="";
				var tHtml="";
				var uHtml="";
				var vHtml="";
				var wHtml="";
				var xHtml="";
				var yHtml="";
				var zHtml="";
				for(var i=0;i<data.length;i++){
					//var qwe = data[i].wfirstchar;
					switch(data[i].wfirstchar)
					{
						case "A":
						  if(aHtml==""){
							  aHtml+="<div class='char1'>A</div><div class='macro'>";
						  }
						  var similarList = data[i].wsimilar.split(' ');
						  var oppositeList = data[i].woposite.split(' ');
						  aHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
						  aHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
						  aHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
						   
						  break;
						case "B":
							if(bHtml==""){
								  bHtml+="<div class='char1'>B</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  bHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  bHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  bHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "C":
							 //alert(data[i].wword);
							if(cHtml==""){
								  cHtml+="<div class='char1'>C</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  cHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  cHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  cHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
					    case "D":
					    	if(dHtml==""){
								  dHtml+="<div class='char1'>D</div><div class='macro'>";
							  }
					    	  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  dHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  dHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  dHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							    
						  break;
						case "E":
							if(eHtml==""){
								  eHtml+="<div class='char1'>E</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  eHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  eHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  eHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "F":
							if(fHtml==""){
								  fHtml+="<div class='char1'>F</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  fHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  fHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  fHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "G":
							if(gHtml==""){
								  gHtml+="<div class='char1'>G</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  gHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  gHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  gHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "H":
							if(hHtml==""){
								  hHtml+="<div class='char1'>H</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  hHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  hHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  hHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							    
						  break;
						case "I":
							if(iHtml==""){
								  iHtml+="<div class='char1'>I</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  iHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  iHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  iHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "J":
							if(jHtml==""){
								  jHtml+="<div class='char1'>J</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  jHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  jHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  jHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "K":
							if(kHtml==""){
								  kHtml+="<div class='char1'>K</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  kHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  kHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  kHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "L":
							if(lHtml==""){
								  lHtml+="<div class='char1'>L</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  lHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  lHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  lHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "M":
							if(mHtml==""){
								  mHtml+="<div class='char1'>M</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  mHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  mHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  mHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "N":
							if(nHtml==""){
								  nHtml+="<div class='char1'>N</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  nHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  nHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  nHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "O":
							if(oHtml==""){
								  oHtml+="<div class='char1'>O</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  oHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  oHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  oHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "P":
							if(pHtml==""){
								  pHtml+="<div class='char1'>P</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  pHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  pHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  pHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "Q":
							if(qHtml==""){
								  qHtml+="<div class='char1'>Q</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  qHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  qHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  qHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "R":
							if(rHtml==""){
								  rHtml+="<div class='char1'>R</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  rHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  rHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  rHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "S":
							if(sHtml==""){
								  sHtml+="<div class='char1'>S</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  sHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  sHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  sHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "T":
							if(tHtml==""){
								  tHtml+="<div class='char1'>T</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  tHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  tHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  tHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "U":
							if(uHtml==""){
								  uHtml+="<div class='char1'>U</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  uHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  uHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  uHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "V":
							if(vHtml==""){
								  vHtml+="<div class='char1'>V</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  vHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  vHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  vHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "W":
							if(wHtml==""){
								  wHtml+="<div class='char1'>W</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  wHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  wHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  wHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "X":
							if(xHtml==""){
								  xHtml+="<div class='char1'>X</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  xHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  xHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  xHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "Y":
							if(yHtml==""){
								  yHtml+="<div class='char1'>Y</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  yHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  yHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  yHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;
						case "Z":
							if(zHtml==""){
								  zHtml+="<div class='char1'>Z</div><div class='macro'>";
							  }
							  var similarList = data[i].wsimilar.split(' ');
							  var oppositeList = data[i].woposite.split(' ');
							  zHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
							  zHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
							  zHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
							   
						  break;  
						default:
						  alert("数据库首字母分类错误");
					}
				}
				var html="";
				html=html+aHtml+"</div>"+bHtml+"</div>"+cHtml+"</div>"+dHtml+"</div>"+eHtml+"</div>"+fHtml+"</div>";
				html=html+gHtml+"</div>"+hHtml+"</div>"+iHtml+"</div>"+jHtml+"</div>"+kHtml+"</div>"+lHtml+"</div>";
				html=html+mHtml+"</div>"+nHtml+"</div>"+oHtml+"</div>"+pHtml+"</div>"+qHtml+"</div>"+rHtml+"</div>";
				html=html+sHtml+"</div>"+tHtml+"</div>"+uHtml+"</div>"+vHtml+"</div>"+wHtml+"</div>"+xHtml+"</div>";
				html=html+yHtml+"</div>"+zHtml+"</div>";
				$(".wordType").html(html);
			}



function getHtmlvocabularyType(data){
	
	var aHtml="";
	var bHtml="";
	var cHtml="";
	var dHtml="";
	var eHtml="";
	var fHtml="";
	var gHtml="";
	var hHtml="";
	var iHtml="";
	var jHtml="";
	var kHtml="";
	var lHtml="";
	var mHtml="";
	var nHtml="";
	var oHtml="";
	var pHtml="";
	var qHtml="";
	var rHtml="";
	var sHtml="";
	var tHtml="";
	var uHtml="";
	var vHtml="";
	var wHtml="";
	var xHtml="";
	var yHtml="";
	var zHtml="";
	for(var i=0;i<data.length;i++){
		//var qwe = data[i].wfirstchar;
		switch(data[i].wvocatype)
		{
			case "大气":
			  if(aHtml==""){
				  aHtml+="<div class='char1'>大气</div><div class='macro'>";
			  }
			  var similarList = data[i].wsimilar.split(' ');
			  var oppositeList = data[i].woposite.split(' ');
			  aHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
			  aHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
			  aHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
			   
			  break;
			case "优雅":
				if(bHtml==""){
					  bHtml+="<div class='char1'>优雅</div><div class='macro'>";
				  }
				  var similarList = data[i].wsimilar.split(' ');
				  var oppositeList = data[i].woposite.split(' ');
				  bHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
				  bHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
				  bHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
				   
			  break;
			case "C":
				 //alert(data[i].wword);
				if(cHtml==""){
					  cHtml+="<div class='char1'>C</div><div class='macro'>";
				  }
				  var similarList = data[i].wsimilar.split(' ');
				  var oppositeList = data[i].woposite.split(' ');
				  cHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
				  cHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
				  cHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
				   
			  break;
		    case "D":
		    	if(dHtml==""){
					  dHtml+="<div class='char1'>D</div><div class='macro'>";
				  }
		    	  var similarList = data[i].wsimilar.split(' ');
				  var oppositeList = data[i].woposite.split(' ');
				  dHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
				  dHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
				  dHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
				    
			  break;
			case "E":
				if(eHtml==""){
					  eHtml+="<div class='char1'>E</div><div class='macro'>";
				  }
				  var similarList = data[i].wsimilar.split(' ');
				  var oppositeList = data[i].woposite.split(' ');
				  eHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
				  eHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
				  eHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
				   
			  break;
			case "F":
				if(fHtml==""){
					  fHtml+="<div class='char1'>F</div><div class='macro'>";
				  }
				  var similarList = data[i].wsimilar.split(' ');
				  var oppositeList = data[i].woposite.split(' ');
				  fHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
				  fHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
				  fHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
				   
			  break;
			case "G":
				if(gHtml==""){
					  gHtml+="<div class='char1'>G</div><div class='macro'>";
				  }
				  var similarList = data[i].wsimilar.split(' ');
				  var oppositeList = data[i].woposite.split(' ');
				  gHtml+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
				  gHtml+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
				  gHtml+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
				   
			  break;
			
			
			default:
			  alert("数据库词汇类型分类错误");
		}
	}
	var html="";
	html=html+aHtml+"</div>"+bHtml+"</div>"+cHtml+"</div>"+dHtml+"</div>"+eHtml+"</div>"+fHtml+"</div>";
	html=html+gHtml+"</div>"+hHtml+"</div>"+iHtml+"</div>"+jHtml+"</div>"+kHtml+"</div>"+lHtml+"</div>";
	html=html+mHtml+"</div>"+nHtml+"</div>"+oHtml+"</div>"+pHtml+"</div>"+qHtml+"</div>"+rHtml+"</div>";
	html=html+sHtml+"</div>"+tHtml+"</div>"+uHtml+"</div>"+vHtml+"</div>"+wHtml+"</div>"+xHtml+"</div>";
	html=html+yHtml+"</div>"+zHtml+"</div>";
	$(".wordType").html(html);
}


function fillWordDetaiInfo(data){
	var html="";
	html+="<div style='display: flex;justify-content: space-between;'><div class='char1'>"+data.wword+"</div>";
	html+="<div style='padding-top: 11px;'><button class='button1' onclick='returnLast()'>返回</button></div></div>";
	html+="<div id='inputcorpus'><div id='corpusword' style='padding-top: 5.5px;'>基本释义</div></div>";
	html+="<div style='border: 1px solid #acb0b1; margin-bottom: 32px;'><div class='basicDes' style='padding:6px;'>"+data.wbasic+"</div></div>";
	html+="<div id='inputcorpus'><div id='corpusword' style='padding-top: 5.5px;'>详细释义</div></div>";
	html+="<div style='border: 1px solid #acb0b1; margin-bottom: 32px;'><div class='detailDes' style='padding:6px;' >"+data.wdetail+"<br></div></div>";
	html+="<div id='inputcorpus'><div id='corpusword' style='padding-top: 5.5px;'>近义词</div></div>";
	html+="<div style='border: 1px solid #acb0b1; margin-bottom: 32px;'><div class='similarDes' style='padding:6px;'>"+data.wsimilar+"</div></div>";
	html+="<div id='inputcorpus'><div id='corpusword' style='padding-top: 5.5px;'>反义词</div></div>";
	html+="<div style='border: 1px solid #acb0b1; margin-bottom: 32px;'><div class='reverseDes' style='padding:6px;'>"+data.woposite+"</div></div>";
	
	$(".detailInfo").html(html);
	
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

function filldimensionContent(data){
	var html="";
	for(var i=0;i<data.length;i++){
		var similarList = data[i].wsimilar.split(' ');
		var oppositeList = data[i].woposite.split(' ');
		html+="<div class='hengStep1 isclick'><div id='"+data[i].wid+"' class='word'>"+data[i].wword+"</div>";
		html+="<div class='descri2'><div>近义词：<lable class='w11'>"+similarList[0]+" "+similarList[1]+"</lable></div>";
		html+="<div>反义词：<lable class='w12'>"+oppositeList[0]+" "+oppositeList[1]+"</lable></div><div>类型：<lable class='w12'>"+data[i].wid+"</lable></div></div></div>";
	}
	$(".macro").html(html);
}
function fillquestionHref(data){
	
	
	/*$('.hengStep1').forEach(function(value, index){
		value.click(function(){
			window.open(hrafList[index]);
		});
		// value[0].href = hrafList[index];
	})*/
	
	$('.hengStep1').eq(0).attr('data-url',data.wordsurvey);
	$('.hengStep1').eq(1).attr('data-url',data.wordresult);
	$('.hengStep1').eq(2).attr('data-url',data.connectsurvey);
	$('.hengStep1').eq(3).attr('data-url',data.connectresult);
	$('.hengStep2').eq(0).attr('data-url',data.choosesurvey);
	$('.hengStep2').eq(1).attr('data-url',data.ratio);
	$('.hengStep2').eq(2).attr('data-url',data.algorithms);
	
	/*
	$('.hengStep1').eq(2).click(function(){
		alert("data.connectsurvey");
		window.open(data.connectsurvey);
	});*/
	
	
}

