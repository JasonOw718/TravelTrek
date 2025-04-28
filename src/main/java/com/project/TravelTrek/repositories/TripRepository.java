package com.project.TravelTrek.repositories;


import com.project.TravelTrek.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip,Long> {
}
