
//Q8


// abstract class HospitalStaff {
//     String name;
//     int employeeId;
//     String department;
//     HospitalStaff(String name, int employeeId, String department) {
//         this.name = name;
//         this.employeeId = employeeId;
//         this.department = department;
//     }

//     abstract void performDuty();

//     void displayDetails() {
//         System.out.println("Name       : " + name);
//         System.out.println("Employee ID: " + employeeId);
//         System.out.println("Department : " + department);
//         performDuty();
//     }
// }

// class Doctor extends HospitalStaff {

//     Doctor(String name, int employeeId, String department) {
//         super(name, employeeId, department);
//     }

//     @Override
//     void performDuty() {
//         System.out.println("Duty       : Treats patients");
//     }
// }

// class Nurse extends HospitalStaff {

//     Nurse(String name, int employeeId, String department) {
//         super(name, employeeId, department);
//     }

//     @Override
//     void performDuty() {
//         System.out.println("Duty       : Takes care of patients");
//     }
// }


// class Pharmacist extends HospitalStaff {

//     Pharmacist(String name, int employeeId, String department) {
//         super(name, employeeId, department);
//     }

//     @Override
//     void performDuty() {
//         System.out.println("Duty       : Dispenses medicines");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Doctor d = new Doctor(
//                 "Dr. Kumar",
//                 101,
//                 "Cardiology"
//         );

//         Nurse n = new Nurse(
//                 "Priya",
//                 102,
//                 "Emergency"
//         );

//         Pharmacist p = new Pharmacist(
//                 "Arun",
//                 103,
//                 "Pharmacy"
//         );

//         System.out.println("-------- Doctor --------");
//         d.displayDetails();

//         System.out.println("\n-------- Nurse --------");
//         n.displayDetails();

//         System.out.println("\n-------- Pharmacist --------");
//         p.displayDetails();
//     }
// }



//Q9

// abstract class Course {

//     int courseId;
//     String courseName;
//     String instructor;
//     double baseFee;

//     Course(int courseId, String courseName,
//            String instructor, double baseFee) {

//         this.courseId = courseId;
//         this.courseName = courseName;
//         this.instructor = instructor;
//         this.baseFee = baseFee;
//     }

//     abstract double calculateFee();

//     void displayDetails() {

//         System.out.println("Course ID   : " + courseId);
//         System.out.println("Course Name : " + courseName);
//         System.out.println("Instructor  : " + instructor);
//         System.out.println("Base Fee    : " + baseFee);
//         System.out.println("Final Fee   : " + calculateFee());
//     }
// }

// class ProgrammingCourse extends Course {

//     ProgrammingCourse(int courseId, String courseName,
//                       String instructor, double baseFee) {

//         super(courseId, courseName, instructor, baseFee);
//     }

//     @Override
//     double calculateFee() {
//         return baseFee + 1000;
//     }
// }

// class DataScienceCourse extends Course {

//     DataScienceCourse(int courseId, String courseName,
//                       String instructor, double baseFee) {

//         super(courseId, courseName, instructor, baseFee);
//     }

//     @Override
//     double calculateFee() {
//         return baseFee + 2000;
//     }
// }

// class CloudComputingCourse extends Course {

//     CloudComputingCourse(int courseId, String courseName,
//                          String instructor, double baseFee) {

//         super(courseId, courseName, instructor, baseFee);
//     }

//     @Override
//     double calculateFee() {
//         return baseFee + 1500;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         ProgrammingCourse p = new ProgrammingCourse(
//                 101,
//                 "Java Programming",
//                 "Mr. Kumar",
//                 5000
//         );

//         DataScienceCourse d = new DataScienceCourse(
//                 102,
//                 "Data Science",
//                 "Dr. Priya",
//                 7000
//         );

//         CloudComputingCourse c = new CloudComputingCourse(
//                 103,
//                 "Cloud Computing",
//                 "Mr. Arun",
//                 6000
//         );

//         System.out.println("-------- Programming Course --------");
//         p.displayDetails();

//         System.out.println("\n-------- Data Science Course --------");
//         d.displayDetails();

//         System.out.println("\n-------- Cloud Computing Course --------");
//         c.displayDetails();
//     }
// }



//Q10


// abstract class Transport {

//     String source;
//     String destination;
//     double baseFare;

//     Transport(String source, String destination, double baseFare) {
//         this.source = source;
//         this.destination = destination;
//         this.baseFare = baseFare;
//     }

//     abstract double calculateFare();

//     void displayTicket() {

//         System.out.println("Source      : " + source);
//         System.out.println("Destination : " + destination);
//         System.out.println("Base Fare   : " + baseFare);
//         System.out.println("Final Fare  : " + calculateFare());
//     }
// }

// class Bus extends Transport {

//     Bus(String source, String destination, double baseFare) {
//         super(source, destination, baseFare);
//     }

//     @Override
//     double calculateFare() {
//         return baseFare + 50;
//     }
// }

// class Train extends Transport {

//     Train(String source, String destination, double baseFare) {
//         super(source, destination, baseFare);
//     }

