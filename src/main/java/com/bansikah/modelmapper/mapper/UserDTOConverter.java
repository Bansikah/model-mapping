package com.bansikah.modelmapper.mapper;

import com.bansikah.modelmapper.dto.UserDTO;
import com.bansikah.modelmapper.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOConverter {

    private UserDTO userDTO;

    public UserDTO convertUserToUserDTO(User userUser ){
        return userDTO;
    }

}
