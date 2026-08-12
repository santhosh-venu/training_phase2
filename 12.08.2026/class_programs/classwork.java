//Q1

// abstract class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
//     abstract void sound();
// }


// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }
// class Cow extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cow moos");
//     }
// }
// public class AnimalCode {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         Cat cat = new Cat();
//         Cow cow = new Cow();
//         System.out.println("Dog:");
//         dog.eat();
//         dog.sound();
//         System.out.println("\nCat:");
//         cat.eat();
//         cat.sound();
//         System.out.println("\nCow:");
//         cow.eat();
//         cow.sound();
//     }
// }


//Q2

// abstract class Employee {
//     int employeeId;
//     String employeeName;
//     double basicSalary;
//     Employee(int employeeId, String employeeName, double basicSalary) {
//         this.employeeId = employeeId;
//         this.employeeName = employeeName;
//         this.basicSalary = basicSalary;
//     }
//     abstract double calculateSalary();
//     void displayDetails() {
//         System.out.println("Employee ID   : " + employeeId);
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Basic Salary  : " + basicSalary);
//         System.out.println("Final Salary  : " + calculateSalary());
//     }
// }

// class Developer extends Employee {
//     double developerBonus;
//     Developer(int employeeId, String employeeName,
//               double basicSalary, double developerBonus) {

//         super(employeeId, employeeName, basicSalary);
//         this.developerBonus = developerBonus;
//     }

//     @Override
//     double calculateSalary() {
//         return basicSalary + developerBonus;
//     }
// }

// class Tester extends Employee {
//     double testingAllowance;
//     Tester(int employeeId, String employeeName,
//            double basicSalary, double testingAllowance) {

//         super(employeeId, employeeName, basicSalary);
//         this.testingAllowance = testingAllowance;
//     }

//     @Override
//     double calculateSalary() {
//         return basicSalary + testingAllowance;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("-------- Developer --------");
//         Developer d = new Developer(
//                 101,
//                 "Santhosh",
//                 50000,
//                 10000
//         );
//         d.displayDetails();
//         System.out.println("\n-------- Tester --------");
//         Tester t = new Tester(
//                 102,
//                 "Kumar",
//                 45000,
//                 5000
//         );

//         t.displayDetails();
//     }
// }



//Q3


// abstract class Vehicle {
//     abstract void start();
//     void stop() {
//         System.out.println("Vehicle stops");
//     }
// }

// class Car extends Vehicle {

//     @Override
//     void start() {
//         System.out.println("Car starts with a key");
//     }
// }
// class Bike extends Vehicle {

//     @Override
//     void start() {
//         System.out.println("Bike starts with a self-start button");
//     }
// }

// class Bus extends Vehicle {

//     @Override
//     void start() {
//         System.out.println("Bus starts with a key");
//     }
// }


// public class Main {

//     public static void main(String[] args) {

//         Car car = new Car();
//         Bike bike = new Bike();
//         Bus bus = new Bus();

//         System.out.println("-------- Car --------");
//         car.start();
//         car.stop();

//         System.out.println("\n-------- Bike --------");
//         bike.start();
//         bike.stop();

//         System.out.println("\n-------- Bus --------");
//         bus.start();
//         bus.stop();
//     }
// }



//Q4

// abstract class Shape {
//     abstract double calculateArea();
// }

// class Circle extends Shape {

//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }


// class Rectangle extends Shape {

//     double length;
//     double width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     double calculateArea() {
//         return length * width;
//     }
// }

// class Triangle extends Shape {

//     double base;
//     double height;

//     Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//     @Override
//     double calculateArea() {
//         return 0.5 * base * height;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Circle c = new Circle(5);
//         Rectangle r = new Rectangle(10, 5);
//         Triangle t = new Triangle(8, 6);

//         System.out.println("Circle Area    : " + c.calculateArea());
//         System.out.println("Rectangle Area : " + r.calculateArea());
//         System.out.println("Triangle Area  : " + t.calculateArea());
//     }
// }



//Q5


// abstract class Payment {

//     abstract void makePayment();
// }

// class UPI extends Payment {

//     @Override
//     void makePayment() {
//         System.out.println("Payment made using UPI");
//     }
// }


// class CreditCard extends Payment {

//     @Override
//     void makePayment() {
//         System.out.println("Payment made using Credit Card");
//     }
// }

// class DebitCard extends Payment {

