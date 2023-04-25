package com.example.itrips.api.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.itrips.api.models.OperatorModel;

public interface OperatorRepository extends CrudRepository<OperatorModel, Long> {
    public abstract Optional<OperatorModel> findById(Long id);
}
