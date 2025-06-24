package com.dev.arthur.autoprime.infrastructure.response;

import com.dev.arthur.autoprime.domain.enums.UserType;
import lombok.Builder;

@Builder
public record UserResponse(Long id, String name, UserType userType) {
}
