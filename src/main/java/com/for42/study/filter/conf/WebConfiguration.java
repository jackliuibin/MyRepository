package com.for42.study.filter.conf;

import com.for42.study.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean filterRegistrationTest() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/getUser");
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.setOrder(6);
        return filterRegistrationBean;
    }
}
