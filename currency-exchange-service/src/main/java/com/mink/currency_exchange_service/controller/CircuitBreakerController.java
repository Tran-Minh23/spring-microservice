package com.mink.currency_exchange_service.controller;

import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.retry.annotation.Retry;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CircuitBreakerController {

    @GetMapping("sample-api")
    @Retry(name = "sample-api", fallbackMethod = "hardcodedResponse")
    public String sampleApi() {
        return "SampleAPI";
    }

    public String hardcodedResponse(Exception exception) {
        return "fallback-response";
    }
}
