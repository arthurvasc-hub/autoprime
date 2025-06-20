package com.dev.arthur.autoprime.domain.useCases;

import com.dev.arthur.autoprime.domain.entities.AppUser;

public interface CreateUserCase {

    public AppUser execute(AppUser user);
}
