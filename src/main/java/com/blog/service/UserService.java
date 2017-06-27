package com.blog.service;

import com.blog.dao.UserMapper;
import com.blog.domain.SUser;
import com.blog.entity.Role;
import com.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaopin on 2016/11/13.
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userMapper.findByUserName(name);
        List<Role> roles = userMapper.findUserRoles(user.getId());
        return new SUser(user, roles);
    }
}
