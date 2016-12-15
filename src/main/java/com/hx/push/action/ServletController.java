package com.hx.push.action;


import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 这里边都是一些前往页面，各种的管理和测试页面，
 * 注意：人工推送的页面的方法都是push开头
 * 	   测试推送的页面的方法都是以test开头
 * @author zyq
 *
 * 2016年12月5日
 */
@Controller
@RequestMapping("/servlet")
public class ServletController extends BaseAction{
	
	//前往一个各种链接的页面，包含各种管理也测试页面，下边就是他们的方法
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String toLogin(HttpServletRequest request) {
		return "/index";
	}
	
	
	//去测试推送工具
	@RequestMapping(value = "/testPushTime", method = RequestMethod.GET)
	public String testPushTime(HttpServletRequest request) {
		return "/testPushTime";
	}
	
	
	//前往人工推送页面
	@RequestMapping(value = "/pushTimeToClient", method = RequestMethod.GET)
	public String pushTimeToClient(HttpServletRequest request){
//		request.setAttribute("number", PushTimeServlet.getConnectionsNum());
		return "/pushTimeToClient";
	}
	
	
	//ajax进行推送
	@RequestMapping(value = "/ajaxPush", method = RequestMethod.GET)
	public void ajaxPush(HttpServletRequest request,HttpServletResponse response){
//		PushTimeServlet.broadcast(MyUtils.getDate1());
		
		writeAjaxString("1");
	}
	
	
	//前往一个能创建255个连接的页面
	@RequestMapping(value = "/toCreateManyLink", method = RequestMethod.GET)
	public String toCreateManyLink(HttpServletRequest request){
		return "/toCreateManyLink";
	}
	
	
	
	@RequestMapping(value = "/toTestDwr", method = RequestMethod.GET)
	public String toTestDwr(HttpServletRequest request){
		
		WebContext contex=WebContextFactory.get();

		//获取client.jsp页面的ScriptSession集合，注意："/dwrpush/client.jsp"

		Collection<ScriptSession> sessions=contex.getScriptSessionsByPage("/Client.jsp");

		Util util=new Util(sessions);

		ScriptBuffer sb=new ScriptBuffer();

		sb.appendScript("show(");

		sb.appendData("134324"); 

		sb.appendScript(")");

		util.addScript(sb);
		
		return "/toTestDwr";
	}
}
