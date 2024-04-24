package com.example.Paymentmanagementsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Paymentmanagementsystem.DAO.Transactions;
import com.example.Paymentmanagementsystem.Service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
    private TransactionService transactionsService;

    @GetMapping("showTransactions")
    public List<Transactions> getAllTransactions() {
        return transactionsService.getAllTransactions();
    }

    @GetMapping("showTransactionById/{transactionId}")
    public Transactions getTransactionById(@PathVariable int transactionId) {
        return transactionsService.getTransactionById(transactionId);
    }

    @PostMapping("createTransaction")
    public Transactions createTransaction(@RequestBody Transactions transaction) {
        return transactionsService.createTransaction(transaction);
    }

    @PutMapping("update/{transactionId}")
    public Transactions updateTransaction(@PathVariable int transactionId, @RequestBody Transactions transaction) {
        return transactionsService.updateTransaction(transactionId, transaction);
    }

    @DeleteMapping("delete/{transactionId}")
    public void deleteTransaction(@PathVariable int transactionId) {
        transactionsService.deleteTransaction(transactionId);
    }

}
