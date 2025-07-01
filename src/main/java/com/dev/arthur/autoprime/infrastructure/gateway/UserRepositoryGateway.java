package com.dev.arthur.autoprime.infrastructure.gateway;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;
import com.dev.arthur.autoprime.infrastructure.mapper.UserEntityMapper;
import com.dev.arthur.autoprime.infrastructure.persistence.UserEntity;
import com.dev.arthur.autoprime.infrastructure.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public AppUser saveUser(AppUser appUser) {
        UserEntity entity = userEntityMapper.domainToEntity(appUser);
        UserEntity saved = userRepository.save(entity);
        return userEntityMapper.entityToDomain(saved);
    }

    @Override
    public AppUser findUserByEmail(String email) {
        Optional<UserEntity> userFound = userRepository.findByEmail(email);
        return userEntityMapper.entityToDomain(userFound.orElse(null));
    }
}
