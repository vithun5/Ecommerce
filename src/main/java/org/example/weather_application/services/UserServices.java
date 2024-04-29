package org.example.weather_application.services;

import org.example.weather_application.Model.User;
import org.example.weather_application.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    public UserRepository userRepository;
    UserServices (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // creating user
    public User createUser(String name, String email ){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }
    //getting user by name
    public  User getUserByName(String name){
       return userRepository.findByName(name).get();
    }
}
