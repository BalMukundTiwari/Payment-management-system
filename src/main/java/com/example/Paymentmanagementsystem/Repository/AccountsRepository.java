package com.example.Paymentmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Paymentmanagementsystem.DAO.Accounts;
@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

}
