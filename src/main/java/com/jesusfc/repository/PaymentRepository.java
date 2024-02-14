package com.jesusfc.repository;

import com.jesusfc.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author Jesús Fdez. Caraballo
 * Created on feb - 2024
 */
@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>{
}
