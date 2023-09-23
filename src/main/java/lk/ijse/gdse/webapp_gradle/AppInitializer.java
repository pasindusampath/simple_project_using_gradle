package lk.ijse.gdse.webapp_gradle;

import lk.ijse.gdse.webapp_gradle.config.WebAppConfig;
import lk.ijse.gdse.webapp_gradle.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public AppInitializer(){
        System.out.println("Started");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
