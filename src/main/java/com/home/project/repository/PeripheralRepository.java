package com.home.project.repository;

import com.home.project.model.peripheral.Peripheral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeripheralRepository extends JpaRepository<Peripheral, Long> {
}
