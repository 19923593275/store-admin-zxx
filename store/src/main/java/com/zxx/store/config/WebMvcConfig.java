package com.zxx.store.config;


import com.zxx.store.Interceptor.CommonInterCeptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebMvcConfig extends WebMvcConfigurationSupport {
//
//    private static final String[] CLASS_RESOURCE_LOCATIONS = {"classpath:/META-INF/resources/", "classpath:/resources/","classpath:/static/"};
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations(CLASS_RESOURCE_LOCATIONS);
//    }
//
//    @Bean
//    public CommonInterCeptor CommonInterCeptor() {
//        return new CommonInterCeptor();
//    }
//
//}

//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addRedirectViewController()
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations(CLASS_RESOURCE_LOCATIONS);
//    }
//
//    @Bean
//    public CommonInterCeptor CommonInterCeptor() {
//        return new CommonInterCeptor();
//    }
//
//}
