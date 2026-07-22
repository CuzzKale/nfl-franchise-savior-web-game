package com.cuzzkale.Franchise_Savior.services;

import com.cuzzkale.Franchise_Savior.entities.team.coachEntity;
import com.cuzzkale.Franchise_Savior.entities.team.teamEntity;
import com.cuzzkale.Franchise_Savior.repositories.team.coachRepository;
import com.cuzzkale.Franchise_Savior.repositories.team.teamRepository;
import org.springframework.stereotype.Service;


@Service
public class coachService {

    private final coachRepository coachRepo;
    private final teamRepository teamRepo;
    public coachService(coachRepository coachRepo, teamRepository teamRepo) {
        this.coachRepo = coachRepo;
        this.teamRepo = teamRepo;
    }


    public coachEntity pickTeam(String name, int age, Long team_id){
        teamEntity team = teamRepo.getById(team_id);
        coachEntity coach = new coachEntity();
        coach.setName(name);
        coach.setAge(age);
        coach.setTeam(team);
        return coachRepo.save(coach);
    }
}
