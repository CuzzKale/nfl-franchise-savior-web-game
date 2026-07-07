package com.cuzzkale.Franchise_Savior.repositories.history;

import com.cuzzkale.Franchise_Savior.entities.history.team_history_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface team_history_repository extends JpaRepository<team_history_entity, Long> {
}
