package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
		//servlet-context 미사용 return "/WEB-INF/views/index.jsp";
		// return "test.jsp" 컨트롤러에서 나온 결과를 jsp 형식으로 view에 줘야하나까
	}
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String test5() {
		System.out.println("Test5");
		return "/WEB-INF/views/test5.jsp";
		//return WEB-INF/views/test5.jsp
		//상대경로 기준위치는 현재 나의 위치 value = /sub1/test1 일때
		//sub1/WEB-INF/views/test5.jsp로 이동
		//
	}
}
