package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties
@RequiredArgsConstructor
public class CryptoCoin {
    @Id

    @Column
    private double dollarValue;

    @Column
    private double euroValue;

    @JsonProperty("USD")
    public void setDollarValue(double dollarValue) {
        this.dollarValue = dollarValue;
    }
    @JsonProperty("EUR")
    public void setEuroValue(double euroValue) {
        this.euroValue = euroValue;
    }

    public double getEuroValue() {
        return euroValue;
    }

    public double getDollarValue() {
        return dollarValue;
    }
}
