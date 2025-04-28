package com.project.TravelTrek.model;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "appUser")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long userId;
    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<UserTrip> userTrips = new HashSet<>();
}
