package com.myapp.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration

@ComponentScan(basePackages = "com.myapp.spring")
public class JdbcConfig {
	
	
	// Connection Pool is setup
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setJdbcUrl("jdbc:sqlserver://localhost;databaseName=master");
		dataSource.setUsername("sa");
		dataSource.setPassword("password@123");
		dataSource.setMaximumPoolSize(40);
		dataSource.setMinimumIdle(2);
		dataSource.setAutoCommit(false);
		
		
		return dataSource;
	}
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
