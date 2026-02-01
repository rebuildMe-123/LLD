package com.practice.lld.rateLimitterSystem.strategy;

import com.practice.lld.rateLimitterSystem.UserRequest;

public interface RateLimiterStrategy {

     boolean allowRequest(UserRequest request);
}
