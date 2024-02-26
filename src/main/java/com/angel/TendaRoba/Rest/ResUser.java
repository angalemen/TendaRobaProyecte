package com.angel.TendaRoba.Rest;


import com.angel.TendaRoba.Login.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


///devuelve datos tipo controller
@RestController
@RequestMapping("/users")
public class ResUser {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired private UserDetailsManager userDetailsManager;
    @PostMapping("/register/")
    public String register(@RequestBody UserRegisterRequest userRegisterRequest)
    {
        if (userDetailsManager.userExists(userRegisterRequest.username)) return
                "ERROR: usuario existente";
        userDetailsManager.createUser(User.builder()
                .username(userRegisterRequest.username)
                .password(passwordEncoder.encode(userRegisterRequest.password))
                .roles("USER")
                .build()
        );
        return "OK";
    }
}

