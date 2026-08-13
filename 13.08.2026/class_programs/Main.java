//Mariamman Indian Bank – Customer Account Management System

// class BankAccount {

//     // Common to all accounts
//     static String bankName = "Mariamman Indian Bank";

//     // Private instance variables
//     private int accountNumber;
//     private String accountHolderName;
//     private String mobileNumber;
//     private String accountType;
//     private double balance;

//     // Constructor
//     BankAccount(int accountNumber, String accountHolderName,
//                 String mobileNumber, String accountType,
//                 double balance) {

//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.mobileNumber = mobileNumber;
//         this.accountType = accountType;
//         this.balance = balance;
//     }

//     // Getter for account number
//     public int getAccountNumber() {
//         return accountNumber;
//     }

//     // Getter for account holder name
//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     // Getter for mobile number
//     public String getMobileNumber() {
//         return mobileNumber;
//     }

//     // Getter for account type
//     public String getAccountType() {
//         return accountType;
//     }

//     // Getter for balance
//     public double getBalance() {
//         return balance;
//     }

//     // Setter ONLY for mobile number
//     public void setMobileNumber(String mobileNumber) {
//         this.mobileNumber = mobileNumber;
//     }

//     // Deposit method
//     public void deposit(double amount) {

//         if (amount <= 0) {
//             System.out.println("Invalid deposit amount.");
//         } else {
//             balance = balance + amount;

//             System.out.println("Deposit successful.");
//             System.out.println("Deposited Amount : Rs." + amount);
//             System.out.println("New Balance      : Rs." + balance);
//         }
//     }

//     // Withdraw method
//     public void withdraw(double amount) {

//         if (amount <= 0) {
//             System.out.println("Invalid withdrawal amount.");
//         } 
//         else if (amount > balance) {
//             System.out.println("Insufficient balance.");
//         } 
//         else {
//             balance = balance - amount;

//             System.out.println("Withdrawal successful.");
//             System.out.println("Withdrawn Amount : Rs." + amount);
//             System.out.println("New Balance      : Rs." + balance);
//         }
//     }

//     // Display account details
//     public void displayAccountDetails() {

//         System.out.println("====================================");
//         System.out.println("       MARIAMMAN INDIAN BANK");
//         System.out.println("====================================");

//         System.out.println("Account Number : " + accountNumber);
//         System.out.println("Account Holder : " + accountHolderName);
//         System.out.println("Mobile Number  : " + mobileNumber);
//         System.out.println("Account Type   : " + accountType);
//         System.out.println("Balance        : Rs." + balance);

//         System.out.println("====================================");
//     }
// }


// public class Main {

//     public static void main(String[] args) {

//         // Creating Account 1
//         BankAccount account1 = new BankAccount(
//                 1001,
//                 "Arun",
//                 "9876543210",
//                 "Savings",
//                 25000
//         );

//         // Creating Account 2
//         BankAccount account2 = new BankAccount(
//                 1002,
//                 "Kumar",
//                 "9876501234",
//                 "Current",
//                 50000
//         );


//         // =========================================
//         // ACCOUNT 1
//         // =========================================

//         System.out.println("\n******** ACCOUNT 1 ********");

//         // 1. Display account details
//         account1.displayAccountDetails();


//         // 2. Deposit Rs.5000
//         System.out.println("\n--- Depositing Rs.5000 ---");
//         account1.deposit(5000);


//         // 3. Display updated balance
//         System.out.println("\nUpdated Balance : Rs."
//                 + account1.getBalance());


//         // 4. Withdraw Rs.3000
//         System.out.println("\n--- Withdrawing Rs.3000 ---");
//         account1.withdraw(3000);


//         // 5. Display updated balance
//         System.out.println("\nUpdated Balance : Rs."
//                 + account1.getBalance());


//         // 6. Change mobile number
//         System.out.println("\n--- Changing Mobile Number ---");

//         account1.setMobileNumber("9999999999");


//         // 7. Display updated mobile number
//         System.out.println("Updated Mobile Number : "
//                 + account1.getMobileNumber());


//         // 8. Try depositing negative amount
//         System.out.println("\n--- Negative Deposit Test ---");
//         account1.deposit(-500);


