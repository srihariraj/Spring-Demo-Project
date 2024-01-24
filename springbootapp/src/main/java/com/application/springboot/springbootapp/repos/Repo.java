package com.application.springboot.springbootapp.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Models.Mongo_Doc;

public interface Repo extends MongoRepository<Mongo_Doc, String> {
    
}
