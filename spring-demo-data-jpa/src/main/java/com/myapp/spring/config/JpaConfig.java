package com.myapp.spring.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration

@ComponentScan(basePackages = "com.myapp.spring")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.myapp.spring.repository")
public class JpaConfig {
	

	
	// Connection Pool is setup
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=master");
		dataSource.setUsername("sa");
		dataSource.setPassword("password@123");
		dataSource.setMaximumPoolSize(40);
		dataSource.setMinimumIdle(2);
		dataSource.setAutoCommit(false);
		
		
		
		return dataSource;
	}
	
	@Bean
	
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setDataSource(dataSource());
		entityManagerFactoryBean.setPackagesToScan("com.myapp.spring.model");
		entityManagerFactoryBean.setPersistenceUnitName("jpa-hibernate");
		
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		
		entityManagerFactoryBean.setJpaProperties(properties);
		
		return entityManagerFactoryBean;
		
	}
	
	@Bean
	
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager= new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
	

}
