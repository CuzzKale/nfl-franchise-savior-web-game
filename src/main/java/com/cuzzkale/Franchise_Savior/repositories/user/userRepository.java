package com.cuzzkale.Franchise_Savior.repositories.user;

import com.cuzzkale.Franchise_Savior.entities.user.usersEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface userRepository extends JpaRepository<usersEntity, Long> {

}
