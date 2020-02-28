package com.example.demo.services;



import com.example.demo.entities.CryptoCoin;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Service
public class CryptoCompareService {


   public ArrayList<CryptoCoin> getAll() {

       ArrayList<CryptoCoin> cryptoCoins = new ArrayList<CryptoCoin>();


       RestTemplate restTemplate = new RestTemplate();
       Object map = restTemplate.getForObject("https://min-api.cryptocompare.com/data/pricemulti?fsyms=BTC,ETH&tsyms=USD,EUR", Object.class);
       LinkedHashMap<String, LinkedHashMap<String, Double>> dict = (LinkedHashMap<String, LinkedHashMap<String, Double>>) map;

    //CREO EL ETHEREUM CON LOS VALORES DE USD Y EUR
        CryptoCoin ethereum = new CryptoCoin();
        ethereum.setDollarValue(dict.get("ETH").get("USD"));
        ethereum.setEuroValue(dict.get("ETH").get("EUR"));

    //CREO EL BITCOIN CON LOS VALORES DE USD Y EUR

       CryptoCoin bitcoin = new CryptoCoin();
       bitcoin.setDollarValue(dict.get("BTC").get("USD"));
       bitcoin.setEuroValue(dict.get("BTC").get("EUR"));

       cryptoCoins.add(bitcoin);
       cryptoCoins.add(ethereum);

       return cryptoCoins;

       }
}
