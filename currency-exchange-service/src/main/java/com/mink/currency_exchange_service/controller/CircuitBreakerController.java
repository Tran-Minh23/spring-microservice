package com.mink.currency_exchange_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CircuitBreakerController {

    @GetMapping("sample-api")
    public String sampleApi() {
        return "SampleAPI";
    }

}
