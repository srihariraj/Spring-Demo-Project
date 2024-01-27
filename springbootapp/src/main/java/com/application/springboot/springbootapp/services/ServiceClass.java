package com.application.springboot.springbootapp.services;

import org.springframework.stereotype.Service;

import com.application.springboot.springbootapp.repos.Repo;

@Service
public class ServiceClass{
    

    private final Repo repo;


        ServiceClass(Repo repo) {
            this.repo = repo;
        }


}