package com.cuzzkale.Franchise_Savior.controllers;

import com.cuzzkale.Franchise_Savior.entities.team.coach_entity;
import com.cuzzkale.Franchise_Savior.services.coach_service;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class coach_controller {

    private final coach_service coach_serv;

    public coach_controller(coach_service coach_serv) {
        this.coach_serv = coach_serv;
    }

    @PostMapping("/coach")
    public coach_entity pickTeam(
    @RequestParam("coach-name-text") String name,
    @RequestParam("coach-age-number") int age,
    @RequestParam("pick") Long team_id){


    return coach_serv.pickTeam(name, age, team_id);

    }
}
