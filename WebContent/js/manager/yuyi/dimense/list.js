var toEditUrl ="edit";
var todeleteUrl ="delete";
var  wid= "";
//function Refresh() {
//	for(i=0;i<1;i++){
//		location.reload([true]);
//	}
//}(".Refresh").click();
$(".Refresh").click(function () {
	debugger
	for(i=0;i<1;i++){
		location.reload([true]);
	}
});
//var viewUrl = contextPath + "/manager/linkedUnit/view.do";
$(".addbtn").click(function () {
    toEdit(this.rel);
});

$(".wbtn").click(function (){
	debugger;
	wid = $(this).attr("wid");
	
	$(".deletebtn").click(function () {
	    toDelete(wid);
	});
});

$(".deletebtn").click(function () {
	debugger;
	//alert("您确定要删除"++"词汇吗");
    toDelete(wid);
    //alert("this.rel "+this.rel);
});

function toEdit(id) {
    var url = toEditUrl + "?tt=" + Math.random(0, 100);
    if(id != null){
    	 url += "&id=" + id;
    }
    window.location.href= url;
}
function toDelete(wid) {
	
    var url = todeleteUrl + "?tt=" + Math.random(0, 100);
    if(wid != null){
    	 url += "&wid=" + wid;
    }
    //alert("url "+url);
    window.location.href= url;
}
var ahtml= "";
$(".vocaBtn").on("click",".cihuibtn",function(){
	debugger;
	
	$(".cihuiType").css({display:'block'});
	$(".ciduiType").css({display:'none'});
	
	/*ahtml = "";
	ahtml += "<c:forEach var='type' items='"+${typesList}+"' varStatus='status'>";
	ahtml += "<div class='mydiv'  myid='"+${type.tid }+"'>"+${type.tname }+"";
	ahtml += "<c:forEach var='wordList' items='"+${wordListMap}+"' varStatus='status'>";
	ahtml += "<c:if test='"+${wordList.key ==type.tid}+"'>";
	ahtml += "<c:forEach var='word' items='"+${wordList.value}+"' varStatus='status'>";
	ahtml += "<button type='button' class='btn btn-link wbtn' jwid='"+${word.jwid}+"'>"+${word.wword}+"</button>";
	ahtml += "</c:forEach></c:if></c:forEach></div></c:forEach>";
	$(".vocaType").html(ahtml);*/
});
$(".vocaBtn").on("click",".ciduibtn",function(){
	debugger;
	
	$(".cihuiType").css({display:'none'});
	$(".ciduiType").css({display:'block'});
	
});

