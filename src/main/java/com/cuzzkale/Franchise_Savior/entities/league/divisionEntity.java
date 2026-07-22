package com.cuzzkale.Franchise_Savior.entities.league;

import jakarta.persistence.*;

@Entity
public class divisionEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private conferenceEntity conference;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public conferenceEntity getConference() {
        return conference;
    }

    public void setConference(conferenceEntity conference) {
        this.conference = conference;
    }
}
