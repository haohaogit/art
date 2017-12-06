$(".loginbtn").click(function(){
	var listUrl=contextPath + "/manager/productMaintenance/list";
	var url=contextPath + "/managerLogin";
	var account=$("#account").val();
	var password=$("#password").val();
	var params={
			account:account,
			password:password
	};
	$.ajax(url,
			// 发送请求的URL字符串
			{
				//dataType : "json", //
				type: "post",      //
				//contentType: "application/json",  //
				//data: JSON.stringify({uname:name,uemail:email,upassword:password,cpassword:cpassword}),
				//data:{ds:JSON.stringify(params)},
				data:params,
				async:true,  //
				
				success: function(data){
					//alert("数据发送成功denglu");
					window.location.href= listUrl;
				},
				error: function(){
					alert("密码或用户名错误！");
				}
			});
	/*$.get(url,params,function(data,status){
		alert("登陆成功");
//		window.location.href= listUrl;
	});*/
	//window.location.href= listUrl;
});