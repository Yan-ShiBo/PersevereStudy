
/*
 * Copyright (c) Yan ShiBo . 2023-2023. All rights reserved.
 */

package com.com.swu.PersevereStudy.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebCondig implements WebMvcConfigurer {

//    @Value("${SavePath.ProfilePhoto}")
//    private String ProfilePhotoPath; //图标物理存储路径
//    @Value("${SavePath.ProfilePhotoMapper}")
//    private String ProfilePhotoMapperPath; //图标映射路径

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        System.out.println(2);
//        registry.addResourceHandler(ProfilePhotoMapperPath + "**").addResourceLocations("file:" + ProfilePhotoPath);
//    }


//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        System.out.println(123);
//        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**")
////                .excludePathPatterns("static/front-end/MicFamily-login/*.html", "static/front-end/MicFamily-login/*.css", "static/front-end/MicFamily-login.js", "static/front-end/MicFamily-login/**,http://localhost:8088/login");
////
//                .excludePathPatterns("/manage/login","/front-end/**", "/**/*.html,/**/*.css", "/**/*.css","/login/**","/static/**");
//    }

}
