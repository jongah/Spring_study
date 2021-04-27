package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.loginDAO;
import kr.hs.study.dto.loginDTO;


public class MainClass {

   public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		loginDAO dao = ctx.getBean(loginDAO.class);
		loginDTO dto = ctx.getBean(loginDTO.class);
		
		/*
		 * dto.setUserid("kim"); dto.setUserpass(1111); dao.insert_data(dto);
		 */
		loginDTO dto2 = ctx.getBean(loginDTO.class);
		dto2.setUserid("park");
		dto2.setUserpass(4444);
		dao.update_data(dto);
		ctx.close();
   }
}