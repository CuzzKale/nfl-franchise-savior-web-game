package com.cuzzkale.Franchise_Savior.repositories.history;

import com.cuzzkale.Franchise_Savior.entities.history.season_history_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface season_history_repository extends JpaRepository<season_history_entity, Long> {
}
