package com.example.Paymentmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Paymentmanagementsystem.DAO.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

}
