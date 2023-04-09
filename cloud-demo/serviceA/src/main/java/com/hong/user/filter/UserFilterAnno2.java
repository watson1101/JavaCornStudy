package com.hong.user.filter;

//import com.hong.user.filter.config.FilterConfig;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 基于注解的 过滤器filter
 *
 * @author hongw
 */
@WebFilter(urlPatterns = "/user/userfilteranno/*", filterName = "filterAnno2")
public class UserFilterAnno2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilterAnno2 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始执行-注解拦截器方法UserFilterAnno2--基于webFilter注解-- UserFilterAnno2 doFilter");
        System.out.println("注解拦截器UserFilterAnno2--执行请求……");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("请求执行完毕，--UserFilterAnno2注解过滤器--执行完毕");
    }

    @Override
    public void destroy() {
        System.out.println("UserFilterAnno2 destroy ");
    }

}
