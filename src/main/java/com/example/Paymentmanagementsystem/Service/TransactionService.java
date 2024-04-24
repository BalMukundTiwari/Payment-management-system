package com.example.Paymentmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Paymentmanagementsystem.DAO.Transactions;
import com.example.Paymentmanagementsystem.Repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
    private TransactionRepository transactionsRepository;

    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    public Transactions getTransactionById(int transactionId) {
        return transactionsRepository.findById(transactionId).orElseThrow();
    }

    public Transactions createTransaction(Transactions transaction) {
        return transactionsRepository.save(transaction);
    }

    public Transactions updateTransaction(int transactionId, Transactions transaction) {
        Transactions existingTransaction = getTransactionById(transactionId);
        existingTransaction.setSenderAccountId(transaction.getSenderAccountId());
        existingTransaction.setReceiverAccountid(transaction.getReceiverAccountid());
        existingTransaction.setAmount(transaction.getAmount());
        existingTransaction.setStatus(transaction.getStatus());
        return transactionsRepository.save(existingTransaction);
    }

    public void deleteTransaction(int transactionId) {
        transactionsRepository.deleteById(transactionId);
    }

}
