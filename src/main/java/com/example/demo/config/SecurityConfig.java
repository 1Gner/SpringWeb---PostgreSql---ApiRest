package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

}
