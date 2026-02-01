package com.practice.lld.rateLimitterSystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserType {
    private Integer userTypeId;
    private String userTypeDesc;
    private String rateLimitAlgoType;
}
