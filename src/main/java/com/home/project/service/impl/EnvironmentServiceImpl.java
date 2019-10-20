package com.home.project.service.impl;

import com.home.project.exception.EnvironmentCreateException;
import com.home.project.exception.EnvironmentFindException;
import com.home.project.model.environment.Environment;
import com.home.project.repository.EnvironmentRepository;
import com.home.project.service.EnvironmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EnvironmentServiceImpl implements EnvironmentService {

    private EnvironmentRepository environmentRepository;

    @Override
    public Environment create(final Environment environment) {
        try {
            Environment environments = environmentRepository.save(environment);
            log.info("M=create, environment criado com sucesso");
            return environments;
        } catch (Exception e) {
            throw new EnvironmentCreateException();
        }
    }

    @Override
    public List<Environment> getAll() {
        try {
            List<Environment> environments = environmentRepository.findAll();
            log.info("M=getAll, environments consultados com sucesso");
            return environments;
        } catch (Exception e) {
            throw new EnvironmentFindException();
        }
    }
}
