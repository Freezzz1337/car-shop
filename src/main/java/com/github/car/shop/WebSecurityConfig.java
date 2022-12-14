//package com.github.car.shop;
//
//import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfiguration {
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("pass")
//                .roles("ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder encoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
