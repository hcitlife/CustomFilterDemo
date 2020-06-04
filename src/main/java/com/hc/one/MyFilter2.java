package com.hc.one;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(filterName = "aa",urlPatterns = {"/*"})
//@Order(2)
public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter12 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter12 请求处理之前");
        //将请求传递给下一个过滤器
        filterChain.doFilter(request, response);
        System.out.println("MyFilter12 请求处理之后");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter12 销毁");
    }
}
