// import java.util.*;
// import java.util.concurrent.atomic.AtomicInteger;

// class Transaction {
//     static AtomicInteger counter = new AtomicInteger(1001);

//     int id;
//     String type;
//     double amount;
//     String source;
//     String destination;
//     String status;

//     Transaction(String type, double amount, String source,
//                 String destination, String status) {
//         id = counter.getAndIncrement();
//         this.type = type;
//         this.amount = amount;
//         this.source = source;
//         this.destination = destination;
//         this.status = status;
//     }

//     public String toString() {
//         return "ID: " + id +
//                " | " + type +
//                " | Amount: ₹" + amount +
//                " | From: " + source +
//                " | To: " + destination +
//                " | " + status;
//     }
// }

// class Account {
//     int accountNumber;
//     String customerName;
//     double balance;
//     List<Transaction> history = new ArrayList<>();

//     Account(int accountNumber, String customerName, double balance) {
//         this.accountNumber = accountNumber;
//         this.customerName = customerName;
//         this.balance = balance;
//     }

//     synchronized void deposit(double amount) {
//         balance += amount;

//         history.add(new Transaction(
//             "DEPOSIT",
//             amount,
//             "-",
//             String.valueOf(accountNumber),
//             "SUCCESS"
//         ));
//     }

//     synchronized boolean withdraw(double amount) {
//         if (balance < amount) {
//             history.add(new Transaction(
//                 "WITHDRAW",
//                 amount,
//                 String.valueOf(accountNumber),
//                 "-",
//                 "FAILED"
//             ));
//             return false;
//         }

//         balance -= amount;

//         history.add(new Transaction(
//             "WITHDRAW",
//             amount,
//             String.valueOf(accountNumber),
//             "-",
//             "SUCCESS"
//         ));

//         return true;
//     }

//     synchronized double getBalance() {
//         return balance;
//     }

//     synchronized void addHistory(Transaction t) {
//         history.add(t);
//     }

//     void displayHistory() {
//         synchronized (this) {
//             for (Transaction t : history) {
//                 System.out.println(t);
//             }
//         }
//     }
// }

// class Bank {

//     // Thread-safe transfer with deadlock prevention
//     static boolean transfer(Account from, Account to, double amount) {

//         Account first;
//         Account second;

//         // Always lock accounts in account-number order
//         if (from.accountNumber < to.accountNumber) {
//             first = from;
//             second = to;
//         } else {
//             first = to;
//             second = from;
//         }

//         synchronized (first) {
//             synchronized (second) {

//                 try {
//                     Thread.sleep(100);
//                 } catch (InterruptedException e) {
//                     Thread.currentThread().interrupt();
//                 }

//                 if (from.balance < amount) {

//                     from.history.add(new Transaction(
//                         "TRANSFER",
//                         amount,
//                         String.valueOf(from.accountNumber),
//                         String.valueOf(to.accountNumber),
//                         "FAILED"
//                     ));

//                     return false;
//                 }

//                 // Debit source
//                 from.balance -= amount;

//                 // Credit destination
//                 to.balance += amount;

//                 // Record transaction in both accounts
//                 from.history.add(new Transaction(
//                     "TRANSFER",
//                     amount,
//                     String.valueOf(from.accountNumber),
//                     String.valueOf(to.accountNumber),
//                     "SUCCESS"
//                 ));

//                 to.history.add(new Transaction(
//                     "TRANSFER",
//                     amount,
//                     String.valueOf(from.accountNumber),
//                     String.valueOf(to.accountNumber),
//                     "SUCCESS"
//                 ));

//                 return true;
//             }
//         }
//     }
// }

// class Customer implements Runnable {

//     String operation;
//     Account a1;
//     Account a2;
//     double amount;

//     Customer(String operation, Account a1, Account a2, double amount) {
//         this.operation = operation;
//         this.a1 = a1;
//         this.a2 = a2;
//         this.amount = amount;
//     }

//     public void run() {

//         try {
//             Thread.sleep(50);

//             if (operation.equals("DEPOSIT")) {
//                 a1.deposit(amount);

//                 System.out.println(
//                     Thread.currentThread().getName() +
//                     " deposited ₹" + amount +
//                     " into Account " + a1.accountNumber
//                 );

