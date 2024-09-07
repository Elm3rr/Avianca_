package com.grupo_3.Avianca.controller;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo_3.Avianca.model.LoginRequest;
import com.grupo_3.Avianca.model.Roles;
import com.grupo_3.Avianca.model.User;
import com.grupo_3.Avianca.repository.RolesRepository;
import com.grupo_3.Avianca.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("controller/")
@RequiredArgsConstructor
public class AuthController {
    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RolesRepository rolesRepository;
    private PasswordEncoder passwordEncoder;

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody LoginRequest request){
        if(userRepository.existsByUsername(request.getUsername())){
            return new ResponseEntity<>("Username is taken!", HttpStatus.BAD_REQUEST);
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        Roles role = rolesRepository.findByName("Vendedor").get();
        user.setRoles_(Collections.singletonList(role));

        userRepository.save(user);

        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
    }

}
