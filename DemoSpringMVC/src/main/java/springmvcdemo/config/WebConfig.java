package springmvcdemo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"springmvcdemo"})
@EnableAutoConfiguration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////		client
//        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/META-INF/css/");
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/META-INF/js/");
//        registry.addResourceHandler("/font/**").addResourceLocations("classpath:/META-INF/font/");
//        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/META-INF/images/");
//        registry.addResourceHandler("/lib/**").addResourceLocations("classpath:/META-INF/lib/");
////		admin
//        registry.addResourceHandler("/admin/**").addResourceLocations("classpath:/META-INF/admin/");
//        registry.addResourceHandler("/files/**").addResourceLocations("file:F:/JavaDev/Lesson/Phan3_Backend/yuubook/upload/");
//    }
}
