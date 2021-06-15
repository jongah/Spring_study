package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.hs.study.model.modelDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("id", "kim");
		model.addAttribute("pw", "1111");
		return"test2";
	}
	@GetMapping("/test3")
	public String test3() {
		return"test3";
	}
	@GetMapping("/test3_1")
	public String test3_1(@ModelAttribute modelDTO dto, Model model) {
		model.addAttribute("id",dto.getId());
		model.addAttribute("pw",dto.getPw());
		return"test3_1";
	}
}
