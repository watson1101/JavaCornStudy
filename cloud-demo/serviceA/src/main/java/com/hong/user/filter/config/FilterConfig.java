package com.hong.user.filter.config;

import com.hong.user.filter.User2Filter;
import com.hong.user.filter.UserFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<UserFilter> registFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new UserFilter());
        // 拦截所有请求
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("userFilter_BigOrderValue");
        registrationBean.setOrder(5);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<User2Filter> registFilter2() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new User2Filter());
        // 拦截 /user/userfileter/* 请求
        registrationBean.addUrlPatterns("/user/userfilter/*");
        registrationBean.setName("userFilter_Order1");
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
