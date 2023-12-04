package com.simurgh.security.basicauth;

import com.simurgh.security.basicauth.dto.CreateUserRequest;
import com.simurgh.security.basicauth.model.Role;
import com.simurgh.security.basicauth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class BasicAuthApplication implements CommandLineRunner {

    private final UserService userService;

    public BasicAuthApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicAuthApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createDummyData();
    }

    public void createDummyData() {
        CreateUserRequest user = CreateUserRequest.builder()
                .name("mhmt")
                .username("mhmt")
                .password("pass")
                .authorities(Set.of(Role.ROLE_USER))
                .build();
        userService.createUser(user);

        CreateUserRequest mod = CreateUserRequest.builder()
                .name("mod")
                .username("mod")
                .password("pass")
                .authorities(Set.of(Role.ROLE_MOD))
                .build();
        userService.createUser(mod);

        CreateUserRequest admin = CreateUserRequest.builder()
                .name("admin")
                .username("admin")
                .password("pass")
                .authorities(Set.of(Role.ROLE_ADMIN))
                .build();
        userService.createUser(admin);
    }
}
