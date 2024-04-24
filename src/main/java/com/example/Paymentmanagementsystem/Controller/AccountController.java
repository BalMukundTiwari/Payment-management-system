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

import com.example.Paymentmanagementsystem.DAO.Accounts;
import com.example.Paymentmanagementsystem.Service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
    private AccountService accountsService;

    @GetMapping("showAccounts")
    public List<Accounts> getAllAccounts() {
        return accountsService.getAllAccounts();
    }

    @GetMapping("showAccount/{accountId}")
    public Accounts getAccountById(@PathVariable int accountId) {
        return accountsService.getAccountById(accountId);
    }

    @PostMapping("createAccount")
    public Accounts createAccount(@RequestBody Accounts account) {
        return accountsService.createAccount(account);
    }

    @PutMapping("update/{accountId}")
    public Accounts updateAccount(@PathVariable int accountId, @RequestBody Accounts account) {
        return accountsService.updateAccount(accountId, account);
    }

    @DeleteMapping("delete/{accountId}")
    public void deleteAccount(@PathVariable int accountId) {
        accountsService.deleteAccount(accountId);
    }

}
