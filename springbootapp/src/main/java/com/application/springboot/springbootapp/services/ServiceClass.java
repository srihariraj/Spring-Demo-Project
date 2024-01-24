package com.application.springboot.springbootapp.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.Models.Mongo_Doc;
import com.application.springboot.springbootapp.DTOS.DATA;
import com.application.springboot.springbootapp.repos.Repo;

@Service
public class ServiceClass{
    

    private final Repo repo;


    ServiceClass(Repo repo) {
        this.repo = repo;
    }

    
    public List<DATA> findAll(DATA example) {
        return (List<Mongo_Doc>)repo.findAll();
    }

    
    public List<DATA> findAll(Example<DATA> example, Sort sort) {
        
    }

    
    public DATA insert(DATA entity) {
        
    }

    
    public List<DATA> insert(Iterable<DATA> entities) {
        
    }

    
    public List<DATA> saveAll(Iterable<DATA> entities) {
        
    }

    
    public List<DATA> findAll() {
        
    }

    
    public List<DATA> findAllById(Iterable<String> ids) {
        
    }

    
    public DATA save(DATA entity) {
       
    }

    
    public Optional<DATA> findById(String id) {
        
    }

    
    public boolean existsById(String id) {
        
    }

    
    public long count() {
        
         
    }

    
    public void deleteById(String id) {
        
    }

    
    public void delete(Mongo_Doc entity) {
        
    }

    
    public void deleteAllById(Iterable<? extends String> ids) {
        
    }

    
    public void deleteAll(Iterable<? extends Mongo_Doc> entities) {
        
    }

    
    public void deleteAll() {
        
    }

    
    public List<Mongo_Doc> findAll(Sort sort) {
        
    }

    
    public Page<Mongo_Doc> findAll(Pageable pageable) {
        
    }

    
    public Optional<DATA> findOne(Example<DATA> example) {
        
    }

    
    public Page<DATA> findAll(Example<DATA> example, Pageable pageable) {
        
    }

    
    public long count(Example<DATA> example) {
        
    }

    
    public boolean exists(Example<DATA> example) {
        
    }

    
    public <S extends Mongo_Doc, R> R findBy(Example<DATA> example, Function<FetchableFluentQuery<DATA>, R> queryFunction) {
        
    }


}
