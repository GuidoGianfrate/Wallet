package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.List;


@Entity
public class Wallet {
    @Id
    @Column
    @NotNull
    private String name;
    //Coin Type , count.
    @Column
    private HashMap<CryptoCoin, Double> values;


}
