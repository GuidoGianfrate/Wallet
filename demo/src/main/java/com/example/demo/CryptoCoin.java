package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties
public class CryptoCoin {


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

    public double getDollarValue() {
        return dollarValue;
    }
}
