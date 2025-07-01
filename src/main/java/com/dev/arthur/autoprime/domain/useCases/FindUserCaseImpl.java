package com.dev.arthur.autoprime.domain.useCases;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;

public class FindUserCaseImpl implements FindUserCase {

    private UserGateway userGateway;

    public FindUserCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public AppUser execute(String email) {
        return userGateway.findUserByEmail(email);
    }
}
