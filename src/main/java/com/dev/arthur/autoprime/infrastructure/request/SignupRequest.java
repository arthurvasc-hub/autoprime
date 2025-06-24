package com.dev.arthur.autoprime.infrastructure.request;

import com.dev.arthur.autoprime.domain.enums.Gender;
import com.dev.arthur.autoprime.domain.enums.UserType;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record SignupRequest (@NotNull String name,
@NotNull String email,
@NotNull String password,
@NotNull UserType userType,
@NotNull Gender gender
) {};
