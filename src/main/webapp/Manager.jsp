<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Manager</title>

<script type="text/javascript" src="dwr/util.js"></script>

<script type="text/javascript" src="dwr/engine.js"></script>

<script type="text/javascript" src="dwr/interface/SendMsg.js"></script>

<script type="text/javascript" src="js/jquery-3.1.1.js"></script>

<script type="text/javascript">

$(function(){

dwr.engine.setActiveReverseAjax(true);

$("#send").click(function(){

	SendMsg.sendMsg($("#msg").val());

});

});

</script>

</head>

<body>

<h1>消息发送端</h1>

向客户端发送消息：

<input type="text" name="msg" id="msg"/>

<input type="button" value="发送" id="send"/>

</body>

</html>
