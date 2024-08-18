package com.currency.app.service;

import com.currency.app.entity.ExchangeRate;
import com.currency.app.repository.ExchangeRateRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExchangeRateService implements ExchangeRateRepository {

    private final List<ExchangeRate> exchangeRates = new ArrayList<>();

    @Override
    public List<ExchangeRate> findAll() {
        return exchangeRates;
    }

    @Override
    public ExchangeRate getExchangeByCode(String code) {
        for (ExchangeRate exchangeRate : exchangeRates) {
            if (exchangeRate.getCurrencyCode().equals(code)) {
                return exchangeRate;
            }
        }
        return null;
    }

    @Override
    public void createExchangeRate(ExchangeRate exchangeRate) {
        exchangeRates.add(exchangeRate);
    }


}
