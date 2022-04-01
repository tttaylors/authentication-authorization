package br.com.application.authenticationauthorization.core;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/clients").hasAnyRole("ADM")
                .anyRequest()
                .authenticated()
            .and()
            .formLogin();
//                .loginPage("/login")
//                .permitAll()
//            .and()
//                .logout()
//                .logoutSuccessUrl("/login?logout")
//                .permitAll();
    }
}
