package com.jesusfc.config;


import com.jesusfc.model.PaymentEvent;
import com.jesusfc.model.PaymentState;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

import java.util.UUID;

/**
 * Author Jesús Fdez. Caraballo
 * Created on feb - 2024
 */
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class StateMachineConfigTest {

    @Autowired
    private StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;


    @Test
    void testConfigurePaymentStateMachine() {
        StateMachine<PaymentState, PaymentEvent> stateMachine = stateMachineFactory.getStateMachine(UUID.randomUUID());
        stateMachine.start();

        System.out.println(stateMachine.getState().toString());
    }

}