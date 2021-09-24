package io.mjcoding.repository;

import io.mjcoding.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<PassengerInfo, Long> {
}
