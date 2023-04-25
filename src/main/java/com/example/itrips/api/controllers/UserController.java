package com.example.itrips.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.itrips.api.models.UserModel;
import com.example.itrips.api.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/getUser")
    public ArrayList<UserModel> getUser() {
        return userService.getUser();
    }

    @PostMapping(path = "/saveUser")
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/getUserById/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id) {
        return this.userService.getUserById(id);
    }

    @GetMapping("/params")
    public UserModel getUserByEmail(@RequestParam("email") String email) {
        return this.userService.getUserByEmail(email);
    }

    @DeleteMapping(path = "/deleteUserById/{id}")
    public String deleteUserById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUserById(id);
        if (ok) {
            return "Se elimino el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }
}