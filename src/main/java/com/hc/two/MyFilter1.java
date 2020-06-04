package com.hc.two;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

public class MyFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter21 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter21 请求处理之前");
        //将请求传递给下一个过滤器
        filterChain.doFilter(request, response);
        System.out.println("MyFilter21 请求处理之后");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter21 销毁");
    }
}
