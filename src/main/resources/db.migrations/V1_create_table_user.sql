-- V1__create_app_user_table.sql

CREATE TYPE user_type AS ENUM ('NORMAL', 'PREMIUM', 'DELUXE');
CREATE TYPE gender AS ENUM ('MALE', 'FEMALE',);

CREATE TABLE app_user (
                          id BIGSERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL UNIQUE,
                          password VARCHAR(255) NOT NULL,
                          user_type user_type NOT NULL,
                          gender gender NOT NULL
);