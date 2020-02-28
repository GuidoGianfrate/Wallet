package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Dictionary;
import java.util.HashMap;


@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @NotNull
    private String name;
    //Coin Type , count.
    @Column
    private HashMap<String, Double> prices;

    public void addMoney(String coin, double quantity){

        prices.put(coin,quantity);
    }


    public HashMap<String, Double> getPrices(){

        return prices;
    }

    @Override
    public String toString() {
    return "";
    }
}
