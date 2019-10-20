package com.home.project.resource;

import com.home.project.service.PeripheralService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Peripheral")
@RequiredArgsConstructor
@Slf4j
public class PeripheralResource {

    private final PeripheralService PeripheralService;

    @GetMapping
    public ResponseEntity<?> getAllPeripheral() {
        log.info("M=getAllPeripheral, solicitando Peripheral's");
        return ResponseEntity.ok(PeripheralService.getAll());
    }
}