//     @Override
//     double calculateFare() {
//         return baseFare + 100;
//     }
// }

// class Flight extends Transport {

//     Flight(String source, String destination, double baseFare) {
//         super(source, destination, baseFare);
//     }

//     @Override
//     double calculateFare() {
//         return baseFare + 500;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Transport t;

//         System.out.println("-------- Bus --------");
//         t = new Bus("Chennai", "Bangalore", 500);
//         t.displayTicket();

//         System.out.println("\n-------- Train --------");
//         t = new Train("Chennai", "Coimbatore", 700);
//         t.displayTicket();

//         System.out.println("\n-------- Flight --------");
//         t = new Flight("Chennai", "Delhi", 5000);
//         t.displayTicket();
//     }
// }



//Q11

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
//         System.out.println("Product ID   : " + productId);
//         System.out.println("Product Name : " + productName);
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

//         System.out.println("----- Electronics -----");
//         p = new Electronics(101, "Laptop", 50000);
//         p.displayDetails();

//         System.out.println("\n----- Clothing -----");
//         p = new Clothing(102, "Shirt", 2000);
//         p.displayDetails();

//         System.out.println("\n----- Grocery -----");
//         p = new Grocery(103, "Rice", 1000);
//         p.displayDetails();
//     }
// }


//Q12


// abstract class Ride {

//     int rideId;
//     String driverName;
//     double distance;

//     Ride(int rideId, String driverName, double distance) {
//         this.rideId = rideId;
//         this.driverName = driverName;
//         this.distance = distance;
//     }

//     abstract double calculateFare();

//     void displayDetails() {
//         System.out.println("Ride ID     : " + rideId);
//         System.out.println("Driver Name : " + driverName);
//         System.out.println("Distance    : " + distance + " km");
//         System.out.println("Fare        : Rs." + calculateFare());
//     }
// }

// class Bike extends Ride {

//     Bike(int rideId, String driverName, double distance) {
//         super(rideId, driverName, distance);
//     }

//     @Override
//     double calculateFare() {
//         return distance * 10;
//     }
// }


// class Auto extends Ride {

//     Auto(int rideId, String driverName, double distance) {
//         super(rideId, driverName, distance);
//     }

//     @Override
//     double calculateFare() {
//         return distance * 15;
//     }
// }

// class Car extends Ride {

//     Car(int rideId, String driverName, double distance) {
//         super(rideId, driverName, distance);
//     }

//     @Override
//     double calculateFare() {
//         return distance * 20;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Ride r;

//         System.out.println("----- Bike -----");
//         r = new Bike(101, "Arun", 10);
//         r.displayDetails();

//         System.out.println("\n----- Auto -----");
//         r = new Auto(102, "Kumar", 10);
//         r.displayDetails();

//         System.out.println("\n----- Car -----");
//         r = new Car(103, "Rahul", 10);
//         r.displayDetails();
//     }
// }


//Q13

// interface Payment {

//     void pay();

//     void refund();
// }

// class UPI implements Payment {

//     @Override
//     public void pay() {
//         System.out.println("Payment made using UPI");
//     }

//     @Override
//     public void refund() {
//         System.out.println("UPI payment refunded");
//     }
// }


// class CreditCard implements Payment {

//     @Override
//     public void pay() {
//         System.out.println("Payment made using Credit Card");
//     }

//     @Override
//     public void refund() {
//         System.out.println("Credit Card payment refunded");
//     }
// }


// class NetBanking implements Payment {

//     @Override
//     public void pay() {
//         System.out.println("Payment made using Net Banking");
//     }

//     @Override
//     public void refund() {
//         System.out.println("Net Banking payment refunded");
//     }
// }


// public class Main {

//     public static void main(String[] args) {

//         Payment p;

//         System.out.println("----- UPI -----");
//         p = new UPI();
//         p.pay();
//         p.refund();

//         System.out.println("\n----- Credit Card -----");
//         p = new CreditCard();
//         p.pay();
//         p.refund();

//         System.out.println("\n----- Net Banking -----");
//         p = new NetBanking();
//         p.pay();
//         p.refund();
//     }
// }




//Q14


// abstract class Student {

//     int studentId;
//     String name;
//     String department;

//     Student(int studentId, String name, String department) {
//         this.studentId = studentId;
//         this.name = name;
//         this.department = department;
//     }

//     abstract double calculateFees();

//     void displayDetails() {
//         System.out.println("Student ID  : " + studentId);
//         System.out.println("Name        : " + name);
//         System.out.println("Department  : " + department);
//         System.out.println("Fees        : Rs." + calculateFees());
//     }
// }


// interface Assignable {

//     void submitAssignment();
// }


// class RegularStudent extends Student implements Assignable {

//     RegularStudent(int studentId, String name, String department) {
//         super(studentId, name, department);
//     }

//     @Override
//     double calculateFees() {
//         return 50000;
//     }

//     @Override
//     public void submitAssignment() {
//         System.out.println("Regular student submitted assignment");
//     }
// }

// class DistanceStudent extends Student implements Assignable {

//     DistanceStudent(int studentId, String name, String department) {
//         super(studentId, name, department);
//     }

