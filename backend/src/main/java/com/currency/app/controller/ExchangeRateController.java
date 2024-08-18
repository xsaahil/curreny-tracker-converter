package com.currency.app.controller;

import com.currency.app.entity.ExchangeRate;
import com.currency.app.service.ExchangeRateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping("/exchange-rate")
    public ResponseEntity<List<ExchangeRate>> findAll() {
       return ResponseEntity.ok(exchangeRateService.findAll());
    }

    @GetMapping("/exchange-rate/{code}")
    public ResponseEntity<ExchangeRate> findByCode(@PathVariable String code) {
        ExchangeRate exchangeRate = exchangeRateService.getExchangeByCode(code);
        if (exchangeRate == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(exchangeRate);
    }

    @PostMapping("/exchange-rate")
    public ResponseEntity<String> createExchangeRate(@RequestBody ExchangeRate exchangeRate) {
        exchangeRateService.createExchangeRate(exchangeRate);
        return ResponseEntity.ok("Exchange rate created");
    }
}