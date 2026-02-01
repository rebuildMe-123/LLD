package com.practice.lld.rateLimitterSystem;

public enum RateLimitAlgoType {
    COUNTER_BASED_APPROACH("counter_based_approach"),
    TOKEN_BUCKET_APPROACH("token_bucket_approach");

    private final String desc;
    RateLimitAlgoType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
