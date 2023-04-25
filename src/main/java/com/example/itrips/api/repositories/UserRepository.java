package com.example.itrips.api.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.itrips.api.models.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    public abstract UserModel findByEmail(String email);
}
