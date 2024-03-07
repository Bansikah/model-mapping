package com.bansikah.modelmapper.model;

import lombok.Data;

@Data
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }



}
