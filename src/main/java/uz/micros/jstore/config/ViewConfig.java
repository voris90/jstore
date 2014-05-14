package uz.micros.jstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafView;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/**
 * Created by java on 14.05.14.
 */
@Configuration
public class ViewConfig {

    @Bean
    public ViewResolver viewResolver() {

        ThymeleafViewResolver res = new ThymeleafViewResolver();

        res.setOrder(1);
        res.setContentType("text/html; charset=UTF-8");
        res.setTemplateEngine(templateEngine());

        return res;
    }

    private SpringTemplateEngine templateEngine() {

        SpringTemplateEngine res = new SpringTemplateEngine();
        res.setTemplateResolver(templateResolvet());

        return res;
    }

    private ITemplateResolver templateResolvet() {

        ServletContextTemplateResolver res = new ServletContextTemplateResolver();
        res.setPrefix("/WEB-INF/pages/");
        res.setSuffix(".html");
        res.setTemplateMode("HTML5");
        res.setCharacterEncoding("UTF-8");

        return res;
    }
}
