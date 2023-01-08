package com.csrcb.config;

import com.csrcb.filter.TraceIdFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname LogTraceIdConfig
 * @Description 日志traceId配置
 * @Date 2020/8/10 15:50
 * @Created by gangye
 */
@Configuration
public class LogTraceIdConfig {
    @Bean
    public FilterRegistrationBean configureFilter1(){
        FilterRegistrationBean bean = new FilterRegistrationBean<>();
        bean.setName("filter1");//过滤器类名
        bean.setFilter(new TraceIdFilter());
        bean.setOrder(1);//如果有多个过滤器的，设置优先顺序，值越小越先
        List<String> urlList = new ArrayList<>();
//        bean.addInitParameter("","");
        urlList.add("/*");//过滤的路径
        bean.setUrlPatterns(urlList);
        return bean;
    }
}
