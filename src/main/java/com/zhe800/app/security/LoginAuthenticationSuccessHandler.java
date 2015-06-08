package com.zhe800.app.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录验证成功处理器
 */

public class LoginAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	
	private static Logger log = LoggerFactory.getLogger(LoginAuthenticationSuccessHandler.class);
	
	//登录验证成功后需要跳转的url
	private String url;
	
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		log.info("登录验证成功："+request.getContextPath()+url);
		//response.sendRedirect(request.getContextPath()+url);
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

}
