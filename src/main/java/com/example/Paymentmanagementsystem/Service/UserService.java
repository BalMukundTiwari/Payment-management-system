package com.example.Paymentmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Paymentmanagementsystem.DAO.Accounts;
import com.example.Paymentmanagementsystem.DAO.Bank;
import com.example.Paymentmanagementsystem.DAO.Transactions;
import com.example.Paymentmanagementsystem.DAO.User;
import com.example.Paymentmanagementsystem.Repository.AccountsRepository;
import com.example.Paymentmanagementsystem.Repository.BankRepository;
import com.example.Paymentmanagementsystem.Repository.TransactionRepository;
import com.example.Paymentmanagementsystem.Repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow();
    }
    
    public List<User> getUsersByRole(String role) {
        return userRepository.findByRole(role);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int id, User user) {
        User existingUser = getUserById(id);
        existingUser.setUserName(user.getUserName());
        existingUser.setPassword(user.getPassword());
        existingUser.setRole(user.getRole());
        return userRepository.save(existingUser);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
