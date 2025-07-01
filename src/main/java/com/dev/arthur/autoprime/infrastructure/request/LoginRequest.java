package com.dev.arthur.autoprime.infrastructure.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record LoginRequest(@NotNull String email, @NotNull String password) {

}
