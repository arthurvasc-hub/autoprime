package com.dev.arthur.autoprime.infrastructure.beans;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;
import com.dev.arthur.autoprime.domain.useCases.CreateUserCase;
import com.dev.arthur.autoprime.domain.useCases.CreateUserCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUserCase createUser(UserGateway userGateway){
        return new CreateUserCaseImpl(userGateway);
    }
}
