package com.home.project.model.user;

import com.home.project.model.Audit;
import com.home.project.model.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User extends Audit {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private Boolean active;

    public UserDTO toUserDTO() {
        return UserDTO.builder()
                .userName(this.userName)
                .password(this.password)
                .build();
    }
}
