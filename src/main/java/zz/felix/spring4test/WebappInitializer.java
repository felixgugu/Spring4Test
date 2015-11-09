package zz.felix.spring4test;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * Webapp啟動點，(Servlet 3.0+ environment 取代 web.xml)
 * 
 * @author felix
 *
 */

public class WebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
     * 用 AbstractAnnotationConfigDispatcherServletInitializer 取代
     * WebApplicationInitializer
     * 參考 http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc-container-config
     */

    //public class WebappInitializer implements WebApplicationInitializer {
    //    @Override
    //    public void onStartup(ServletContext container) {
    //
    //        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet());
    //        registration.setLoadOnStartup(1);
    //        registration.addMapping("/example/*");
    //    }
    //}

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                WebConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/mvc/*" };
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] { new HiddenHttpMethodFilter(), new CharacterEncodingFilter() };
    }

}
