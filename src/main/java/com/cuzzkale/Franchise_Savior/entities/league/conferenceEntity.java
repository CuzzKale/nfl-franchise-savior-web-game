package com.cuzzkale.Franchise_Savior.entities.league;

import jakarta.persistence.*;

@Entity
public class conferenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private leagueEntity league;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public leagueEntity getLeague() {
        return league;
    }

    public void setLeague(leagueEntity league) {
        this.league = league;
    }
}
