package com.javatechi.config;
/*

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class EMSSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        auth.inMemoryAuthentication().withUser("chhote").password(passwordEncoder().encode("pwd1")).roles("USER");
        auth.inMemoryAuthentication().withUser("anju").password(passwordEncoder().encode("pwd2")).roles("ADMIN");
        auth.inMemoryAuthentication().withUser("adi").password(passwordEncoder().encode("pwd3")).roles("USER","ADMIN");
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/nonsecure").permitAll().
                and().authorizeRequests().antMatchers("/welcome","/text").authenticated().and()
                .httpBasic();
    }
}
*/
