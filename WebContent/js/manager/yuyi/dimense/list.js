var toEditUrl ="edit";
var todeleteUrl ="delete";
//function Refresh() {
//	for(i=0;i<1;i++){
//		location.reload([true]);
//	}
//}
$(".Refresh").click();
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
$(".deletebtn").click(function () {
	alert("aaaaaa");
    toDelete(this.rel);
});

function toEdit(id) {
    var url = toEditUrl + "?tt=" + Math.random(0, 100);
    if(id != null){
    	 url += "&id=" + id;
    }
    window.location.href= url;
}

