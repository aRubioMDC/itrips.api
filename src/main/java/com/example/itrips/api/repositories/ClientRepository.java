package com.example.itrips.api.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.itrips.api.models.ClientModel;

public interface ClientRepository extends CrudRepository<ClientModel, Long> {
    public abstract Optional<ClientModel> findById(Long id);
}