//     @Override
//     double calculateFees() {
//         return 30000;
//     }

//     @Override
//     public void submitAssignment() {
//         System.out.println("Distance student submitted assignment");
//     }
// }

// class ResearchScholar extends Student {

//     ResearchScholar(int studentId, String name, String department) {
//         super(studentId, name, department);
//     }

//     @Override
//     double calculateFees() {
//         return 20000;
//     }
// }


// public class Main {

//     public static void main(String[] args) {

//         Student s;

//         System.out.println("----- Regular Student -----");
//         s = new RegularStudent(101, "Santhosh", "CSE");
//         s.displayDetails();

//         if (s instanceof Assignable) {
//             Assignable a = (Assignable) s;
//             a.submitAssignment();
//         }

//         System.out.println("\n----- Distance Student -----");
//         s = new DistanceStudent(102, "Kumar", "IT");
//         s.displayDetails();

//         if (s instanceof Assignable) {
//             Assignable a = (Assignable) s;
//             a.submitAssignment();
//         }

//         System.out.println("\n----- Research Scholar -----");
//         s = new ResearchScholar(103, "Arun", "ECE");
//         s.displayDetails();

//         if (s instanceof Assignable) {
//             Assignable a = (Assignable) s;
//             a.submitAssignment();
//         } else {
//             System.out.println("Research Scholar does not have assignment submission");
//         }
//     }
// }




//Q15


// abstract class SmartDevice {

//     int deviceId;
//     String brand;
//     double price;

//     SmartDevice(int deviceId, String brand, double price) {
//         this.deviceId = deviceId;
//         this.brand = brand;
//         this.price = price;
//     }

//     abstract void displaySpecifications();

//     void turnOn() {
//         System.out.println("Device is turned ON");
//     }

//     void turnOff() {
//         System.out.println("Device is turned OFF");
//     }
// }


// interface Camera {

//     void takePhoto();
// }

// interface InternetEnabled {

//     void connectInternet();
// }

// interface MusicPlayer {

//     void playMusic();
// }


// class SmartPhone extends SmartDevice
//         implements Camera, InternetEnabled, MusicPlayer {

//     SmartPhone(int deviceId, String brand, double price) {
//         super(deviceId, brand, price);
//     }

//     @Override
//     void displaySpecifications() {
//         System.out.println("SmartPhone with Camera, Internet and Music Player");
//     }

//     @Override
//     public void takePhoto() {
//         System.out.println("SmartPhone is taking a photo");
//     }

//     @Override
//     public void connectInternet() {
//         System.out.println("SmartPhone connected to Internet");
//     }

//     @Override
//     public void playMusic() {
//         System.out.println("SmartPhone is playing music");
//     }
// }

// class SmartWatch extends SmartDevice
//         implements InternetEnabled {

//     SmartWatch(int deviceId, String brand, double price) {
//         super(deviceId, brand, price);
//     }

//     @Override
//     void displaySpecifications() {
//         System.out.println("SmartWatch with Internet connectivity");
//     }

//     @Override
//     public void connectInternet() {
//         System.out.println("SmartWatch connected to Internet");
//     }
// }


// class SmartTV extends SmartDevice
//         implements InternetEnabled, MusicPlayer {

//     SmartTV(int deviceId, String brand, double price) {
//         super(deviceId, brand, price);
//     }

//     @Override
//     void displaySpecifications() {
//         System.out.println("SmartTV with Internet and Music Player");
//     }

//     @Override
//     public void connectInternet() {
//         System.out.println("SmartTV connected to Internet");
//     }

//     @Override
//     public void playMusic() {
//         System.out.println("SmartTV is playing music");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         SmartDevice d;

//         System.out.println("----- SmartPhone -----");

//         d = new SmartPhone(101, "Samsung", 50000);

//         d.displaySpecifications();
//         d.turnOn();

//         if (d instanceof Camera) {
//             Camera c = (Camera) d;
//             c.takePhoto();
//         }

//         if (d instanceof InternetEnabled) {
//             InternetEnabled i = (InternetEnabled) d;
//             i.connectInternet();
//         }

//         if (d instanceof MusicPlayer) {
//             MusicPlayer m = (MusicPlayer) d;
//             m.playMusic();
//         }

//         d.turnOff();


//         System.out.println("\n----- SmartWatch -----");

//         d = new SmartWatch(102, "Apple", 30000);

//         d.displaySpecifications();
//         d.turnOn();

//         if (d instanceof InternetEnabled) {
//             InternetEnabled i = (InternetEnabled) d;
//             i.connectInternet();
//         }

//         d.turnOff();


//         System.out.println("\n----- SmartTV -----");

//         d = new SmartTV(103, "Sony", 60000);

//         d.displaySpecifications();
//         d.turnOn();

//         if (d instanceof InternetEnabled) {
//             InternetEnabled i = (InternetEnabled) d;
//             i.connectInternet();
//         }

//         if (d instanceof MusicPlayer) {
//             MusicPlayer m = (MusicPlayer) d;
//             m.playMusic();
//         }

//         d.turnOff();
//     }
// }


