package com.demo.server.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * <p>参看：https://github.com/spring-guides/tut-spring-security-and-angular-js/blob/master/oauth2-vanilla/README.adoc</p>
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:10:46
 * ProjectName:Mirco-Service-Skeleton
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable().authorizeRequests().antMatchers(
                "/api/**", "/oauth/**", "/api/token", "/oauth/token")
                .permitAll();
    }
}
