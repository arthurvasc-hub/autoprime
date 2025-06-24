package com.dev.arthur.autoprime.infrastructure.persistence;

import com.dev.arthur.autoprime.domain.enums.Gender;
import com.dev.arthur.autoprime.domain.enums.UserType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private UserType userType;
    private Gender gender;


}
