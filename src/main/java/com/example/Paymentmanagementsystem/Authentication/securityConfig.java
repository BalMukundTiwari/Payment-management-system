//package com.example.Paymentmanagementsystem.Authentication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import com.example.Paymentmanagementsystem.Service.UserService;
//
//@Configuration
//public class securityConfig {
//	
//	@Bean
//	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
//	    http.csrf(httpSecurityCsrfConfigurer -> {httpSecurityCsrfConfigurer.disable();});
//	    
//	    http.authorizeHttpRequests(requests -> {
//	    	requests.requestMatchers("/user/**").permitAll();
//	    	requests.requestMatchers("admin/**").authenticated();
//	    });
//	    http.httpBasic(Customizer.withDefaults());
//	    return http.build();
//	}
//    
////    @Bean
////    public UserDetailsService userDetailsService() {
////        return new MyUserDetailsService();
////    }
////    
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
//
//}
