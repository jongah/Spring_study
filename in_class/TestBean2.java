package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class TestBean2 {
	private int a;
	private String b;
	@Autowired
	private DataBean3 d3;
	@Autowired
	private DataBean4 d4;
	// 자동으로 셋터를 호출해서 DataBean 객체를 주입시킨다. 
	//databean bean 이 등록되어 있으면 주소값을 대입한다. 
	
	@Override
	public String toString() {
		return "TestBean2 [a=" + a + ", b=" + b + ", d3=" + d3 + ", d4=" + d4 + "]";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public DataBean3 getD3() {
		return d3;
	}
	public void setD3(DataBean3 d3) {
		this.d3 = d3;
	}
	public DataBean4 getD4() {
		return d4;
	}
	public void setD4(DataBean4 d4) {
		this.d4 = d4;
	}
	
}