//         // 9. Try withdrawing negative amount
//         System.out.println("\n--- Negative Withdrawal Test ---");
//         account1.withdraw(-1000);


//         // 10. Try withdrawing greater than balance
//         System.out.println("\n--- Insufficient Balance Test ---");
//         account1.withdraw(50000);


//         // Display final Account 1 details
//         System.out.println("\n******** FINAL ACCOUNT 1 DETAILS ********");
//         account1.displayAccountDetails();


//         // =========================================
//         // ACCOUNT 2
//         // =========================================

//         System.out.println("\n\n******** ACCOUNT 2 ********");

//         // 1. Display account details
//         account2.displayAccountDetails();


//         // 2. Deposit Rs.10000
//         System.out.println("\n--- Depositing Rs.10000 ---");
//         account2.deposit(10000);


//         // 3. Withdraw Rs.5000
//         System.out.println("\n--- Withdrawing Rs.5000 ---");
//         account2.withdraw(5000);


//         // 4. Display final account details
//         System.out.println("\n******** FINAL ACCOUNT 2 DETAILS ********");
//         account2.displayAccountDetails();


//         // =========================================
//         // STATIC BANK NAME DEMONSTRATION
//         // =========================================

//         System.out.println("\n******** STATIC BANK NAME ********");

//         System.out.println("Account 1 Bank Name : "
//                 + BankAccount.bankName);

//         System.out.println("Account 2 Bank Name : "
//                 + BankAccount.bankName);
//     }
// }






//Q1

// abstract class BankAccount {

//     private int accountNumber;
//     private String accountHolderName;
//     private double balance;

//     // Constructor
//     BankAccount(int accountNumber, String accountHolderName, double balance) {
//         if (balance < 0) {
//             throw new IllegalArgumentException("Balance cannot be negative.");
//         }

//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = balance;
//     }

//     // Getters
//     public int getAccountNumber() {
//         return accountNumber;
//     }

//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     // Deposit method
//     public void deposit(double amount) {

//         if (amount <= 0) {
//             throw new IllegalArgumentException(
//                 "Invalid deposit amount. Amount must be greater than zero."
//             );
//         }

//         balance = balance + amount;

//         System.out.println("Deposit successful: Rs." + amount);
//         System.out.println("Current Balance: Rs." + balance);
//     }

//     // Protected method to modify balance
//     protected void updateBalance(double amount) {
//         balance = balance + amount;
//     }

//     // Abstract withdrawal method
//     public abstract void withdraw(double amount);

//     // Display details
//     public void displayDetails() {
//         System.out.println("Account Number      : " + accountNumber);
//         System.out.println("Account Holder Name : " + accountHolderName);
//         System.out.println("Balance             : Rs." + balance);
//     }
// }


// // Savings Account
// class SavingsAccount extends BankAccount {

//     private double minimumBalance = 1000;

//     SavingsAccount(int accountNumber, String accountHolderName,
//                    double balance) {

//         super(accountNumber, accountHolderName, balance);
//     }

//     @Override
//     public void withdraw(double amount) {

//         if (amount <= 0) {
//             throw new IllegalArgumentException(
//                 "Invalid withdrawal amount."
//             );
//         }

//         if (getBalance() - amount < minimumBalance) {
//             throw new IllegalArgumentException(
//                 "Insufficient balance. Minimum balance of Rs."
//                 + minimumBalance + " must be maintained."
//             );
//         }

//         updateBalance(-amount);

//         System.out.println("Withdrawal successful: Rs." + amount);
//         System.out.println("Current Balance: Rs." + getBalance());
//     }
// }


// // Current Account
// class CurrentAccount extends BankAccount {

//     private double minimumBalance = 500;

//     CurrentAccount(int accountNumber, String accountHolderName,
//                    double balance) {

//         super(accountNumber, accountHolderName, balance);
//     }

//     @Override
//     public void withdraw(double amount) {

//         if (amount <= 0) {
//             throw new IllegalArgumentException(
//                 "Invalid withdrawal amount."
//             );
//         }

