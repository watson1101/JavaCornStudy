package com.hong.user.filter;

//import com.hong.user.filter.config.FilterConfig;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author hongw
 */
public class UserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始执行拦截器方法-低优先级过滤器（order=5）-- UserFilter doFilter");
        System.out.println("低优先级过滤器--执行请求……");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("请求执行完毕，低优先级过滤器执行完毕");
    }

    @Override
    public void destroy() {
        System.out.println("UserFilterdestroy ");
    }

}
