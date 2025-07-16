package com.carlos.mapstruct.infrastructure.controller;


import com.carlos.mapstruct.infrastructure.bussines.UserService;
import com.carlos.mapstruct.infrastructure.dtos.UserRequestDTO;
import com.carlos.mapstruct.infrastructure.dtos.UserResponseEntityDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;


    public ResponseEntity<UserResponseEntityDTO> createUser(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.ok(service.createUser(userRequestDTO));
    }
}
