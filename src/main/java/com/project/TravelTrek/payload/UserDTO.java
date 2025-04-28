package com.project.TravelTrek.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    @Size(min=4,max=20)
    private String username;
    @Email
    private String email;
    @Size(min=8,max=20)
    private String password;
}
