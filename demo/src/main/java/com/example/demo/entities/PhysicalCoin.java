package com.example.demo.entities;

import javax.persistence.Column;

public class PhysicalCoin extends Currency {
    @Column
    private double value;


}
