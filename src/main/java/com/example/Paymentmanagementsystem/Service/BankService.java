package com.example.Paymentmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Paymentmanagementsystem.DAO.Bank;
import com.example.Paymentmanagementsystem.Repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
    private BankRepository bankRepository;

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank getBankById(int bankId) {
        return bankRepository.findById(bankId).orElseThrow();
    }

    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    public Bank updateBank(int bankId, Bank bank) {
        Bank existingBank = getBankById(bankId);
        existingBank.setBankName(bank.getBankName());
        return bankRepository.save(existingBank);
    }

    public void deleteBank(int bankId) {
        bankRepository.deleteById(bankId);
    }

}
