package com.example.Paymentmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Paymentmanagementsystem.DAO.Accounts;
import com.example.Paymentmanagementsystem.Repository.AccountsRepository;

@Service
public class AccountService {
	
	 @Autowired
	    private AccountsRepository accountsRepository;

	    public List<Accounts> getAllAccounts() {
	        return accountsRepository.findAll();
	    }

	    public Accounts getAccountById(int accountId) {
	        return accountsRepository.findById(accountId).orElseThrow();
	    }

	    public Accounts createAccount(Accounts account) {
	        return accountsRepository.save(account);
	    }

	    public Accounts updateAccount(int accountId, Accounts account) {
	        Accounts existingAccount = getAccountById(accountId);
	        existingAccount.setBankId(account.getBankId());
	        existingAccount.setBalance(account.getBalance());
	        existingAccount.setCurrency(account.getCurrency());
	        existingAccount.setUserName(account.getUserName());
	        return accountsRepository.save(existingAccount);
	    }

	    public void deleteAccount(int accountId) {
	        accountsRepository.deleteById(accountId);
	    }

}
