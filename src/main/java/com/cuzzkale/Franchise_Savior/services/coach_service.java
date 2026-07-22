package com.cuzzkale.Franchise_Savior.services;

import com.cuzzkale.Franchise_Savior.entities.team.coach_entity;
import com.cuzzkale.Franchise_Savior.entities.team.team_entity;
import com.cuzzkale.Franchise_Savior.repositories.team.coach_repository;
import com.cuzzkale.Franchise_Savior.repositories.team.team_repository;
import org.springframework.stereotype.Service;


@Service
public class coach_service {

    private final coach_repository coachRepo;
    private final team_repository teamRepo;
    public coach_service(coach_repository coachRepo, team_repository teamRepo) {
        this.coachRepo = coachRepo;
        this.teamRepo = teamRepo;
    }


    public coach_entity pickTeam(String name, int age, Long team_id){
        team_entity team = teamRepo.getById(team_id);
        coach_entity coach = new coach_entity();
        coach.setName(name);
        coach.setAge(age);
        coach.setTeam(team);
        return coachRepo.save(coach);
    }
}
