package com.cuzzkale.Franchise_Savior.entities.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class users_entity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


    private Long saveCode;
    private String username;
    private String password;
    private String email;
    private String lang;
    private String colorScheme;

}
