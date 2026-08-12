//LEVEL 2 – MEDIUM

//Q6. Employee Salary

// class Employee {
//     String employeeName;
//     double basicSalary;
//     void displayEmployee() {
//         System.out.println("Employee Name: " + employeeName);
//         System.out.println("Basic Salary: " + basicSalary);
//     }
// }
// class Manager extends Employee {
//     double bonus;
//     void displayManager() {
//         double totalSalary = basicSalary + bonus;
//         displayEmployee();
//         System.out.println("Bonus: " + bonus);
//         System.out.println("Total Salary: " + totalSalary);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Manager m = new Manager();
//         m.employeeName = "Santhosh";
//         m.basicSalary = 50000;
//         m.bonus = 10000;
//         m.displayManager();
//     }
// }


//Q7. Method Overriding

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         Cat cat = new Cat();
//         dog.sound();
//         cat.sound();
//     }
// }


//Q8. Inheritance with super

// class Person {
//     String name;
//     int age;
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }
// class Student extends Person {
//     int rollNo;
//     void displayStudent() {
//         super.display();  // Calling parent class display()
//         System.out.println("Roll No: " + rollNo);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.name = "Santhosh";
//         s.age = 20;
//         s.rollNo = 101;
//         s.displayStudent();
//     }
// }


//Q9. Upcasting

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
//     void run() {
//         System.out.println("Dog is running");
//     }
// }
// public class Main {
//     public static void main(String[] args) {

//         Animal a = new Dog();
//         a.eat();
//         a.sound();
//     }
// }

//Q10. Downcasting


// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }
// class Dog extends Animal {
//     void run() {
//         System.out.println("Dog is running");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         if (a instanceof Dog) {
//             Dog d = (Dog) a;
//             d.run();
//         }
//     }
// }


