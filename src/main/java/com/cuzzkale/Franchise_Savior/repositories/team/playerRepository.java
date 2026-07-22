package com.cuzzkale.Franchise_Savior.repositories.team;

import com.cuzzkale.Franchise_Savior.entities.team.playerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playerRepository extends JpaRepository<playerEntity, Long> {
}
