package uz.micros.jstore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by java on 12.05.14.
 */

@EnableWebMvc
@Configuration
@ComponentScan

public class WebMvcConfig extends WebMvcConfigurationSupport{
}
