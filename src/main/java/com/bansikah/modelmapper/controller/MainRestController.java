package com.bansikah.modelmapper.controller;

import com.bansikah.modelmapper.dto.UserDTO;
import com.bansikah.modelmapper.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@Slf4j
@RequestMapping("/api/v1/")
public class MainRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public UserDTO getUser(){
        return userService.getUser();
    }

}