//         if (getBalance() - amount < minimumBalance) {
//             throw new IllegalArgumentException(
//                 "Insufficient balance. Minimum balance of Rs."
//                 + minimumBalance + " must be maintained."
//             );
//         }

//         updateBalance(-amount);

//         System.out.println("Withdrawal successful: Rs." + amount);
//         System.out.println("Current Balance: Rs." + getBalance());
//     }
// }


// // Main class
// public class Main {

//     public static void main(String[] args) {

//         System.out.println("========== SAVINGS ACCOUNT ==========");

//         BankAccount account = new SavingsAccount(
//                 101,
//                 "Santhosh",
//                 10000
//         );

//         account.displayDetails();

//         try {

//             account.deposit(2000);

//             account.withdraw(5000);

//             // Invalid transaction
//             account.withdraw(10000);

//         } catch (IllegalArgumentException e) {

//             System.out.println("Transaction failed: " + e.getMessage());

//         } finally {

//             System.out.println("Bank transaction completed.");
//         }


//         System.out.println("\n========== CURRENT ACCOUNT ==========");

//         account = new CurrentAccount(
//                 102,
//                 "Kumar",
//                 15000
//         );

//         account.displayDetails();

//         try {

//             account.deposit(3000);

//             account.withdraw(5000);

//         } catch (IllegalArgumentException e) {

//             System.out.println("Transaction failed: " + e.getMessage());

//         } finally {

//             System.out.println("Bank transaction completed.");
//         }

//         System.out.println("\nFinal Balance: Rs." + account.getBalance());
//     }
// }



//Q2




// abstract class Product {

//     private int productId;
//     private String productName;
//     private double price;

//     // Constructor
//     Product(int productId, String productName, double price) {

//         if (price <= 0) {
//             throw new IllegalArgumentException(
//                 "Product price must be greater than zero."
//             );
//         }

//         this.productId = productId;
//         this.productName = productName;
//         this.price = price;
//     }

//     // Getters
//     public int getProductId() {
//         return productId;
//     }

//     public String getProductName() {
//         return productName;
//     }

//     public double getPrice() {
//         return price;
//     }

//     // Abstract method
//     public abstract double calculateDiscount();

//     // Calculate final price
//     public double calculateFinalPrice() {
//         return price - calculateDiscount();
//     }

//     // Display details
//     public void displayDetails() {

//         System.out.println("Product ID      : " + productId);
//         System.out.println("Product Name    : " + productName);
//         System.out.println("Original Price  : Rs." + price);
//         System.out.println("Discount Amount : Rs." + calculateDiscount());
//         System.out.println("Final Price     : Rs." + calculateFinalPrice());
//     }
// }


// // Electronics
// class Electronics extends Product {

//     Electronics(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }

//     @Override
//     public double calculateDiscount() {
//         return getPrice() * 10 / 100;
//     }
// }


// // Clothing
// class Clothing extends Product {

//     Clothing(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }

//     @Override
//     public double calculateDiscount() {
//         return getPrice() * 20 / 100;
//     }
// }


// // Grocery
// class Grocery extends Product {

//     Grocery(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }

//     @Override
//     public double calculateDiscount() {
//         return getPrice() * 5 / 100;
//     }
// }


// // Main class
// public class Main {

//     public static void main(String[] args) {

//         Product product;

//         try {

//             System.out.println("========== ELECTRONICS ==========");

//             product = new Electronics(
//                     101,
//                     "Laptop",
//                     50000
//             );

//             product.displayDetails();


//             System.out.println("\n========== CLOTHING ==========");

//             product = new Clothing(
//                     102,
//                     "Shirt",
//                     2000
//             );

//             product.displayDetails();


//             System.out.println("\n========== GROCERY ==========");

//             product = new Grocery(
//                     103,
//                     "Rice",
//                     1000
//             );

//             product.displayDetails();


//             System.out.println("\n========== INVALID PRODUCT TEST ==========");

//             product = new Electronics(
//                     104,
//                     "Mobile",
//                     -5000
//             );

//         } catch (IllegalArgumentException e) {

//             System.out.println("Product processing failed: "
//                     + e.getMessage());

//         } finally {

//             System.out.println("Product processing completed.");
//         }
//     }
// }


