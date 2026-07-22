package com.cuzzkale.Franchise_Savior.entities.history;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class teamHistoryEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;

    // Record
    private int wins;
    private int losses;
    private int ties;

    // Achievements
    private boolean playoffs;
    private boolean conferenceChampionshipWinner;
    private boolean superBowlWinner;


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

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public boolean isPlayoffs() {
        return playoffs;
    }

    public void setPlayoffs(boolean playoffs) {
        this.playoffs = playoffs;
    }

    public boolean isConferenceChampionshipWinner() {
        return conferenceChampionshipWinner;
    }

    public void setConferenceChampionshipWinner(boolean conferenceChampionshipWinner) {
        this.conferenceChampionshipWinner = conferenceChampionshipWinner;
    }

    public boolean isSuperBowlWinner() {
        return superBowlWinner;
    }

    public void setSuperBowlWinner(boolean superBowlWinner) {
        this.superBowlWinner = superBowlWinner;
    }
}
