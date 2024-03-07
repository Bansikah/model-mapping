package com.bansikah.modelmapper.service;

import com.bansikah.modelmapper.dto.UserDTO;
import com.bansikah.modelmapper.mapper.UserDTOConverter;
import com.bansikah.modelmapper.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    public UserDTOConverter userDTOConverter;

    public UserDTO getUser(){
        //Mock db call
        User user = new User();
        user.setId("1233");
        user.setEmail("upchh@example.com");
        user.setFirstName("Noel");
        user.setLastName("Bansikah");
        user.setPassword("password");

       return userDTO();
    }

    private UserDTO userDTO() {
        return null;
    }
}
