package com.coforge.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.coforge"})
public class AppConfig {
	 @Bean
     public InternalResourceViewResolver resolver() {
    	 InternalResourceViewResolver resolver= new InternalResourceViewResolver();
    	 resolver.setViewClass(JstlView.class);
 		 resolver.setPrefix("/WEB-INF/view/");
 		 resolver.setSuffix(".jsp");
    	 return resolver;
     }
	 
	
	
	@Bean
	public DataSource dataSource() {
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/javafsd");
    dataSource.setUsername("root");
    dataSource.setPassword("225621@");
     
		return dataSource;
	}

	 @Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) { 
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); 
		jdbcTemplate.setResultsMapCaseInsensitive(true); 
		return jdbcTemplate; 
	}
    
}
