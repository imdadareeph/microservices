package com.app.microservicesadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by imdadareeph on Mon, 23 Sep 2019 23:51:25 +0400
 */
@Profile("insecure")
@Configuration
@Order(Ordered.LOWEST_PRECEDENCE - 11) // defines the sorting order of an annotated component or bean.
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll()//
                .and().csrf().disable();
    }
}