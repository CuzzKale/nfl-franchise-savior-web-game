package com.cuzzkale.Franchise_Savior.repositories.team;

import com.cuzzkale.Franchise_Savior.entities.team.team_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface team_repository extends JpaRepository<team_entity, Long> {
}
