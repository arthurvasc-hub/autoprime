package com.dev.arthur.autoprime.infrastructure.beans;

import com.dev.arthur.autoprime.domain.entities.AppUser;
import com.dev.arthur.autoprime.domain.gateway.PasswordEncoderGateway;
import com.dev.arthur.autoprime.domain.gateway.UserGateway;
import com.dev.arthur.autoprime.domain.useCases.CreateUserCase;
import com.dev.arthur.autoprime.domain.useCases.CreateUserCaseImpl;
import com.dev.arthur.autoprime.domain.useCases.FindUserCase;
import com.dev.arthur.autoprime.domain.useCases.FindUserCaseImpl;
import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUserCase createUser(UserGateway userGateway, PasswordEncoderGateway passwordEncoderGateway){
        return new CreateUserCaseImpl(userGateway, passwordEncoderGateway);
    }

    @Bean
    public FindUserCase findUser(UserGateway userGateway) {return new FindUserCaseImpl(userGateway); }
}
