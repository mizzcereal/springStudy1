package com.example.homepage.DTO;

import com.example.homepage.Entity.UserEntity;

import lombok.Data;

@Data
public class UserDto {
    
    private String name;
    private String id;
    private String pw;
    private String phone;

    public UserEntity toUserEntity(){
        return UserEntity.builder()
                         .id(id)
                         .name(name)
                         .pw(pw)
                         .phone(phone)
                         .build();
    }
}
