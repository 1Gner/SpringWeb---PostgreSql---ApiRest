package com.example.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import org.springframework.security.web.SecurityFilterChain;





@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	protected SecurityFilterChain configurrre(HttpSecurity http) throws Exception{
		http.csrf((csrf) -> csrf.disable())
		.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		return http.build();
				
	}

	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("name")
		.password("{noop}123456")
		.roles("USER");
	}
}
