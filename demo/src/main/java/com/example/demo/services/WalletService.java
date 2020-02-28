package com.example.demo.services;

import com.example.demo.entities.Wallet;
import com.example.demo.repositories.WalletRespository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WalletService  {

    @Autowired
    private WalletRespository walletRespository;

    public List<Wallet> getAll(){
        List<Wallet> walletList = walletRespository.findAll();
        if (walletList.isEmpty()){
            return new ArrayList<Wallet>();
        }else{
            return walletList;
        }
    }

    public Wallet getWalletById(Long id) throws NotFoundException {

        Optional<Wallet> wallet = walletRespository.findById(id);
        if(wallet.isPresent()){
            return wallet.get();
        }else{
            throw new NotFoundException("the id no exist");
        }

    }

    public <S extends Wallet> S save(S s) {
        return null;
    }
    public void delete(long id) throws NotFoundException {

        Optional<Wallet> wallet = walletRespository.findById(id);

        if(wallet.isPresent()) {

            walletRespository.deleteById(id);

        }else{

            throw new NotFoundException("the id no exist");
        }

    }

    public void createWallet(Wallet wallet){

        walletRespository.save(wallet);

    }

    public Wallet updateWallet(Long id,String coin, Double quantity) throws NotFoundException {

        Optional<Wallet> wallet = walletRespository.findById(id);

        if(wallet.isPresent()){

            Wallet wallet1 = wallet.get();
            wallet1.getPrices().put(coin,quantity);

            return wallet1;


        }else{
            throw new NotFoundException("the id no exist");
        }


    }



}
