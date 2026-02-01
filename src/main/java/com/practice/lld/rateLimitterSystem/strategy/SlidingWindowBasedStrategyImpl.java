package com.practice.lld.rateLimitterSystem.strategy;

import com.practice.lld.rateLimitterSystem.UserRequest;

public class SlidingWindowBasedStrategyImpl implements RateLimiterStrategy{
    @Override
    public boolean allowRequest(UserRequest request) {
        return false;
    }
}
