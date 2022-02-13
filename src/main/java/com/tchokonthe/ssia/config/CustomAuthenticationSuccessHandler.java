package com.tchokonthe.ssia.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

/**
 * @author martin
 * @created on 13/02/2022 at 16:14
 * @project com.tchokonthe.ssia.config
 * @email (martin.aurele12 @ gmail.com)
 */

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        final Optional<? extends GrantedAuthority> auth = authorities.stream()
                .filter(authority -> "read".equals(authority.getAuthority()))
                .findFirst();

        if (auth.isPresent()) {
            response.sendRedirect("/main");
        } else {
            response.sendRedirect("/error");
        }
    }
}
