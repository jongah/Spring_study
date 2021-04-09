package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {

   public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx.getBean(TestBean.class);
		System.out.println(t1);
		
		TestBean2 t3 = ctx.getBean(TestBean2.class);
		System.out.println(t3.toString());
		
		System.out.println("---------------------------------------------------");
		
		TestBean3 t5 = ctx.getBean(TestBean3.class);
		System.out.println(t5.toString());
		
		System.out.println("-----------------------------------------------");
		AnnotationConfigApplicationContext ctx3 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean t2 = ctx3.getBean(TestBean.class);
		System.out.println(t2);
		
		TestBean2 t4 = ctx3.getBean(TestBean2.class);
		System.out.println(t4.toString());
		
		TestBean3 j1 = ctx3.getBean("j1", TestBean3.class);
		System.out.println(j1.toString());
		
		ctx.close();
		ctx3.close();
   }

}