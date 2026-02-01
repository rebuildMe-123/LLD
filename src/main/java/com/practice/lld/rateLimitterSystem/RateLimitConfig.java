package com.practice.lld.rateLimitterSystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RateLimitConfig {
    private Integer maxRequests;
    private Long timeWindow;

}
