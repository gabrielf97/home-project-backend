package com.home.project.model.user;

import com.home.project.model.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String id;

    private String userName;

    private String password;

    private Boolean active;

    private Date dateCreate;

    private Date dateUpdate;

    private void prePersist() {
    }

    public UserDTO toUserDTO() {
        return UserDTO.builder()
                .userName(this.userName)
                .password(this.password)
                .build();
    }
}
