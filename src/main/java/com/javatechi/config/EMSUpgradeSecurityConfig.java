package com.javatechi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Configuration
@EnableWebSecurity
public class EMSUpgradeSecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails user=  User.withUsername("chhote").password(passwordEncoder().encode("pwd1")).roles("USER").build();
        UserDetails admin=  User.withUsername("anju").password(passwordEncoder().encode("pwd2")).roles("ADMIN").build();
        UserDetails userAdmin=  User.withUsername("adi").password(passwordEncoder().encode("pwd3")).roles("USER","ADMIN").build();
       return new InMemoryUserDetailsManager(user,userAdmin,admin);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
      return   http.authorizeRequests().antMatchers("/nonsecure").permitAll().
                and()
                .authorizeRequests().antMatchers("/welcome","/text").authenticated().
                and().httpBasic()
                .and().build();

    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
