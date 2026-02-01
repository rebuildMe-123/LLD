package com.practice.lld.rateLimitterSystem.strategy;

import com.practice.lld.rateLimitterSystem.RateLimitConfig;
import com.practice.lld.rateLimitterSystem.UserRequest;

public class TokenBucketBasedStrategyImpl implements RateLimiterStrategy{
    private RateLimitConfig rateLimitConfig;

    public TokenBucketBasedStrategyImpl(RateLimitConfig config) {
        this.rateLimitConfig = config;
    }

    @Override
    public boolean allowRequest(UserRequest request) {
        return false;
    }
}
