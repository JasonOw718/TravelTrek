package com.project.TravelTrek.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class UserTrip {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long user_trip_id;
    private Date pinned_at;
    private String photo_url;
    private Date visit_date;
    private String notes;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="trip_id")
    private Trip trip;
}
