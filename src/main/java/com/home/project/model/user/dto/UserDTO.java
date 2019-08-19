package com.home.project.model.user.dto;

import com.home.project.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String userName;

    private String password;

    public User toUser() {
        return User.builder()
                .userName(this.userName)
                .password(this.password)
                .build();
    }
}
