package io.mjcoding.repository;

import io.mjcoding.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentInfo, String> {
}
