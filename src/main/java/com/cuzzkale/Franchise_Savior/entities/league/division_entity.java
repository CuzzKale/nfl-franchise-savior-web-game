package com.cuzzkale.Franchise_Savior.entities.league;

import jakarta.persistence.*;

@Entity
public class division_entity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private conference_entity conference;


}
