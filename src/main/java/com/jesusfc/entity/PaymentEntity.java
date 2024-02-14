package com.jesusfc.entity;

import com.jesusfc.model.PaymentState;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * Author Jesús Fdez. Caraballo
 * Created on feb - 2024
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentState paymentState;

    private BigDecimal amount;
}

