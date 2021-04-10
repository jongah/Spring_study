package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("생성자");
	}
}