//             } else if (operation.equals("WITHDRAW")) {

//                 boolean result = a1.withdraw(amount);

//                 System.out.println(
//                     Thread.currentThread().getName() +
//                     " withdraw ₹" + amount +
//                     " from Account " + a1.accountNumber +
//                     " -> " + (result ? "SUCCESS" : "FAILED")
//                 );

//             } else if (operation.equals("TRANSFER")) {

//                 boolean result = Bank.transfer(a1, a2, amount);

//                 System.out.println(
//                     Thread.currentThread().getName() +
//                     " transferred ₹" + amount +
//                     " from Account " + a1.accountNumber +
//                     " to Account " + a2.accountNumber +
//                     " -> " + (result ? "SUCCESS" : "FAILED")
//                 );

//             } else if (operation.equals("BALANCE")) {

//                 System.out.println(
//                     Thread.currentThread().getName() +
//                     " checked Account " + a1.accountNumber +
//                     " balance: ₹" + a1.getBalance()
//                 );
//             }

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) throws Exception {

//         // Create accounts
//         Account acc1001 =
//             new Account(1001, "Arun", 20000);

//         Account acc1002 =
//             new Account(1002, "Kumar", 15000);

//         Account acc1003 =
//             new Account(1003, "Ravi", 10000);

//         // Create 10 customer threads
//         Thread t1 = new Thread(
//             new Customer("TRANSFER", acc1001, acc1002, 5000),
//             "Customer-1"
//         );

//         Thread t2 = new Thread(
//             new Customer("WITHDRAW", acc1002, null, 7000),
//             "Customer-2"
//         );

//         Thread t3 = new Thread(
//             new Customer("DEPOSIT", acc1003, null, 3000),
//             "Customer-3"
//         );

//         Thread t4 = new Thread(
//             new Customer("TRANSFER", acc1002, acc1003, 8000),
//             "Customer-4"
//         );

//         Thread t5 = new Thread(
//             new Customer("WITHDRAW", acc1001, null, 4000),
//             "Customer-5"
//         );

//         // Extra withdrawal to match the given final balance
//         Thread t6 = new Thread(
//             new Customer("WITHDRAW", acc1003, null, 3000),
//             "Customer-6"
//         );

//         // C -> A
//         Thread t7 = new Thread(
//             new Customer("TRANSFER", acc1003, acc1001, 2000),
//             "Customer-7"
//         );

//         // A -> C
//         Thread t8 = new Thread(
//             new Customer("TRANSFER", acc1001, acc1003, 2000),
//             "Customer-8"
//         );

//         // Deposit and withdrawal cancel each other
//         Thread t9 = new Thread(
//             new Customer("DEPOSIT", acc1001, null, 1000),
//             "Customer-9"
//         );

//         Thread t10 = new Thread(
//             new Customer("WITHDRAW", acc1001, null, 1000),
//             "Customer-10"
//         );

//         // Start all threads
//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
//         t6.start();
//         t7.start();
//         t8.start();
//         t9.start();
//         t10.start();

//         // Wait for all threads to finish
//         t1.join();
//         t2.join();
//         t3.join();
//         t4.join();
//         t5.join();
//         t6.join();
//         t7.join();
//         t8.join();
//         t9.join();
//         t10.join();

//         // Final Bank Report
//         System.out.println("\n========== BANK REPORT ==========");

//         System.out.println("\nAccount 1001");
//         System.out.println("Customer: " + acc1001.customerName);
//         System.out.println("Final Balance: ₹" + acc1001.getBalance());

//         System.out.println("\nAccount 1002");
//         System.out.println("Customer: " + acc1002.customerName);
//         System.out.println("Final Balance: ₹" + acc1002.getBalance());

//         System.out.println("\nAccount 1003");
//         System.out.println("Customer: " + acc1003.customerName);
//         System.out.println("Final Balance: ₹" + acc1003.getBalance());

//         // Transaction history
//         System.out.println("\n========== TRANSACTION HISTORY ==========");

//         System.out.println("\nAccount 1001:");
//         acc1001.displayHistory();

//         System.out.println("\nAccount 1002:");
//         acc1002.displayHistory();

//         System.out.println("\nAccount 1003:");
//         acc1003.displayHistory();
//     }
// }