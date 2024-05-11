package ru.gb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.entity.Vehicle;

import java.util.Optional;

public interface VehicleRepositoryTest extends JpaRepository<Vehicle,Long> {
    Optional<Vehicle> findByRegSign(String regSign);
}
