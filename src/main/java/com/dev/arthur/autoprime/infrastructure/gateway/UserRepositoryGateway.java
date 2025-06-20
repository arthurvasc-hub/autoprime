package com.dev.arthur.autoprime.infrastructure.gateway;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;
import org.apache.catalina.User;

public class UserRepositoryGateway implements UserGateway {

    @Override
    public User saveUser(AppUser user) {
        return null;
    }
}
