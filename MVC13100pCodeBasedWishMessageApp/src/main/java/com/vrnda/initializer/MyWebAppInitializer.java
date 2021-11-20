package com.vrnda.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.vrnda.cfgs.AppConfig;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//public class MyWebAppInitializer implements WebApplicationInitializer {
//	@Override
//	public void onStartup(ServletContext sc) throws ServletException {
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(AppConfig.class);
//		ContextLoaderListener listener=new ContextLoaderListener(ctx);
//		sc.addListener(listener);
//		DispatcherServlet dispatcher = new DispatcherServlet(ctx);
//		ServletRegistration.Dynamic registration = sc.addServlet("dispatcher", dispatcher);
//		registration.setLoadOnStartup(1);
//
//	}

	@Override
	public Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getServletMappings() {
		return new String[]{"/"};
	}

}
