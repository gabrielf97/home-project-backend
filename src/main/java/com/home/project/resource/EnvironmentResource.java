package com.home.project.resource;

import com.home.project.model.environment.Environment;
import com.home.project.service.EnvironmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api/Environment")
@RequiredArgsConstructor
@Slf4j
public class EnvironmentResource {

    private final EnvironmentService environmentService;

    @PostMapping
    private ResponseEntity<?> createEnvironment(@Valid @RequestBody Environment environment) {
        log.info("M=createEnvironment, recebendo environment={}", environment);
        return ResponseEntity.created(URI.create("/user"+environmentService.create(environment).getId())).build();
    }

    @GetMapping
    public ResponseEntity<?> getAllEnvironment() {
        log.info("M=getAllEnvironment, solicitando environment's");
        return ResponseEntity.ok(environmentService.getAll());
    }
}
