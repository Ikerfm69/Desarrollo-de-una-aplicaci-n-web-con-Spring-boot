package com.iker.todo.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank(message = "{user.username.notblank}")
    private String username;

    @NotBlank(message = "{user.password.notblank}")
    private String password;

    @NotBlank(message = "{user.verifyPassword.notblank}")
    private String verifyPassword;

    @NotBlank(message = "{user.email.notblank}")
    private String email;

    @NotBlank(message = "{user.fullname.notblank}")
    private String fullname;
}
