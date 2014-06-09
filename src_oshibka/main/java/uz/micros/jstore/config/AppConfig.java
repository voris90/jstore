package uz.micros.jstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by java on 12.05.14.
 */

@Configuration
@ComponentScan(basePackages = "uz.micros.jstore")

public class AppConfig {

    /*@Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setViewClass(JstlView.class);
        res.setPrefix("/WEB-INF/pages/");
        res.setPrefix(".jsp");
        return res;
    }*/
}
