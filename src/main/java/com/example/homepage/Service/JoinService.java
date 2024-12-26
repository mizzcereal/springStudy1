package com.example.homepage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homepage.DTO.UserDto;
import com.example.homepage.Entity.UserEntity;
import com.example.homepage.Repository.UserRepository;

@Service
public class JoinService {
    
    @Autowired
    private UserRepository userRepository;

    public void joinUser(UserDto userDto){
        UserEntity userEntity = userDto.toUserEntity();
        userRepository.save(userEntity);
    }
}
