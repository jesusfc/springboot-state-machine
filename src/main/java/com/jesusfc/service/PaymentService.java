package com.jesusfc.service;

import com.jesusfc.entity.PaymentEntity;
import com.jesusfc.model.PaymentEvent;
import com.jesusfc.model.PaymentState;
import org.springframework.statemachine.StateMachine;

/**
 * Author Jesús Fdez. Caraballo
 * Created on feb - 2024
 */
public interface PaymentService {
    PaymentEntity newPayment(PaymentEntity paymentEntity);

    StateMachine<PaymentState, PaymentEvent> preAuthorize(long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuthorization(long paymentId);
}
