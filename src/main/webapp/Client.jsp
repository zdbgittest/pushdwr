<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Client</title>

<script type="text/javascript" src="dwr/util.js"></script>

<script type="text/javascript" src="dwr/engine.js"></script>

<script type="text/javascript" src="dwr/interface/SendMsg.js"></script>

<script type="text/javascript" src="js/jquery-3.1.1.js"></script>

<script type="text/javascript">

$(function(){

dwr.engine.setActiveReverseAjax(true);

});

/*

 * 后台推送消息调用函数

 */

function show(msg){

$("#message").text(msg);

}

</script>

</head>

<body>

<h1>消息接收端</h1>

<div id="message"

	style="width: 300px; height: 100px; border: 1px solid #CDCDCD; text-align: left; padding: 5px;"></div>

</body>

</html>
