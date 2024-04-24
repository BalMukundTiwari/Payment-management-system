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

import com.example.Paymentmanagementsystem.DAO.Bank;
import com.example.Paymentmanagementsystem.Service.BankService;


@RestController
public class BankController {
	
	@Autowired
    private BankService bankService;

    @GetMapping("showBanks")
    public List<Bank> getAllBanks() {
        return bankService.getAllBanks();
    }

    @GetMapping("showBankById/{bankId}")
    public Bank getBankById(@PathVariable int bankId) {
        return bankService.getBankById(bankId);
    }

    @PostMapping("createBank")
    public Bank createBank(@RequestBody Bank bank) {
        return bankService.createBank(bank);
    }

    @PutMapping("update/{bankId}")
    public Bank updateBank(@PathVariable int bankId, @RequestBody Bank bank) {
        return bankService.updateBank(bankId, bank);
    }

    @DeleteMapping("delete/{bankId}")
    public void deleteBank(@PathVariable int bankId) {
        bankService.deleteBank(bankId);
    }

}
