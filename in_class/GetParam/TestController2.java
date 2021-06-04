package kr.hs.study.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController2 {
	@GetMapping("/test")
	public String test1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		System.out.println(a + b + c);
		return "result";
	}
	@GetMapping("/test2")
	public String test2(HttpServletRequest req) {
		String a = req.getParameter("a");
		String b = req.getParameter("b");
		String [] c = req.getParameterValues("c");
		System.out.println(a + "\n" + b);
		for(String value : c)
			System.out.println(value);
		return "result";
	}
	@GetMapping("/test3")
	public String test3(WebRequest req) {
		String a = req.getParameter("a");
		String b = req.getParameter("b");
		String c = req.getParameter("c");
		System.out.println(a + "\n" + b + "\n" + c);
		return "result";
	}
	@GetMapping("/test4")
	public String test4() {
		return "test4_form";
	}
	@PostMapping("/test4")
	public String test4_form(WebRequest req) {
		String id = req.getParameter("id");
		String pass = req.getParameter("password");
		System.out.println(id + "\n" + pass);
		return "result";
	}
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return "result";
	}
}
