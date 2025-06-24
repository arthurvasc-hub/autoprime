package com.dev.arthur.autoprime.domain.useCases;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;

public class CreateUserCaseImpl implements CreateUserCase {

    private final UserGateway userGateway;

    public CreateUserCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public AppUser execute(AppUser user) {
        return userGateway.saveUser(user);
    }
}
