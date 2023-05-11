package com.example.itrips.api.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.itrips.api.models.VehicleModel;

public interface VehicleRepository extends CrudRepository<VehicleModel, Long> {
    public abstract Optional<VehicleModel> findById(Long id);
}
