package com.example.itrips.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itrips.api.models.UserModel;
import com.example.itrips.api.services.AuthenticationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/authentication")
@CrossOrigin("*")
public class AuthenticationController {
    @Autowired
    AuthenticationService authenticationService;

    @GetMapping(path = "/getUserAuth/params")
    public Integer getUserAuth(@RequestParam String email, @RequestParam String pass) {
        UserModel user = new UserModel();
        user = this.authenticationService.getUserAuth(email);
        if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
            return 1;
        } else {
            return 0;
        }
    }

}
