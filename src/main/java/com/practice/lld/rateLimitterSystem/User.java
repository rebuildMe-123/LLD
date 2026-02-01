package com.practice.lld.rateLimitterSystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String name;
    private Integer userTypeId;// {1: NORMAL_USER, 2: SUPER_USER}



}
