package com.home.project.service.impl;

import com.home.project.exception.PeripheralFindException;
import com.home.project.model.peripheral.Peripheral;
import com.home.project.repository.PeripheralRepository;
import com.home.project.service.PeripheralService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PeripheralServiceImpl implements PeripheralService {

    private final PeripheralRepository peripheralRepository;

    @Override
    public List<Peripheral> getAll() {
        try {
            List<Peripheral> peripherals = peripheralRepository.findAll();
            log.info("M=getAll, peripherals consultados com sucesso");
            return peripherals;
        } catch (Exception e) {
            throw new PeripheralFindException();
        }
    }
}
