package com.example.itrips.api.services;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itrips.api.models.ClientModel;
import com.example.itrips.api.repositories.ClientRepository;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    /**
     * @return
     */
    public ArrayList<ClientModel> getClients() {
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }

    /**
     * @param client
     * @return
     */
    public ClientModel saveClient(ClientModel client) {
        return clientRepository.save(client);
    }
}
