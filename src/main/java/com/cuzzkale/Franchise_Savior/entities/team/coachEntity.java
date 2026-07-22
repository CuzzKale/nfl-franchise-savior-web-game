package com.cuzzkale.Franchise_Savior.entities.team;

import com.cuzzkale.Franchise_Savior.entities.user.usersEntity;
import jakarta.persistence.*;

@Entity
public class coachEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id")
    private teamEntity team;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private usersEntity user;

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

    public usersEntity getUser() {
        return user;
    }

    public void setUser(usersEntity user) {
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

    public teamEntity getTeam() {
        return team;
    }

    public void setTeam(teamEntity team) {
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
    