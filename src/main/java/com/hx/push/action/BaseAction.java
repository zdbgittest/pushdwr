package com.hx.push.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



public class BaseAction {
	/**
	 * 得到Request
	 * @return
	 */
	public HttpServletRequest getRequest() {
		ServletRequestAttributes attr = (ServletRequestAttributes) 
				RequestContextHolder.currentRequestAttributes(); 
        HttpServletRequest request = attr.getRequest();
		return request;
	}
	
	/**
	 * 得到response
	 */
	public HttpServletResponse getResponse(){
		ServletRequestAttributes attr = (ServletRequestAttributes) 
                RequestContextHolder.currentRequestAttributes(); 
        HttpServletResponse response = attr.getResponse();
		return response;
	}
	
	/**
	 * 得到session
	 */
	public HttpSession getSession() {
		return getRequest().getSession();
	}
	
	/**
	 * 返回数据给ajax，指定头ContentType
	 * 
	 * @param data
	 */
	public void writeAjaxString(String data) {
		PrintWriter out = null;
		try {
			getResponse().setCharacterEncoding("utf-8");
			getResponse().setContentType("text/plain");
			out = getResponse().getWriter();			
			out.write(data);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out!=null) out.close();
		}
	}
}
