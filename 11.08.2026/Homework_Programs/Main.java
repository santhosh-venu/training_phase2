// // First interface
// interface Camera {

//     void takePhoto();
// }

// // Second interface
// interface MusicPlayer {

//     void playMusic();
// }

// // Class implementing multiple interfaces
// class Smartphone implements Camera, MusicPlayer {

//     @Override
//     public void takePhoto() {
//         System.out.println("Smartphone takes a photo.");
//     }

//     @Override
//     public void playMusic() {
//         System.out.println("Smartphone plays music.");
//     }

//     // Smartphone's own method
//     public void makeCall() {
//         System.out.println("Smartphone makes a call.");
//     }
// }

// // Main class
// public class Main {

//     public static void main(String[] args) {

//         Smartphone phone = new Smartphone();

//         phone.takePhoto();
//         phone.playMusic();
//         phone.makeCall();
//     }
// }


// abstract class Product {
//     int productId;
//     String productName;
//     double price;
//     Product(int productId, String productName, double price) {
//         this.productId = productId;
//         this.productName = productName;
//         this.price = price;
//     }
//     abstract double calculateDiscount();
//     double calculateFinalPrice() {
//         return price - calculateDiscount();
//     }
//     void displayDetails() {
//         System.out.println("ProductId    : " + productId);
//         System.out.println("ProductName  : " + productName);
//         System.out.println("Price        : " + price);
//         System.out.println("Discount     : " + calculateDiscount());
//         System.out.println("Final Price  : " + calculateFinalPrice());
//     }
// }
// class Electronics extends Product {
//     Electronics(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }
//     @Override
//     double calculateDiscount() {
//         return price * 10 / 100;
//     }
// }
// class Clothing extends Product {
//     Clothing(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }
//     @Override
//     double calculateDiscount() {
//         return price * 20 / 100;
//     }
// }
// class Grocery extends Product {
//     Grocery(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }

//     @Override
//     double calculateDiscount() {
//         return price * 5 / 100;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Product p;
//         System.out.println("------------- Electronics ------------");
//         p = new Electronics(123, "Laptop", 55000);
//         p.displayDetails();

//         System.out.println("\n------------- Clothing ------------");
//         p = new Clothing(124, "Shirt", 2000);
//         p.displayDetails();

//         System.out.println("\n------------- Grocery ------------");
//         p = new Grocery(125, "Rice", 1000);
//         p.displayDetails();
//     }
// }


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
// public class Main {
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



