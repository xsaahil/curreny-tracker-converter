package com.currency.app.service;

import com.currency.app.interfaces.ExchangeRateInterface;
import com.currency.app.repository.ExchangeRateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRate implements ExchangeRateInterface {

    ExchangeRateRepository exchangeRateRepository;


    public ExchangeRate(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    @Override
    public List<com.currency.app.entity.ExchangeRate> findAll() {
        return exchangeRateRepository.findAll();
    }

    @Override
    public com.currency.app.entity.ExchangeRate getExchangeByCode(Long Id) {
        return exchangeRateRepository.findById(Id).orElse(null);
    }

    @Override
    public void createExchangeRate(com.currency.app.entity.ExchangeRate exchangeRate) {
        exchangeRateRepository.save(exchangeRate);
    }

    @Override
    public boolean removeExchangeRate(Long Id) {
        try {
            exchangeRateRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateExchangeRate(Long Id, com.currency.app.entity.ExchangeRate updatedExchangeRate) {
        Optional<com.currency.app.entity.ExchangeRate> exchangeRateOptional = exchangeRateRepository.findById(Id);
        if (exchangeRateOptional.isPresent()) {
            com.currency.app.entity.ExchangeRate exchangeRate = exchangeRateOptional.get();
            exchangeRate.setRate(updatedExchangeRate.getRate());
            exchangeRate.setCurrencyCode(updatedExchangeRate.getCurrencyCode());
            exchangeRate.setCurrencyName(updatedExchangeRate.getCurrencyName());
            return true;
        }

        return false;
    }
}
