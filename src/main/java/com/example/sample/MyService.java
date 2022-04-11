package com.example.sample;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@RequiredArgsConstructor
public class MyService implements MeterBinder {
    private final RabbitTemplate sender;

    @Override
    public void bindTo(MeterRegistry meterRegistry) {
        // some service metric
    }
}
