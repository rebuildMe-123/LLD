package com.practice.lld.rateLimitterSystem;

import com.practice.lld.rateLimitterSystem.strategy.RateLimiterStrategy;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;


public class MainApp {

    private static RateLimiterService rateLimiterService;
    private static List<User> users;
    private static List<UserType> userTypes;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Rate Limiter Service started... ");
        setDummyData();
        System.out.println("Dummy data initialized ...");
        rateLimiterService = new RateLimiterService();
        UserRequest request1 = UserRequest.builder()
                .user(users.get(0))
                .uuid(UUID.randomUUID().toString()).build();

        UserRequest request2 = UserRequest.builder()
                .user(users.get(1))
                .uuid(UUID.randomUUID().toString()).build();

        System.out.println("request bombarding started for user 1....");
        for(int i=0;i<20;i++) {
            boolean allowed = rateLimiterService.allowRequest(request1);
            if (allowed) {
                System.out.println("user 1 is allowed to access");
            }
            else {
                System.out.println("user 1 is not allowed to access");
            }

            Thread.sleep(1000L);
        }


        System.out.println("request bombarding started for user 2....");
        for(int i=0;i<20;i++) {
            boolean allowed = rateLimiterService.allowRequest(request2);
            if (allowed) {
                System.out.println("user 2 is allowed to access");
            }
            else {
                System.out.println("user 2 is not allowed to access");
            }

            Thread.sleep(1000L);
        }





    }

    private static void setDummyData() {
         users = List.of(new User(1, "gaurav", 1), new User(2, "saurav", 2));
         userTypes = List.of(new UserType(1, "NORMAL_USER", RateLimitAlgoType.COUNTER_BASED_APPROACH.getDesc()),
                 new UserType(2, "PREMIUM_USER", RateLimitAlgoType.TOKEN_BUCKET_APPROACH.getDesc()));
    }
}
