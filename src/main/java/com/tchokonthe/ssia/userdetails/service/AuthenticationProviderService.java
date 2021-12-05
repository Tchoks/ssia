package com.tchokonthe.ssia.userdetails.service;

import com.tchokonthe.ssia.userdetails.model.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author martin
 * @created on 23/11/2021 at 00:44
 * @project com.tchokonthe.ssia.userdetails.service
 * @email (martin.aurele12 @ gmail.com)
 */


@Service
@RequiredArgsConstructor
public class AuthenticationProviderService implements AuthenticationProvider {

    private final JpaUserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final SCryptPasswordEncoder sCryptPasswordEncoder;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String username = authentication.getName();
        final String password = authentication.getCredentials().toString();

        final CustomUserDetails userDetails = userDetailsService.loadUserByUsername(username);

        switch (userDetails.getUser().getAlgorithm()) {
            case BCRYPT:
                return  checkPassword(userDetails, password, bCryptPasswordEncoder);
            case SCRYPT:
                return checkPassword(userDetails, password, sCryptPasswordEncoder);
        }
        throw new BadCredentialsException("Bad Credentials for " + username);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

    private Authentication checkPassword(CustomUserDetails userDetails, String rawPassword, PasswordEncoder encoder) {
        if (encoder.matches(rawPassword, userDetails.getPassword())) {
            return new UsernamePasswordAuthenticationToken(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
        } else {
            throw new BadCredentialsException("Bad Credentials for " + userDetails.getUsername());
        }
    }
}
