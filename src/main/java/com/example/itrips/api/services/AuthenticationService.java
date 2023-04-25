package com.example.itrips.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itrips.api.models.UserModel;
import com.example.itrips.api.repositories.UserRepository;

@Service
public class AuthenticationService {
    @Autowired
    UserRepository userRepository;

    public UserModel getUserAuth(String email) {
        return userRepository.findByEmail(email);
    }

}
