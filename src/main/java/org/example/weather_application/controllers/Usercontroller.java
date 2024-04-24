package org.example.weather_application.controllers;

import org.example.weather_application.Model.User;
import org.example.weather_application.dtos.createUserDtos;
import org.example.weather_application.services.UserServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Usercontroller {

    public final UserServices userServices;
    public Usercontroller(UserServices userServices) {
        this.userServices = userServices;
    }
    @PostMapping()
    public User createUser(@RequestBody createUserDtos CreateUserDto){

        return userServices.createUser(CreateUserDto.getName(),CreateUserDto.getEmail());
    }
    @GetMapping("/{name}")
    public  User getUserByName(@PathVariable(name="name") String name){
        return userServices.getUserByName(name);
    }
}
