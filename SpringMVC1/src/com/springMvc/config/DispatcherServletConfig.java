package com.springMvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Annotation config for replacement of web.xml

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
			return null;
		}
	 
		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] { MvcConfiguration.class };
		}
	 
		@Override
		protected String[] getServletMappings() {
			return new String[] { "/" };
		}

}
