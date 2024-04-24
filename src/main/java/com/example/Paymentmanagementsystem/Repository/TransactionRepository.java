package com.example.Paymentmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Paymentmanagementsystem.DAO.Transactions;
@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer> {

}
