package com.tchokonthe.ssia;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author martin
 * @created on 07/11/2021 at 17:54
 * @project com.tchokonthe.ssia
 * @email (martin.aurele12 @ gmail.com)
 */

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String name = authentication.getName();
        final String password = String.valueOf(authentication.getCredentials());
        if ("john".equals(name) && "12345".equals(password)) {
            return new UsernamePasswordAuthenticationToken(name, password, List.of());
        }
        throw new AuthenticationCredentialsNotFoundException("Error in Authentication!");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
