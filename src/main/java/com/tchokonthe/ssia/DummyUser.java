package com.tchokonthe.ssia;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author martin
 * @created on 07/11/2021 at 18:54
 * @project com.tchokonthe.ssia
 * @email (martin.aurele12 @ gmail.com)
 */

public class DummyUser implements UserDetails {

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> "READ");
    }

    @Override
    public String getPassword() {
        return "12345";
    }

    @Override
    public String getUsername() {
        return "bill";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
