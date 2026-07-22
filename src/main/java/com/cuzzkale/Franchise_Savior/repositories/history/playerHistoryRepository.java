package com.cuzzkale.Franchise_Savior.repositories.history;

import com.cuzzkale.Franchise_Savior.entities.history.playerHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playerHistoryRepository extends JpaRepository<playerHistoryEntity, Long> {
}
