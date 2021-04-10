package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;
public class MainClass {

   public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean(TestBean1.class);
		System.out.println(t1);
		
		TestBean3 t2 = ctx.getBean(TestBean3.class);
		System.out.println(t2);

		TestBean3 t3 = ctx.getBean(TestBean3.class);
		System.out.println(t3);
		
		TestBean3 t4 = ctx.getBean(TestBean3.class);
		System.out.println(t4);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean1 j1 = ctx2.getBean(TestBean1.class);
		System.out.println(j1);
		
		ctx.close();
		ctx2.close();
   }
}