package com.tchokonthe.ssia.userdetails.service;

import com.tchokonthe.ssia.entities.User;
import com.tchokonthe.ssia.repository.UserRepository;
import com.tchokonthe.ssia.userdetails.model.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

/**
 * @author martin
 * @created on 23/11/2021 at 00:38
 * @project com.tchokonthe.ssia.userdetails.service
 * @email (martin.aurele12 @ gmail.com)
 */


@Service
@RequiredArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = userRepository.findUserByUsername(username).orElseThrow(usernameNotFoundException(username));
        return new CustomUserDetails(user);
    }

    private Supplier<UsernameNotFoundException> usernameNotFoundException(String username) {
        return () -> new UsernameNotFoundException("Problem when authenticating " + username);
    }

}
