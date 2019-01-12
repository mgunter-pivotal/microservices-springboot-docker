package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	   @Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
	       return super.authenticationManagerBean();
	   }
}