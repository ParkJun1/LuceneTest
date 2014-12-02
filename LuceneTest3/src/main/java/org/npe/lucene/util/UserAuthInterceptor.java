package org.npe.lucene.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserAuthInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest req, 
			HttpServletResponse res, 
			Object handler) throws Exception {
		// TODO Auto-generated method stub
		Cookie[] cookies = req.getCookies();
		
		System.out.println("preHandle....................");
		if(cookies == null || cookies.length == 0) {
			System.out.println("preHandle() 쿠키없음 로그인 해야함...........");
			res.sendRedirect("/login/check");
			return false;
		}
		
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("login")) {
				System.out.println("preHandle() 쿠키있음...........");
				System.out.println(cookie.getName() + " : " + cookie.getValue());
				return true;
			}
		}
//		if(req.getSession().getAttribute("admin") == null ) {
//			System.out.println("preHandle() 로그인 해야함...........");
//			res.sendRedirect("/login/check"); 
//            return false;
//		}
		
		res.sendRedirect("/login/check");
		return false;
	}
}
