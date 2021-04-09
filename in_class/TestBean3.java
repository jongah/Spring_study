package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TestBean3 {
	private int data1;
	private double data2;
	private DataBean3 data3;
	private DataBean4 data4;
	
	@Override
	public String toString() {
		return "TestBean3 [data1=" + data1 + ", data2=" + data2 + ", data3=" + data3 + ", data4=" + data4 + "]";
	}
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public double getData2() {
		return data2;
	}
	public void setData2(double data2) {
		this.data2 = data2;
	}
	public DataBean3 getData3() {
		return data3;
	}
	public void setData3(DataBean3 data3) {
		this.data3 = data3;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}
	
	public TestBean3(DataBean3 data3, DataBean4 data4) {
		this.data3 = data3;
		this.data4 = data4;
	}
	
	@Autowired
	public TestBean3(@Value("100") int data1, @Value("33.33") double data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
}
