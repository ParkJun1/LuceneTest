package org.npe.lucene.web;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.npe.lucene.service.UserService;
import org.npe.lucene.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("LoginController")
@RequestMapping("/login/*")
public class LoginController {
	
	@Inject
	UserService service;

	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="/check", method=RequestMethod.GET)
	public String check() throws Exception {
		return "user/check";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() throws Exception {	
		return "user/login";
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public String addUser() throws Exception {
		return "user/addUser";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST, produces="text/html;charset=UTF-8")
	public String logIn(UserVO userVO, 
					HttpServletRequest req,
					HttpServletResponse res,
					Model model) throws Exception {
		
		String returnURL = "";

		UserVO dbUserVO = service.checkUser(userVO);
		
		if(dbUserVO!=null && dbUserVO.getPassword().equals(userVO.getPassword())) {
			
			Cookie ck = new Cookie("login", dbUserVO.getUser_id());
			
			ck.setMaxAge(600); //-1은 browser메모리 상에서만 cookie저장
			ck.setPath("/");
			res.addCookie(ck);
			
			System.out.println("logIn()....cookie생성됨...");
			System.out.println(ck.getName() + " : " + ck.getValue());
			
			model.addAttribute("userName", ck.getValue());
			//res.sendRedirect("/home/main");
		}
		
//		} else {
//			returnURL = "아이디 혹은 비밀번호가 일치하지 않습니다.";
//		}
		
//		if(userVO.getUser_id().equals("admin") && userVO.getPassword().equals("1234")) {
//			System.out.println("admin유저 맞음 session생성.......");
//	        req.getSession(true).setAttribute("admin", userVO);	       
//	        returnURL = "/home/main";
//	    } else {
//	    	System.out.println("admin유저 아님 다시 로그인창으로.......");
//	        returnURL = "redirect:/home/main"; 
//	    }
		
		return "/home/main";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logOut(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
//		HttpSession session = req.getSession();
//		session.invalidate();
		
		Cookie loginCookie = null;
        Cookie[] cookies = req.getCookies();
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login")) {
                    loginCookie = cookie;
                    
                    break;
                }
            }
        }
        
        if (loginCookie != null) {
        	System.out.println("logOut().....쿠키삭제.........");
        	//loginCookie.setValue(null);
        	loginCookie.setPath("/");
            loginCookie.setMaxAge(0);
            res.addCookie(loginCookie);
        }
        System.out.println("cookie name: "+loginCookie.getName());
        System.out.println("getMaxAge: "+loginCookie.getMaxAge());
		return "/home/main";
	}
	
//	@RequestMapping("/member")
//	public String member() {
//		return "lucene/start";
//	}
}
