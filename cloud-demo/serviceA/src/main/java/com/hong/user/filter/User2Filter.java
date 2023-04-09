package com.hong.user.filter;

//import com.hong.user.filter.config.FilterConfig;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author hongw
 */
public class User2Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始执行高优先级（order=1）拦截器方法 User2Filter doFilter");
        long timestart = System.currentTimeMillis();
        System.out.println("User2Filter中拦截器--执行请求……");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("高优先级（order=1）拦截器---请求执行时间：" + (System.currentTimeMillis() - timestart) + " ms ");
    }

    @Override
    public void destroy() {
        System.out.println("User2Filterdestroy ");
    }

}
