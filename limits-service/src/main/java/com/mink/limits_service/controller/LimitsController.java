package com.mink.limits_service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mink.limits_service.bean.Limits;
import com.mink.limits_service.configuration.Configuration;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LimitsController {

    private Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}
