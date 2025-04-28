package com.project.TravelTrek.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Trip {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    private float latitude;
    private float longitude;


    @OneToMany(mappedBy = "trip")
    private Set<UserTrip> userTrips = new HashSet<>();
}
