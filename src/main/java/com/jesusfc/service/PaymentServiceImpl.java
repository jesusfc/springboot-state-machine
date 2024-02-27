package com.jesusfc.service;

import com.jesusfc.entity.PaymentEntity;
import com.jesusfc.model.PaymentEvent;
import com.jesusfc.model.PaymentState;
import com.jesusfc.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;

/**
 * Author Jesús Fdez. Caraballo
 * Created on feb - 2024
 */
@AllArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;

    @Override
    public PaymentEntity newPayment(PaymentEntity paymentEntity) {
        paymentEntity.setPaymentState(PaymentState.NEW);
        return paymentRepository.save(paymentEntity);
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> preAuthorize(long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> authorizePayment(long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> declineAuthorization(long paymentId) {
        return null;
    }
}
