package com.dev.arthur.autoprime.domain.gateway;

import com.dev.arthur.autoprime.domain.entities.AppUser;


public interface UserGateway {
    public AppUser saveUser (AppUser user);
}