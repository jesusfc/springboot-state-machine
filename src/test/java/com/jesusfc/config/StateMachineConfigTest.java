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
import reactor.core.publisher.Mono;

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

        StateMachine<PaymentState, PaymentEvent> sm = stateMachineFactory.getStateMachine(UUID.randomUUID());


        sm.start();

        System.out.println(sm.getState().toString());

        sm.sendEvent(PaymentEvent.PRE_AUTHORIZE);

        System.out.println(sm.getState().toString());

        sm.sendEvent(PaymentEvent.PRE_AUTH_APPROVED);

        System.out.println(sm.getState().toString());

        sm.sendEvent(PaymentEvent.PRE_AUTH_DECLINED);

        System.out.println(sm.getState().toString());

        /*
        Mono<Void> voidMono = stateMachine.startReactively();

        System.out.println("Mono ----------> " + voidMono.toString());


        System.out.println(stateMachine.getState().toString());

        stateMachine.sendEvent(PaymentEvent.PRE_AUTHORIZE);

        System.out.println(stateMachine.getState().toString());

        stateMachine.sendEvent(PaymentEvent.PRE_AUTH_APPROVED);

        System.out.println(stateMachine.getState().toString());

        stateMachine.sendEvent(PaymentEvent.PRE_AUTH_DECLINED);

        System.out.println(stateMachine.getState().toString());
*/
    }

}