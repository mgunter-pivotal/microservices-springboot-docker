package com.example.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    TokenStore tokenStore;

    @Autowired
    JwtAccessTokenConverter jwtTokenEnhancer;

    @Override
    public void configure(final HttpSecurity http) throws Exception {
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .and().authorizeRequests()
//                .anyRequest().authenticated()
//                .antMatchers("/oauth/token").permitAll()
//                .antMatchers("/uaa/oauth/token").permitAll();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
        	.and().csrf().disable().authorizeRequests().anyRequest().permitAll();
    }
//    @Override
//    public void configure(final HttpSecurity http) throws Exception {
////        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
////                .and().authorizeRequests()
////                .anyRequest().authenticated();
//    	http
//        .cors().and()
//        .csrf().disable()
//        .authorizeRequests()
//        .antMatchers("/test").hasAuthority("test")
//        .antMatchers("/**").denyAll();
//    }

}