package com.hopper.project.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hopper.project.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
