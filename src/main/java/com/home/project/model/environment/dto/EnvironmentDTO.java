package com.home.project.model.environment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class EnvironmentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "field not allow empty")
    @NotBlank(message = "field not allow blank")
    @NotNull(message = "field not allow null")
    private String name;

    @Column(name = "dat_create")
    private Date dateCreate;

    @Column(name = "dat_update")
    private Date dateUpdate;

    @PrePersist private void prePersist() {
        this.dateCreate = new Date();
    }

    @PreUpdate private void preUpdate() {
        this.dateUpdate = new Date();
    }
}
