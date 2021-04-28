package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.bookDTO;

@Component
public class bookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	MapperClass mapper;

	public void delete_data(bookDTO dto) {
		String sql = "delete from book where b_index = ?";
		jdbcTemplate.update(sql, dto.getIndex());
		System.out.println("삭제완료");
	}
	public void insert_data(bookDTO dto) {
		String sql = "insert into book values(?,?,?,?,?)";
		jdbcTemplate.update(sql, dto.getIndex(), dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getPub_date());
		System.out.println("저장완료");
	}
	public void update_data(bookDTO dto) {
		String sql = "update book set title = ? where b_index = ?";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getIndex());
		System.out.println("수정완료");	
	}
	public List<bookDTO> select_data() {
		String sql = "select * from book";
		List<bookDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
