package com.home.project.service;

import com.home.project.model.environment.Environment;

import java.util.List;

public interface EnvironmentService {

    Environment create(final Environment environment);

    List<Environment> getAll();
}
