package com.satya.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentManagementConfigInitialize extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] arg = {StudentManagementConfiguration.class};
		return arg;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arg = {"/"};
		return arg;
	}

}
