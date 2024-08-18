package com.currency.app.interfaces;

import com.currency.app.entity.ExchangeRate;

import java.util.List;

public interface ExchangeRateInterface {

    List<ExchangeRate> findAll();

    ExchangeRate getExchangeByCode(Long Id);

    void createExchangeRate(ExchangeRate exchangeRate);

    boolean removeExchangeRate(Long Id);

    boolean updateExchangeRate(Long Id, ExchangeRate updatedExchangeRate);
}
