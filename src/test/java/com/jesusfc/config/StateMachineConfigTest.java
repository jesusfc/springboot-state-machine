package com.jesusfc.config;

import com.jesusfc.model.PaymentEvent;
import com.jesusfc.model.PaymentState;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.state.StateMachineState;
import reactor.core.publisher.Mono;

import java.util.EnumSet;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * Author Jesús Fdez. Caraballo
 * Created on feb - 2024
 */
@ExtendWith(MockitoExtension.class)
class StateMachineConfigTest {

    @Mock
    private StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;

    @InjectMocks
    private StateMachineConfig stateMachineConfig;

    @Test
    void shouldConfigurePaymentStateMachine() {
    }

    @Test
    void shouldConfigurePaymentStateMachineWithExpectedStates() {
        StateMachine<PaymentState, PaymentEvent> stateMachine = stateMachineFactory.getStateMachine(UUID.randomUUID());

        Mono<Void> voidMono = stateMachine.();
        System.out.println(stateMachine.getState().toString());


    }

    @Test
    void shouldConfigurePaymentStateMachineWithExpectedTransitions() {

    }
}