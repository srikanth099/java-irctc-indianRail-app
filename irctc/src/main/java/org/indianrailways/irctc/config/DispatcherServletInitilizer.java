package org.indianrailways.irctc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext acwpc = new AnnotationConfigWebApplicationContext();
		acwpc.register(AppConfiguration1.class);
		
		DispatcherServlet servlet = new DispatcherServlet(acwpc);
		Dynamic dyc=servletContext.addServlet("dispatcher", servlet);
		dyc.addMapping("/");
		dyc.setLoadOnStartup(9);
	}

}
