package com.cuzzkale.Franchise_Savior.repositories.team;

import com.cuzzkale.Franchise_Savior.entities.team.player_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface player_repository extends JpaRepository<player_entity, Long> {
}
