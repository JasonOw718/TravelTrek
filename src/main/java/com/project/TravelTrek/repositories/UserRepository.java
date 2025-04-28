package com.project.TravelTrek.repositories;

import com.project.TravelTrek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
