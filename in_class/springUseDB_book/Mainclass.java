package kr.hs.study.main;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.bookDAO;
import kr.hs.study.dto.bookDTO;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		bookDTO dto = ctx.getBean(bookDTO.class);
		bookDAO dao = ctx.getBean(bookDAO.class);
		Date d = new Date();
		dto.setIndex(55555);
		dto.setTitle("안녕하세요");
		dto.setAuthor("helloworld");
		dto.setPrice(300000);
		dto.setPub_date(d);
		dao.insert_data(dto);
		
		List<bookDTO> list = dao.select_data();
		for(bookDTO dto4 : list) {
			System.out.println(dto4.getIndex());
			System.out.println(dto4.getTitle());
			System.out.println(dto4.getAuthor());
			System.out.println(dto4.getPrice());
			System.out.println(dto4.getPub_date());
		}
		ctx.close();
	}

}
