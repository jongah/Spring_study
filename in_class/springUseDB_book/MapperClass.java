package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.bookDTO;

@Component
public class MapperClass implements RowMapper<bookDTO>{

	public bookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		bookDTO dto = new bookDTO();
		dto.setIndex(rs.getInt("b_index"));
		dto.setTitle(rs.getString("title"));
		dto.setAuthor(rs.getString("author"));
		dto.setPrice(rs.getInt("price"));
		dto.setPub_date(rs.getDate("pub_date"));
		return dto;
	}

}
