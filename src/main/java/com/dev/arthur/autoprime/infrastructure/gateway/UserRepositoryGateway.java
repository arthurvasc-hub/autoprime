package com.dev.arthur.autoprime.infrastructure.gateway;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;
import com.dev.arthur.autoprime.infrastructure.mapper.UserEntityMapper;
import com.dev.arthur.autoprime.infrastructure.persistence.UserEntity;
import com.dev.arthur.autoprime.infrastructure.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryGateway implements UserGateway {

    private UserRepository userRepository;
    private UserEntityMapper userEntityMapper;

    @Override
    public AppUser saveUser(AppUser appUser) {
        AppUser user = new AppUser(
                appUser.id(),
                appUser.name(),
                appUser.email(),
                appUser.password(),
                appUser.userType(),
                appUser.gender()
        );

        UserEntity save = userEntityMapper.domainToEntity(user);
        return userEntityMapper.entityToDomain(save);
    }
}
