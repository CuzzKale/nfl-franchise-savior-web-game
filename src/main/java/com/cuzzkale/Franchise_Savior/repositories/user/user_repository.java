package com.cuzzkale.Franchise_Savior.repositories.user;

import com.cuzzkale.Franchise_Savior.entities.user.users_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface user_repository extends JpaRepository<users_entity, Long> {

}
