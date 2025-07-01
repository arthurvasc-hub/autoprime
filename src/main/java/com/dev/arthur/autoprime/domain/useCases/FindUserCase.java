package com.dev.arthur.autoprime.domain.useCases;

import com.dev.arthur.autoprime.domain.entities.AppUser;

public interface FindUserCase {

    public AppUser execute(String email);
}
