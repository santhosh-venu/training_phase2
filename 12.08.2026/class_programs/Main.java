// abstract class Product {
//     int productId;
//     String productName;
//     double price;

//     Product(int productId, String productName, double price) {
//         this.productId = productId;
//         this.productName = productName;
//         this.price = price;
//     }

//     // Abstract method
//     abstract double calculateDiscount();

//     // Concrete method
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


// // Electronics - 10% discount
// class Electronics extends Product {

//     Electronics(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }

//     @Override
//     double calculateDiscount() {
//         return price * 10 / 100;
//     }
// }


// // Clothing - 20% discount
// class Clothing extends Product {

//     Clothing(int productId, String productName, double price) {
//         super(productId, productName, price);
//     }

//     @Override
//     double calculateDiscount() {
//         return price * 20 / 100;
//     }
// }


// // Grocery - 5% discount
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







// class Animal {

//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }

//     void run() {
//         System.out.println("Dog is running");
//     }
// }

// class Cat extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }

//     void jump() {
//         System.out.println("Cat is jumping");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         // Runtime polymorphism
//         Animal a1 = new Dog();
//         Animal a2 = new Cat();

//         System.out.println("----- Dog -----");

//         a1.sound();

//         // instanceof check before downcasting
//         if (a1 instanceof Dog) {
//             Dog d = (Dog) a1;
//             d.run();
//         }

//         System.out.println("\n----- Cat -----");

//         a2.sound();

//         // instanceof check before downcasting
//         if (a2 instanceof Cat) {
//             Cat c = (Cat) a2;
//             c.jump();
//         }
//     }
// }


