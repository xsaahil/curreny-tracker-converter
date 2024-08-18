package com.currency.app.controller;

import com.currency.app.service.ExchangeRate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exchange-rate")
public class ExchangeRateController {

    private final ExchangeRate exchangeRateService;

    public ExchangeRateController(ExchangeRate exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping
    public ResponseEntity<List<com.currency.app.entity.ExchangeRate>> findAll() {
       return ResponseEntity.ok(exchangeRateService.findAll());
    }

    @GetMapping("/{Id}")
    public ResponseEntity<com.currency.app.entity.ExchangeRate> findById(@PathVariable Long Id) {
        com.currency.app.entity.ExchangeRate exchangeRate = exchangeRateService.getExchangeByCode(Id);
        if (exchangeRate == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(exchangeRate);
    }

    @PostMapping
    public ResponseEntity<String> createExchangeRate(@RequestBody com.currency.app.entity.ExchangeRate exchangeRate) {
        exchangeRateService.createExchangeRate(exchangeRate);
        return ResponseEntity.ok("Exchange rate created");
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<Boolean> deleteExchangeRate(@PathVariable Long Id) {
        if (exchangeRateService.removeExchangeRate(Id)) {
            return ResponseEntity.ok(true);
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{Id}")
    public ResponseEntity<String> updateExchangeRate(@PathVariable Long Id, @RequestBody com.currency.app.entity.ExchangeRate exchangeRate) {
        if (exchangeRateService.updateExchangeRate(Id, exchangeRate)) {
            return ResponseEntity.ok("Exchange rate updated");
        }
        return ResponseEntity.notFound().build();
    }
}