package com.mojafa.user_mgmt_microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Create or modify user data
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrUpdateUserDTO implements Serializable {

    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private boolean enabled;
    private boolean secured;

    // contact information
    private String email;
    private String phone;

    // address information
    private String address;
    private String city;
    private String country;
    private String postalCode;

}
