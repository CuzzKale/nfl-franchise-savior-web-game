package com.cuzzkale.Franchise_Savior.repositories.history;

import com.cuzzkale.Franchise_Savior.entities.history.teamHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teamHistoryRepository extends JpaRepository<teamHistoryEntity, Long> {
}
