package com.jc.farm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Desc
 * @Author LinXing
 * @Date 2020/3/24 9:34
 * @Version 1.0
 */
@Configuration
public class MyWebConfigur implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/about.html").setViewName("about");
        registry.addViewController("/contact.html").setViewName("contact");
        registry.addViewController("/service.html").setViewName("service");
        registry.addViewController("/blog.html").setViewName("blog");
        registry.addViewController("/gallery.html").setViewName("gallery");
        registry.addViewController("/single.html").setViewName("single");
        registry.addViewController("/login.html").setViewName("login");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new FarmInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index.html","/css/**",
//                "/js/**","/images/**","/fonts/**","/about.html","/contact.html","/service.html","/blog.html","/gallery.html",
//                "/single.html","/login.html","/usr/login","/login");
//    }
}
