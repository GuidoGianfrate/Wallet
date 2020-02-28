package com.example.demo.repositories;


import com.example.demo.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRespository extends JpaRepository <Wallet,Long> {









}
