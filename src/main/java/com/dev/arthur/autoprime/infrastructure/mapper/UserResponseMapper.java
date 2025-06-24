package com.dev.arthur.autoprime.infrastructure.mapper;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.infrastructure.response.UserResponse;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
public class UserResponseMapper {


    public UserResponse domainToResponse(AppUser appUser){

        if(appUser == null) {return  null;}

        return UserResponse.builder()
                .id(appUser.id())
                .name(appUser.name())
                .userType(appUser.userType())
                .build();
    }
}
