package com.dev.arthur.autoprime.domain.gateway;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import org.apache.catalina.User;

public interface UserGateway {
    public User saveUser (AppUser user);
}