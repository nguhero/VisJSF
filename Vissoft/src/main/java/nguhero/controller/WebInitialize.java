package nguhero.controller;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


public class WebInitialize implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext config=new AnnotationConfigWebApplicationContext();
        config.setConfigLocation("nguhero");
        config.setServletContext(servletContext);
        servletContext.addListener(new ContextLoaderListener(config));
        servletContext.addListener(new RequestContextListener());
    }
}
