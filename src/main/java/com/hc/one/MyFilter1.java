package com.hc.one;

import org.springframework.core.annotation.Order;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(filterName = "bb" , urlPatterns = {"/*"})
//@Order(10)//指定过滤器的执行顺序,值越大越靠后执行
public class MyFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter11 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter11 请求处理之前");
        //将请求传递给下一个过滤器
        filterChain.doFilter(request, response);
        System.out.println("MyFilter11 请求处理之后");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter11 销毁");
    }
}
