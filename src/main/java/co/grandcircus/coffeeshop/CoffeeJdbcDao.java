package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class CoffeeJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<person> findAllUsers(){
		return jdbcTemplate.query("SELECT * FROM Users", new BeanPropertyRowMapper<person>(person.class));
	}
	
	public int addUser(String firstname, String lastname, String email) {
		String addQuery = "INSERT INTO Users(firstname, lastname, email) values(?,?,?)";
		return jdbcTemplate.update(addQuery, firstname, lastname, email);
	}
}
