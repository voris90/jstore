package uz.micros.jstore.config;


import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages = "uz.micros.jstore")
public class AppConfig {

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer res = new PropertyPlaceholderConfigurer();
        res.setLocation(new ClassPathResource("app.properties"));
        res.setIgnoreUnresolvablePlaceholders(true);

        return res;
    }
}

