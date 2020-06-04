package com.hc.two;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class FilterRegistration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean1(){
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(myFilter1());
        registration.setName("myFilter1");
        registration.addUrlPatterns("/*");
        registration.setOrder(9);
        return registration;
    }
    @Bean
    public Filter myFilter1(){
        return new MyFilter1();
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean2(){
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(myFilter2());
        registration.setName("myFilter2");
        registration.addUrlPatterns("/*");
        registration.setOrder(3);
        return registration;
    }
    @Bean
    public Filter myFilter2(){
        return new MyFilter2();
    }
}
