package com.tchokonthe.ssia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author martin
 * @created on 07/11/2021 at 18:23
 * @project com.tchokonthe.ssia
 * @email (martin.aurele12 @ gmail.com)
 */


//@Configuration
//public class UserManagementConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        final UserDetails userDetails = User.withUsername("john").password("{noop}12345").authorities("read").build();
//        return new InMemoryUserDetailsManager(userDetails);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//}
