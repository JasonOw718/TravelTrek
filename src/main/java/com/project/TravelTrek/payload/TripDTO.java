package com.project.TravelTrek.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripDTO {
    private Long id;
    private String country;
    private String city;
    private float latitude;
    private float longitude;
}
