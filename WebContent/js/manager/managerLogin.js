$(".loginbtn").click(function(){
	var listUrl=contextPath + "/manager/productMaintenance/list";
	var url=contextPath + "/managerLogin";
	var account=$("#account").attr("value");
	var password=$("#password").attr("value");
	var params={
			account:account,
			password:password
	};
	$.get(url,params,function(data,status){
		alert("登陆成功");
//		window.location.href= listUrl;
	});
	window.location.href= listUrl;
});