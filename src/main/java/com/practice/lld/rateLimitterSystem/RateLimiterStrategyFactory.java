package com.practice.lld.rateLimitterSystem;

import com.practice.lld.rateLimitterSystem.strategy.CounterBasedStrategyImpl;
import com.practice.lld.rateLimitterSystem.strategy.RateLimiterStrategy;
import com.practice.lld.rateLimitterSystem.strategy.TokenBucketBasedStrategyImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RateLimiterStrategyFactory {

    public static RateLimiterStrategy createRateLimiterStrategy(RateLimitConfig config, RateLimitAlgoType type) {
        log.info("Started creating factory object class...");
        RateLimiterStrategy strategy = null;
        try {
            switch (type) {
                case RateLimitAlgoType.COUNTER_BASED_APPROACH:
                    strategy = new CounterBasedStrategyImpl(config);
                    break;

                case RateLimitAlgoType.TOKEN_BUCKET_APPROACH:
                    strategy = new TokenBucketBasedStrategyImpl(config);
                    break;

                default:
                    throw new UnsupportedOperationException("Operation not supported..");

            }
        } catch (UnsupportedOperationException ex) {
            log.error("op not supported = ", ex);
        } catch (Exception ex) {
            log.error("unwanted error = ", ex);
        }
        return strategy;

    }
}
