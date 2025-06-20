package com.dev.arthur.autoprime.domain.entities;

import com.dev.arthur.autoprime.domain.enums.Gender;
import com.dev.arthur.autoprime.domain.enums.UserType;


public record AppUser (Long id, String name, String email, String password,  UserType userType, Gender gender)
{}
