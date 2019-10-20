package com.home.project.model.user.dto;

import com.home.project.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    @NotEmpty(message = "field not allow empty")
    @NotBlank(message = "field not allow blank")
    @NotNull(message = "field not allow null")
    @Email(message = "invalid e-mail, please try other")
    private String userName;

    @NotNull(message = "field not allow null")
    @NotBlank(message = "field not allow blank")
    private String password;

    public User toUser() {
        return User.builder()
                .userName(this.userName)
                .password(this.password)
                .build();
    }
}
