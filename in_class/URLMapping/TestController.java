package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	/*
	 * @RequestMapping(value = "/test1", method = RequestMethod.GET) public String
	 * test1() { System.out.println("test1"); return "/WEB-INF/views/test5.jsp"; }
	 */
	//istest1 == href 와 일치하면 된다.
	@GetMapping("istest1")
	public String test1() {
		return "test1";
	}
}
