package lk.ijse.gdse.webapp_gradle.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("Started Web Root");
    }
}
