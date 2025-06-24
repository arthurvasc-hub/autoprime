package com.dev.arthur.autoprime.infrastructure.mapper;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.infrastructure.request.SignupRequest;
import org.springframework.stereotype.Component;

@Component
public class UserRequestMapper {

    public AppUser requestToDomain(SignupRequest signupRequest){
        return new AppUser(
                null,
                signupRequest.name(),
                signupRequest.email(),
                signupRequest.password(),
                signupRequest.userType(),
                signupRequest.gender()
        );
    }

    public SignupRequest domainToRequest(AppUser appUser){
        return SignupRequest.builder()
                .name(appUser.name())
                .email(appUser.email())
                .password(appUser.password())
                .userType(appUser.userType())
                .gender(appUser.gender())
                .build();
    }
}
