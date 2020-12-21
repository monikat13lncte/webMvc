package com.coforge.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer { 
	
	protected Class<?>[] getRootConfigClasses() { 
		// TODO Pluto-generated method stub 
		return null; 
	} 
	
	 protected Class<?>[] getServletConfigClasses() { 
		return new Class[] { AppConfig.class }; 
		} 
	 
	protected String[] getServletMappings() { 
		return new String[] { "/" }; 
		} 
}
