package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.loginDTO;

@Component
public class loginDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert_data(loginDTO dto) {
		String sql = "insert into login values(?,?)";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpass());
		System.out.println("저장완료");
	}
	public void select_data() {
	}
	public void update_data(loginDTO dto) {
		String sql = "update login set userpass = ? where userid = ?";
		jdbcTemplate.update(sql, dto.getUserpass(), dto.getUserid());
		System.out.println("수정완료");
	}
}
