package com.example.itrips.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itrips.api.models.ClientModel;
import com.example.itrips.api.services.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientController {
    @Autowired
    ClientService operatorService;

    @GetMapping(path = "/getClients")
    public ArrayList<ClientModel> getClients() {
        return operatorService.getClients();
    }

    @PostMapping(value = "/saveClient")
    public ClientModel saveClient(@RequestBody ClientModel client) {
        return this.operatorService.saveClient(client);
    }

}
