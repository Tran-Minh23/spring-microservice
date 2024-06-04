package com.mink.currency_exchange_service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mink.currency_exchange_service.bean.CurrencyExchange;
import com.mink.currency_exchange_service.jpa.CurrencyExchangeRepository;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CurrencyExchangeController {

    private Environment environment;
    private CurrencyExchangeRepository repository;

    public CurrencyExchangeController(Environment environment, CurrencyExchangeRepository repository) {
        this.environment = environment;
        this.repository = repository;
    }

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);

        if (currencyExchange == null) {
            throw new RuntimeException("Unable to find data");
        }

        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);

        return currencyExchange;
    }
}
