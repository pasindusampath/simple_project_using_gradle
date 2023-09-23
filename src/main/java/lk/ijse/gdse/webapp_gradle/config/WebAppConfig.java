package lk.ijse.gdse.webapp_gradle.config;

import lk.ijse.gdse.webapp_gradle.AppInitializer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {AppInitializer.class})
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("Started Web App Config");
    }

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
