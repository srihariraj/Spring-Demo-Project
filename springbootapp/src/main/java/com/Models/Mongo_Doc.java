package com.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Document(collection = "USERS")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Mongo_Doc {
    

    @Id
    private String ID;

    private String name;

    private byte age;

    private String Gender;

    private String email;

}
