package com.myapp.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringCoreDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	     
//	    public static void main(String[] args) {
//	        SpringApplication.run(SpringBootJdbcTemplateSqlServerApplication.class, args);
//	    }
	 
	    @Override
	    public void run(String... args) throws Exception {
	        String sql = "SELECT * FROM products";
	        List<String> customers = jdbcTemplate.query(sql,
	                BeanPropertyRowMapper.newInstance(String.class));
	         
	        customers.forEach(System.out :: println);
	    }
}
