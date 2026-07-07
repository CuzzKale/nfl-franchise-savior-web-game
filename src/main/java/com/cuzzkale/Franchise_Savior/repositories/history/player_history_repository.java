package com.cuzzkale.Franchise_Savior.repositories.history;

import com.cuzzkale.Franchise_Savior.entities.history.player_history_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface player_history_repository extends JpaRepository<player_history_entity, Long> {
}
