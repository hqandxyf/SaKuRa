/*
package com.example.config;

import com.example.interceptor.loginCheckLanJie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //配置类
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private loginCheckLanJie loginCheckLanJie;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginCheckLanJie).addPathPatterns("/**")
                .excludePathPatterns("/login");
    }
}
*/
