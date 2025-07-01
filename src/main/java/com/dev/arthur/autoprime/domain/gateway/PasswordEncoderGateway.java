package com.dev.arthur.autoprime.domain.gateway;


public interface PasswordEncoderGateway {
    String encode(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}