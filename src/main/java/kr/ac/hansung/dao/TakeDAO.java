package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Take;

@Repository
public class TakeDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Take> getTakesByYearAndSemester(int year, int semester) {
		String sqlStatement = "select * from takes where year=? and semester=?";
		return jdbcTemplate.query(sqlStatement, new Object[] { year, semester },
				new RowMapper<Take>() {

			public Take mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Take take = new Take();
				
				take.setCode(rs.getString("code"));
				take.setCredit(rs.getInt("credit"));
				take.setSemester(semester);
				take.setSeparation(rs.getString("separation"));
				take.setSubject(rs.getString("subject"));
				take.setYear(year);
				
				return take;
				
			}
		});
	}
	
	public List<Take> getDistinctYearAndSemester() {
		String sqlStatement = "select year, semester, sum(credit) from takes group by year, semester";
		return jdbcTemplate.query(sqlStatement, 
				new RowMapper<Take>() {

			public Take mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Take take = new Take();
				
				take.setYear(rs.getInt("year"));
				take.setSemester(rs.getInt("semester"));
				take.setCredit(rs.getInt("sum(credit)"));
				
				return take;
				
			}
		});
	}
	
//	public boolean insert(Take take) {
//		
//		String code = take.getCode();
//		int credit = take.getCredit();
//		int semester = take.getSemester();
//		int year = take.getYear();
//		String separation = take.getSeparation();
//		String subject = take.getSubject();
//		
//		String sqlStatement = "insert into takes (code, , text) values(?, ?, ?);";
//		return (jdbcTemplate.update(sqlStatement, new Object[] {name, email, text}) == 1);
//	}
	
	
	public boolean delete(int id) {
		String sqlStatement = "delete from takes where id=?";
		return (jdbcTemplate.update(sqlStatement, new Object[] {id}) == 1);
	}

}
