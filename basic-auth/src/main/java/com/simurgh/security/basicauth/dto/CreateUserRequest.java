package com.simurgh.security.basicauth.dto;

import com.simurgh.security.basicauth.model.Role;
import lombok.Builder;

import java.util.Set;

@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Set<Role> authorities
) {
}
