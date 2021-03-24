package com.myapp.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration

@ComponentScan(basePackages = "com.myapp.spring")
@EnableTransactionManagement
public class JdbcConfig {
	
	
//	@Bean
//	public DataSource dataSource1() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		dataSource.setUrl("jdbc:sqlserver://localhost;databaseName=master");
//		dataSource.setUsername("sa");
//		dataSource.setPassword("password@123");
//		
//		
//		
//		
//		return dataSource;
//	}
	
	
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
	
	//@Bean
	//@Autowired
    public DataSourceInitializer dataSourceInitializer(DataSource dataSource)
    {
        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();    
        dataSourceInitializer.setDataSource(dataSource);
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        databasePopulator.addScript(new ClassPathResource("data.sql"));
        dataSourceInitializer.setDatabasePopulator(databasePopulator);
        
        return dataSourceInitializer;
    }
	
	
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	// Aspect Class
	@Bean
	@Autowired
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
		
	}

}
