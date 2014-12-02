package org.npe.lucene.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("HomeController")
@RequestMapping("/home/*")
public class HomeController {

	private static Logger logger = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String home(HttpServletRequest req, 
					HttpServletResponse res,
					Model model) throws Exception {
		
		if(req.getCookies() != null) {
			Cookie[] cookies = req.getCookies();
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("login")) {
					System.out.println("다시메인페이지...쿠키있음...........");
					System.out.println(cookie.getName() + " : " + cookie.getValue());
					model.addAttribute("userName", cookie.getValue());
				}
			}
		}
		
		return "home/main";
	}
	
	
	
	
	
	
}
