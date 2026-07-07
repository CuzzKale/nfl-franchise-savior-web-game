package com.cuzzkale.Franchise_Savior.entities.history;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class league_leaders_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;


    // Stats

    //QB
    private int passingYardsLeader;
    private int passingTDSLeader;

    //RB
    private int rushingTDSLeader;
    private int rushingYardsLeader;

    //WR & TE
    private int receivingYardsLeader;
    private int receivingTDSLeader;

    //Defense
    private int tackleLeader;
    private int sackLeader;
    private int tacklesForLossLeader;
    private int pressuresLeader;
    private int interceptionsLeader;
    private int fieldGoalsMadeLeader;
    private int longestFieldGoalLeader;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPassingYardsLeader() {
        return passingYardsLeader;
    }

    public void setPassingYardsLeader(int passingYardsLeader) {
        this.passingYardsLeader = passingYardsLeader;
    }

    public int getPassingTDSLeader() {
        return passingTDSLeader;
    }

    public void setPassingTDSLeader(int passingTDSLeader) {
        this.passingTDSLeader = passingTDSLeader;
    }

    public int getRushingTDSLeader() {
        return rushingTDSLeader;
    }

    public void setRushingTDSLeader(int rushingTDSLeader) {
        this.rushingTDSLeader = rushingTDSLeader;
    }

    public int getRushingYardsLeader() {
        return rushingYardsLeader;
    }

    public void setRushingYardsLeader(int rushingYardsLeader) {
        this.rushingYardsLeader = rushingYardsLeader;
    }

    public int getReceivingYardsLeader() {
        return receivingYardsLeader;
    }

    public void setReceivingYardsLeader(int receivingYardsLeader) {
        this.receivingYardsLeader = receivingYardsLeader;
    }

    public int getReceivingTDSLeader() {
        return receivingTDSLeader;
    }

    public void setReceivingTDSLeader(int receivingTDSLeader) {
        this.receivingTDSLeader = receivingTDSLeader;
    }

    public int getTackleLeader() {
        return tackleLeader;
    }

    public void setTackleLeader(int tackleLeader) {
        this.tackleLeader = tackleLeader;
    }

    public int getSackLeader() {
        return sackLeader;
    }

    public void setSackLeader(int sackLeader) {
        this.sackLeader = sackLeader;
    }

    public int getTacklesForLossLeader() {
        return tacklesForLossLeader;
    }

    public void setTacklesForLossLeader(int tacklesForLossLeader) {
        this.tacklesForLossLeader = tacklesForLossLeader;
    }

    public int getPressuresLeader() {
        return pressuresLeader;
    }

    public void setPressuresLeader(int pressuresLeader) {
        this.pressuresLeader = pressuresLeader;
    }

    public int getInterceptionsLeader() {
        return interceptionsLeader;
    }

    public void setInterceptionsLeader(int interceptionsLeader) {
        this.interceptionsLeader = interceptionsLeader;
    }

    public int getFieldGoalsMadeLeader() {
        return fieldGoalsMadeLeader;
    }

    public void setFieldGoalsMadeLeader(int fieldGoalsMadeLeader) {
        this.fieldGoalsMadeLeader = fieldGoalsMadeLeader;
    }

    public int getLongestFieldGoalLeader() {
        return longestFieldGoalLeader;
    }

    public void setLongestFieldGoalLeader(int longestFieldGoalLeader) {
        this.longestFieldGoalLeader = longestFieldGoalLeader;
    }
}
