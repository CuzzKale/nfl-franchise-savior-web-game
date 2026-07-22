package com.cuzzkale.Franchise_Savior.controllers;

import com.cuzzkale.Franchise_Savior.entities.team.coachEntity;
import com.cuzzkale.Franchise_Savior.services.coachService;
import org.springframework.web.bind.annotation.*;

@RestController
public class coachController {

    private final coachService coach_serv;

    public coachController(coachService coach_serv) {
        this.coach_serv = coach_serv;
    }

    @PostMapping("/coach")
    public coachEntity pickTeam(
    @RequestParam("coach-name-text") String name,
    @RequestParam("coach-age-number") int age,
    @RequestParam("pick") Long team_id){


    return coach_serv.pickTeam(name, age, team_id);

    }
}
