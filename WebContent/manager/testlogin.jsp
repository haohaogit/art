<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%Object ll = request.getAttribute("types"); %>>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>managerlogin</title>
<script>
var types = <%= ll%>;
alert(types[1].tid);
/* var demo=session.getAttribute("types")
alert(demo); */
</script>
</head>
<body>
 ${TAnli}</br> ${bottomcasetypes}</br>${outlinetypes}</br> ${colortypes}</br>
 ${texturetypes}</br> ${parttypes}</br> ${TBianma }</br>${outlinetypes }</br>qqqqq${outline}</br>${codecases}</br>${texture }</br>
 ${types }</br>newcases ${newcases}</br>vocas ${words}</br>cidui ${cidui}</br>
</body>
</html>