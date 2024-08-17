package com.currency.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currencyCode;
    private Double rate;

    // Getters and Setters
    public String getCurrencyCode() {
        return currencyCode;
    }

    // Setter for currencyCode
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    // Setter for rate
    public void setRate(Double rate) {
        this.rate = rate;
    }


}
