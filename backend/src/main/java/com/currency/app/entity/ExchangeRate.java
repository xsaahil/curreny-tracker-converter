package com.currency.app.entity;

import jakarta.persistence.*;

@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String currencyName;
    private String currencyCode;
    private Double rate;

    public ExchangeRate(Long id, String currencyName, String currencyCode, Double rate) {
        this.id = id;
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
        this.rate = rate;
    }

    public ExchangeRate() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
