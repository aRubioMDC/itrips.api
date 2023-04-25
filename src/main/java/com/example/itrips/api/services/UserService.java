package com.example.itrips.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itrips.api.models.UserModel;
import com.example.itrips.api.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUser() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    /**
     * @param user
     * @return
     */
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    /**
     * @param id
     * @return
     */
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * @param priority
     * @return
     */
    public UserModel getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * @param id
     * @return
     */
    public boolean deleteUserById(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
