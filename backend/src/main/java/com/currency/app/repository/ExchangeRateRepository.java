package com.currency.app.repository;

import com.currency.app.entity.ExchangeRate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExchangeRateRepository {
    List<ExchangeRate> findAll();
    ExchangeRate getExchangeByCode(String code);
    void createExchangeRate(ExchangeRate exchangeRate);
}