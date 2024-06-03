package com.mink.currency_exchange_service.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mink.currency_exchange_service.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}