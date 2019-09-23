package com.app.microserviceszuul.config;

import com.app.microserviceszuul.filter.ErrorFilter;
import com.app.microserviceszuul.filter.PostFilter;
import com.app.microserviceszuul.filter.PreFilter;
import com.app.microserviceszuul.filter.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by imdadareeph on Mon, 23 Sep 2019 01:03:23 +0400
 */
@Configuration
public class FilterConfig {
    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}