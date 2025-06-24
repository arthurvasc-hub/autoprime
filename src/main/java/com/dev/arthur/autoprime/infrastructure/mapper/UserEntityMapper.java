package com.dev.arthur.autoprime.infrastructure.mapper;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.infrastructure.persistence.UserEntity;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public AppUser entityToDomain(UserEntity userEntity) {

        if(userEntity == null) {return null;}

        return new AppUser(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getUserType(),
                userEntity.getGender()
        );
    }

    public UserEntity domainToEntity(AppUser appUser){

        if(appUser == null) {return  null;}

        return UserEntity.builder()
                .id(appUser.id())
                .name(appUser.name())
                .email(appUser.email())
                .password(appUser.password())
                .userType(appUser.userType())
                .gender(appUser.gender())
                .build();
    }
}
