package com.blog.domain;

import com.blog.entity.Role;
import com.blog.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhaopin on 2016/11/13.
 */
public class SUser extends User implements UserDetails {


    private Collection<? extends GrantedAuthority> authorities;

    public SUser(User user, List<Role> roles) {
        if(null != user) {
            this.setUsername(user.getUsername());
            this.setPassword(user.getPassword());
            this.setGender(user.getGender());
        }
        if(null != roles) {
            this.authorities = roles.stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
        }

    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired(){
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

}
