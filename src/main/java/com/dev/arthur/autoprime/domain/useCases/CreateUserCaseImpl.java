package com.dev.arthur.autoprime.domain.useCases;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.PasswordEncoderGateway;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;

public class CreateUserCaseImpl implements CreateUserCase {

    private final UserGateway userGateway;
    private final PasswordEncoderGateway passwordEncoder;

    public CreateUserCaseImpl(UserGateway userGateway, PasswordEncoderGateway passwordEncoder) {
        this.userGateway = userGateway;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AppUser execute(AppUser user) {
        AppUser userToSave = new AppUser(
                user.id(),
                user.name(),
                user.email(),
                passwordEncoder.encode(user.password()),
                user.userType(),
                user.gender()
        );
        return userGateway.saveUser(userToSave);
    }
}