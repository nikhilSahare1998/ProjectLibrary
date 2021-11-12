package com.neosoft.ProjectLabrary.SecrityConfigration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



    @Configuration
    public class SecurityConfig extends WebSecurityConfigurerAdapter {
        // Authentication : User --> Roles
        protected void configure(AuthenticationManagerBuilder auth)
                throws Exception {
            auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).withUser("student").password("secret1")
                    .roles("STUDENT").and().withUser("admin").password("secret")
                    .roles("STUDENT", "ADMIN");
        }

        // Authorization : Role -> Access
        protected void configure(HttpSecurity http) throws Exception {
            http.httpBasic().and().authorizeRequests().antMatchers("/save/")
                    .hasRole("USER").antMatchers("/**").hasRole("ADMIN").and()
                    .csrf().disable().headers().frameOptions().disable();
        }
}
