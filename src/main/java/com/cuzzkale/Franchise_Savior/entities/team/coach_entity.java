package com.cuzzkale.Franchise_Savior.entities.team;

import com.cuzzkale.Franchise_Savior.entities.user.users_entity;
import jakarta.persistence.*;

@Entity
public class coach_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id")
    private team_entity team;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private users_entity user;

    private String name;

    private int age;

    private int COTYawards;
    @Column(length = 10)
    private double leagueAuthority;

    @Column(length = 10)
    private double teamAuthority;

    @Column(length = 10)
    private double ownerAuthority;

    private int numOfVotes;

    public users_entity getUser() {
        return user;
    }

    public void setUser(users_entity user) {
        this.user = user;
    }

    public int getNumOfVotes() {
        return numOfVotes;
    }

    public void setNumOfVotes(int numOfVotes) {
        this.numOfVotes = numOfVotes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public team_entity getTeam() {
        return team;
    }

    public void setTeam(team_entity team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCOTYawards() {
        return COTYawards;
    }

    public void setCOTYawards(int COTYawards) {
        this.COTYawards = COTYawards;
    }

    public double getLeagueAuthority() {
        return leagueAuthority;
    }

    public void setLeagueAuthority(double leagueAuthority) {
        this.leagueAuthority = leagueAuthority;
    }

    public double getTeamAuthority() {
        return teamAuthority;
    }

    public void setTeamAuthority(double teamAuthority) {
        this.teamAuthority = teamAuthority;
    }

    public double getOwnerAuthority() {
        return ownerAuthority;
    }

    public void setOwnerAuthority(double ownerAuthority) {
        this.ownerAuthority = ownerAuthority;
    }
}
    