package com.hopper.project.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hopper.project.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
