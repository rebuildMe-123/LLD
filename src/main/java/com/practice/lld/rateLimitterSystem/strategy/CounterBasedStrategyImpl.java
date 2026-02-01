package com.practice.lld.rateLimitterSystem.strategy;

import com.practice.lld.rateLimitterSystem.RateLimitConfig;
import com.practice.lld.rateLimitterSystem.UserRequest;

public class CounterBasedStrategyImpl implements RateLimiterStrategy {
    private RateLimitConfig rateLimitConfig;

    public CounterBasedStrategyImpl(RateLimitConfig config) {
        this.rateLimitConfig = config;
    }

    @Override
    public boolean allowRequest(UserRequest request) {
        return false;
    }
}
