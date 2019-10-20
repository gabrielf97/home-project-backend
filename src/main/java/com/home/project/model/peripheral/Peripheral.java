package com.home.project.model.peripheral;

import com.home.project.model.Audit;
import com.home.project.model.environment.Environment;
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
@Builder
@Data
@Entity
public class Peripheral extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "field not allow empty")
    @NotBlank(message = "field not allow blank")
    @NotNull(message = "field not allow null")
    private String nome;

    private boolean active;

    @ManyToOne(fetch = FetchType.EAGER,
    cascade = CascadeType.ALL,
    optional = false)
    @JoinColumn(name = "environment_id")
    private Environment environment;
}
