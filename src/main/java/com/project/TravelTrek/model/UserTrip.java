package com.project.TravelTrek.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class UserTrip {
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
