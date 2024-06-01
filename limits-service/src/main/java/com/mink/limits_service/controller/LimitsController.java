package com.mink.limits_service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mink.limits_service.bean.Limits;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LimitsController {

    @GetMapping("limits")
    public Limits retrieveLimits() {
        return new Limits(1, 100);
    }

}
