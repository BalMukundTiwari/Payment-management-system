//package com.example.Paymentmanagementsystem.Controller;
//
//public class AdminController {
//	
//	
//	@Autowired
//    private BankService bankService;
//
//    // Create new bank
//    @PostMapping("/banks")
//    public ResponseEntity<Bank> createBank(@RequestBody Bank bank) {
//        Bank newBank = bankService.createBank(bank);
//        return ResponseEntity.ok(newBank);
//    }
//
//    // Retrieve list of registered banks
//    @GetMapping("/banks")
//    public ResponseEntity<List<Bank>> getBanks() {
//        List<Bank> banks = bankService.getBanks();
//        return ResponseEntity.ok(banks);
//    }
//
//    // Retrieve overview of all registered accounts
//    @GetMapping("/accounts")
//    public ResponseEntity<List<Account>> getAccounts() {
//        List<Account> accounts = accountService.getAccounts();
//        return ResponseEntity.ok(accounts);
//    }
//
//    // Retrieve detailed information about specific user account
//    @GetMapping("/accounts/{accountId}")
//    public ResponseEntity<Account> getAccount(@PathVariable Long accountId) {
//        Account account = accountService.getAccount(accountId);
//        return ResponseEntity.ok(account);
//    }
//
//    // Retrieve payment history for a particular account
//    @GetMapping("/accounts/{accountId}/payments")
//    public ResponseEntity<List<Payment>> getPaymentHistory(@PathVariable Long accountId) {
//        List<Payment> payments = paymentService.getPaymentHistory(accountId);
//        return ResponseEntity.ok(payments);
//    }
//
//    // Check account balance
//    @GetMapping("/accounts/{accountId}/balance")
//    public ResponseEntity<Double> getAccountBalance(@PathVariable Long accountId) {
//        Double balance = accountService.getAccountBalance(accountId);
//        return ResponseEntity.ok(balance);
//    }
//
//    // Retrieve comprehensive record of all payments
//    @GetMapping("/payments")
//    public ResponseEntity<List<Payment>> getPayments() {
//        List<Payment> payments = paymentService.getPayments();
//        return ResponseEntity.ok(payments);
//    }
//
//    // Retrieve specific details about a payment using its unique identifier
//    @GetMapping("/payments/{paymentId}")
//    public ResponseEntity<Payment> getPayment(@PathVariable Long paymentId) {
//        Payment payment = paymentService.getPayment(paymentId);
//        return ResponseEntity.ok(payment);
//    }
//
//    // Verify payment status using its provided identifier
//    @GetMapping("/payments/{paymentId}/status")
//    public ResponseEntity<String> getPaymentStatus(@PathVariable Long paymentId) {
//        String status = paymentService.getPaymentStatus(paymentId);
//        return ResponseEntity.ok(status);
//    }
//
//}
