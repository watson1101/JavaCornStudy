package com.csrcb.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.UUID;

/**
 * @Classname TraceIdFilter
 * @Description 日志中的traceId跟踪，使用过滤器
 * @Date 2020/8/10 15:37
 * @Created by gangye
 */
@Slf4j
@WebFilter(filterName = "traceIdFilter",urlPatterns = "/*")
public class TraceIdFilter implements Filter {

    /**
     * 日志跟踪标识
     */
    private static final String TRACE_ID = "traceId";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {
        MDC.clear();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MDC.put(TRACE_ID, UUID.randomUUID().toString());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
