package com.currency.app.controller;

import com.currency.app.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/exchange-rates")
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    @Autowired
    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @PostMapping
    public void addExchangeRate(@RequestBody ExchangeRateRequest request) {
        exchangeRateService.addCurrency(request.getCurrencyCode(), request.getRate());
    }

    public static class ExchangeRateRequest {
        private String currencyCode;
        private Double rate;

        // Getters and Setters
        public String getCurrencyCode() {
            return currencyCode;
        }


        // Getter for rate
        public Double getRate() {
            return rate;
        }

    }
}