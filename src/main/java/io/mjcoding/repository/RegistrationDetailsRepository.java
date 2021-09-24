package io.mjcoding.repository;

import io.mjcoding.entity.RegistrationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationDetailsRepository extends JpaRepository<RegistrationDetails, String> {
}
