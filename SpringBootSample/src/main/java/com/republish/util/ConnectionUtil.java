package com.republish.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConnectionUtil {
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("oracle.jdbc.driver.OracleDriver");
		driverManagerDataSource.setUsername("system");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setDriverClassName("jdbc:oracle:thin:@localhost:1521:xe");
		return driverManagerDataSource;
	}
	
	@Bean
	JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate(dataSource());
		return template;
	}
	
	

}
