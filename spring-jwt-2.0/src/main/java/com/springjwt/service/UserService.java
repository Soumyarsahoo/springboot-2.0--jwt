package com.springjwt.service;

import com.springjwt.model.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    Users user = new Users("soumya","soumya");

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(user.getUsername(), passwordEncoder.encode(user.getPassword()), new ArrayList<>());
    }
}
