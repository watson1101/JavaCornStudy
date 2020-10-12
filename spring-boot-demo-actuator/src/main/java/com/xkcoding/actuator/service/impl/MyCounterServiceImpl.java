package com.xkcoding.actuator.service.impl;

import com.xkcoding.actuator.service.MyCounterService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.stereotype.Service;

@Service
public class MyCounterServiceImpl implements MyCounterService {

    static final Counter userCounter = Metrics.counter("counter.total", "services", "demo");

    @Override
    public void processCollectResult() {
        userCounter.increment(1D);
    }

}
