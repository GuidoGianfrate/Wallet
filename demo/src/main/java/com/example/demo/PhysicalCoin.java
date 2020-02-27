package com.example.demo;

import javax.persistence.Column;

public class PhysicalCoin extends Currency {
    @Column
    private double value;


}
