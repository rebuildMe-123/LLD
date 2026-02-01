package com.practice.lld.rateLimitterSystem;

import com.practice.lld.rateLimitterSystem.strategy.RateLimiterStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class RateLimiterService {
    private RateLimiterStrategy currStrategy;
    private Map<Integer, RateLimitConfig> rateLimitConfigMapByUserType;

    public RateLimiterService() {
        rateLimitConfigMapByUserType = new HashMap<>();
        RateLimitConfig normalConfig = RateLimitConfig.builder()
                .maxRequests(10)
                .timeWindow(10000L)
                .build();
        RateLimitConfig premiumConfig = RateLimitConfig.builder()
                .maxRequests(20)
                .timeWindow(10000L).build();
        rateLimitConfigMapByUserType.put(1, normalConfig);
        rateLimitConfigMapByUserType.put(2, premiumConfig);
    }

    public boolean allowRequest(UserRequest req) {
          User user = req.getUser();
          if (user == null) return false;
          log.info("processing allowReq for the userId = {}", req.getUser().getUserId());
          if (user.getUserTypeId() == 1) {
              RateLimitConfig currConfig = rateLimitConfigMapByUserType.get(user.getUserTypeId());
              currStrategy = RateLimiterStrategyFactory.createRateLimiterStrategy(currConfig, RateLimitAlgoType.COUNTER_BASED_APPROACH);
              log.info("strategy used here = {}", currStrategy.getClass().getName());
          }
          else if (user.getUserTypeId() == 2) {
              RateLimitConfig currConfig = rateLimitConfigMapByUserType.get(user.getUserTypeId());
              currStrategy = RateLimiterStrategyFactory.createRateLimiterStrategy(currConfig, RateLimitAlgoType.TOKEN_BUCKET_APPROACH);
              log.info("strategy used here = {}", currStrategy.getClass().getName());
          }
          else {
              log.info("user Id not exists");
              return false;
          }

          return currStrategy.allowRequest(req);


    }
}