//     @Override
//     void makePayment() {
//         System.out.println("Payment made using Debit Card");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         UPI upi = new UPI();
//         CreditCard creditCard = new CreditCard();
//         DebitCard debitCard = new DebitCard();

//         System.out.println("-------- UPI --------");
//         upi.makePayment();

//         System.out.println("\n-------- Credit Card --------");
//         creditCard.makePayment();

//         System.out.println("\n-------- Debit Card --------");
//         debitCard.makePayment();
//     }
// }



//Q6


// abstract class Account {

//     int accountNumber;
//     String accountHolderName;
//     double balance;

//     Account(int accountNumber, String accountHolderName, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = balance;
//     }

//     void deposit(double amount) {
//         balance = balance + amount;
//         System.out.println("Deposited: " + amount);
//         System.out.println("Current Balance: " + balance);
//     }

//     abstract void withdraw(double amount);

//     void displayDetails() {
//         System.out.println("Account Number      : " + accountNumber);
//         System.out.println("Account Holder Name : " + accountHolderName);
//         System.out.println("Balance             : " + balance);
//     }
// }

// class SavingsAccount extends Account {

//     double minimumBalance = 1000;

//     SavingsAccount(int accountNumber, String accountHolderName, double balance) {
//         super(accountNumber, accountHolderName, balance);
//     }

//     @Override
//     void withdraw(double amount) {

//         if (balance - amount >= minimumBalance) {
//             balance = balance - amount;
//             System.out.println("Withdrawn: " + amount);
//             System.out.println("Current Balance: " + balance);
//         } else {
//             System.out.println("Withdrawal denied!");
//             System.out.println("Minimum balance of " + minimumBalance + " must be maintained.");
//         }
//     }
// }

// class CurrentAccount extends Account {

//     double overdraftLimit = 5000;

//     CurrentAccount(int accountNumber, String accountHolderName, double balance) {
//         super(accountNumber, accountHolderName, balance);
//     }

//     @Override
//     void withdraw(double amount) {

//         if (balance - amount >= -overdraftLimit) {
//             balance = balance - amount;
//             System.out.println("Withdrawn: " + amount);
//             System.out.println("Current Balance: " + balance);
//         } else {
//             System.out.println("Withdrawal denied!");
//             System.out.println("Overdraft limit of " + overdraftLimit + " exceeded.");
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("-------- Savings Account --------");

//         SavingsAccount savings =
//                 new SavingsAccount(101, "Santhosh", 10000);

//         savings.displayDetails();

//         savings.deposit(2000);

//         savings.withdraw(5000);

//         System.out.println("\n-------- Current Account --------");

//         CurrentAccount current =
//                 new CurrentAccount(102, "Kumar", 5000);

//         current.displayDetails();

//         current.deposit(2000);

//         current.withdraw(10000);

//         current.withdraw(3000);
//     }
// }



//Q7


// abstract class Order {

//     int orderId;
//     String customerName;
//     double amount;

//     Order(int orderId, String customerName, double amount) {
//         this.orderId = orderId;
//         this.customerName = customerName;
//         this.amount = amount;
//     }

//     abstract double calculateDeliveryCharge();

//     double calculateFinalBill() {
//         return amount + calculateDeliveryCharge();
//     }

//     void displayDetails() {
//         System.out.println("Order ID           : " + orderId);
//         System.out.println("Customer Name      : " + customerName);
//         System.out.println("Food Amount        : " + amount);
//         System.out.println("Delivery Charge    : " + calculateDeliveryCharge());
//         System.out.println("Final Bill         : " + calculateFinalBill());
//     }
// }

// class NormalDelivery extends Order {

//     NormalDelivery(int orderId, String customerName, double amount) {
//         super(orderId, customerName, amount);
//     }

//     @Override
//     double calculateDeliveryCharge() {
//         return 50;
//     }
// }

// class ExpressDelivery extends Order {

//     ExpressDelivery(int orderId, String customerName, double amount) {
//         super(orderId, customerName, amount);
//     }

//     @Override
//     double calculateDeliveryCharge() {
//         return 100;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("-------- Normal Delivery --------");

//         NormalDelivery normal =
//                 new NormalDelivery(101, "Santhosh", 500);

//         normal.displayDetails();


//         System.out.println("\n-------- Express Delivery --------");

//         ExpressDelivery express =
//                 new ExpressDelivery(102, "Kumar", 750);

//         express.displayDetails();
//     }
// }