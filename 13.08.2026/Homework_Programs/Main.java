//Q3


// abstract class Employee {

//     private int employeeId;
//     private String employeeName;
//     private double basicSalary;

//     // Constructor
//     Employee(int employeeId, String employeeName,
//              double basicSalary) {

//         if (basicSalary <= 0) {
//             throw new IllegalArgumentException(
//                 "Salary must be greater than zero."
//             );
//         }

//         this.employeeId = employeeId;
//         this.employeeName = employeeName;
//         this.basicSalary = basicSalary;
//     }

//     // Getters
//     public int getEmployeeId() {
//         return employeeId;
//     }

//     public String getEmployeeName() {
//         return employeeName;
//     }

//     public double getBasicSalary() {
//         return basicSalary;
//     }

//     // Abstract method
//     public abstract double calculateSalary();

//     // Calculate allowance
//     public double calculateAllowance() {
//         return calculateSalary() - basicSalary;
//     }

//     // Display details
//     public void displayDetails() {

//         System.out.println("Employee ID   : " + employeeId);
//         System.out.println("Employee Name : " + employeeName);
//         System.out.println("Basic Salary  : Rs." + basicSalary);
//         System.out.println("Allowance     : Rs." + calculateAllowance());
//         System.out.println("Final Salary  : Rs." + calculateSalary());
//     }
// }


// // Full-Time Employee
// class FullTimeEmployee extends Employee {

//     FullTimeEmployee(int employeeId, String employeeName,
//                      double basicSalary) {

//         super(employeeId, employeeName, basicSalary);
//     }

//     @Override
//     public double calculateSalary() {
//         return getBasicSalary()
//                 + (getBasicSalary() * 20 / 100);
//     }
// }


// // Part-Time Employee
// class PartTimeEmployee extends Employee {

//     PartTimeEmployee(int employeeId, String employeeName,
//                      double basicSalary) {

//         super(employeeId, employeeName, basicSalary);
//     }

//     @Override
//     public double calculateSalary() {
//         return getBasicSalary()
//                 + (getBasicSalary() * 10 / 100);
//     }
// }


// // Contract Employee
// class ContractEmployee extends Employee {

//     ContractEmployee(int employeeId, String employeeName,
//                      double basicSalary) {

//         super(employeeId, employeeName, basicSalary);
//     }

//     @Override
//     public double calculateSalary() {
//         return getBasicSalary()
//                 + (getBasicSalary() * 5 / 100);
//     }
// }


// // Main class
// public class Main {

//     public static void main(String[] args) {

//         Employee employee;

//         try {

//             System.out.println("========== FULL-TIME EMPLOYEE ==========");

//             employee = new FullTimeEmployee(
//                     101,
//                     "Santhosh",
//                     50000
//             );

//             employee.displayDetails();


//             System.out.println("\n========== PART-TIME EMPLOYEE ==========");

//             employee = new PartTimeEmployee(
//                     102,
//                     "Kumar",
//                     30000
//             );

//             employee.displayDetails();


//             System.out.println("\n========== CONTRACT EMPLOYEE ==========");

//             employee = new ContractEmployee(
//                     103,
//                     "Arun",
//                     40000
//             );

//             employee.displayDetails();


//             System.out.println("\n========== INVALID SALARY TEST ==========");

//             employee = new FullTimeEmployee(
//                     104,
//                     "Rahul",
//                     -10000
//             );

//         } catch (IllegalArgumentException e) {

//             System.out.println("Payroll processing failed: "
//                     + e.getMessage());

//         } finally {

//             System.out.println("Payroll processing completed.");
//         }
//     }
// }



//Q4


// abstract class Patient {

//     private int patientId;
//     private String patientName;
//     private int age;
//     private double consultationFee;

//     // Constructor
//     Patient(int patientId, String patientName,
//             int age, double consultationFee) {

//         if (age <= 0) {
//             throw new IllegalArgumentException(
//                 "Age must be greater than zero."
//             );
//         }

//         if (consultationFee <= 0) {
//             throw new IllegalArgumentException(
//                 "Consultation fee must be greater than zero."
//             );
//         }

//         this.patientId = patientId;
//         this.patientName = patientName;
//         this.age = age;
//         this.consultationFee = consultationFee;
//     }

//     // Getters
//     public int getPatientId() {
//         return patientId;
//     }

//     public String getPatientName() {
//         return patientName;
//     }

//     public int getAge() {
//         return age;
//     }

//     public double getConsultationFee() {
//         return consultationFee;
//     }

//     // Abstract method
//     public abstract double calculateBill();

//     // Display details
//     public void displayDetails() {

//         System.out.println("Patient ID         : " + patientId);
//         System.out.println("Patient Name       : " + patientName);
//         System.out.println("Age                : " + age);
//         System.out.println("Consultation Fee   : Rs." + consultationFee);
//         System.out.println("Final Bill         : Rs." + calculateBill());
//     }
// }


// // General Patient
// class GeneralPatient extends Patient {

//     GeneralPatient(int patientId, String patientName,
//                    int age, double consultationFee) {

//         super(patientId, patientName, age, consultationFee);
//     }

//     @Override
//     public double calculateBill() {
//         return getConsultationFee();
//     }
// }


// // Emergency Patient
// class EmergencyPatient extends Patient {

//     EmergencyPatient(int patientId, String patientName,
//                      int age, double consultationFee) {

//         super(patientId, patientName, age, consultationFee);
//     }

//     @Override
//     public double calculateBill() {
//         return getConsultationFee()
//                 + (getConsultationFee() * 30 / 100);
//     }
// }


// // Insurance Patient
// class InsurancePatient extends Patient {

//     InsurancePatient(int patientId, String patientName,
//                      int age, double consultationFee) {

//         super(patientId, patientName, age, consultationFee);
//     }

//     @Override
//     public double calculateBill() {
//         return getConsultationFee()
//                 - (getConsultationFee() * 20 / 100);
//     }
// }


// // Main class
// public class Main {

//     public static void main(String[] args) {

//         Patient patient;

//         try {

//             System.out.println("========== GENERAL PATIENT ==========");

//             patient = new GeneralPatient(
//                     101,
//                     "Santhosh",
//                     20,
//                     500
//             );

//             patient.displayDetails();


//             System.out.println("\n========== EMERGENCY PATIENT ==========");

//             patient = new EmergencyPatient(
//                     102,
//                     "Kumar",
//                     35,
//                     1000
//             );

//             patient.displayDetails();


//             System.out.println("\n========== INSURANCE PATIENT ==========");

//             patient = new InsurancePatient(
//                     103,
//                     "Arun",
//                     45,
//                     2000
//             );

//             patient.displayDetails();


//             System.out.println("\n========== INVALID PATIENT TEST ==========");

//             patient = new GeneralPatient(
//                     104,
//                     "Rahul",
//                     -5,
//                     500
//             );

//         } catch (IllegalArgumentException e) {

//             System.out.println("Patient processing failed: "
//                     + e.getMessage());

//         } finally {

//             System.out.println("Patient billing process completed.");
//         }
//     }
// }



//Q5


// abstract class FoodOrder {

//     private int orderId;
//     private String customerName;
//     private String foodName;
//     private double price;
//     private int quantity;

//     // Constructor
//     FoodOrder(int orderId, String customerName,
//               String foodName, double price, int quantity) {

//         if (price <= 0) {
//             throw new IllegalArgumentException(
//                 "Food price must be greater than zero."
//             );
//         }

//         if (quantity <= 0) {
//             throw new IllegalArgumentException(
//                 "Quantity must be greater than zero."
//             );
//         }

//         this.orderId = orderId;
//         this.customerName = customerName;
//         this.foodName = foodName;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     // Getters
//     public int getOrderId() {
//         return orderId;
//     }

//     public String getCustomerName() {
//         return customerName;
//     }

//     public String getFoodName() {
//         return foodName;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

//     // Calculate food cost
//     public double calculateFoodCost() {
//         return price * quantity;
//     }

//     // Abstract method
//     public abstract double calculateFinalBill();

//     // Calculate delivery charge
//     public abstract double calculateDeliveryCharge();

//     // Display order details
//     public void displayDetails() {

//         System.out.println("Order ID          : " + orderId);
//         System.out.println("Customer Name     : " + customerName);
//         System.out.println("Food Name         : " + foodName);
//         System.out.println("Price             : Rs." + price);
//         System.out.println("Quantity          : " + quantity);
//         System.out.println("Food Cost         : Rs." + calculateFoodCost());
//         System.out.println("Delivery Charge   : Rs." + calculateDeliveryCharge());
//         System.out.println("Final Bill        : Rs." + calculateFinalBill());
//     }
// }


// // Restaurant Order
// class RestaurantOrder extends FoodOrder {

//     RestaurantOrder(int orderId, String customerName,
//                     String foodName, double price, int quantity) {

//         super(orderId, customerName, foodName, price, quantity);
//     }

//     @Override
//     public double calculateDeliveryCharge() {
//         return 50;
//     }

//     @Override
//     public double calculateFinalBill() {
//         return calculateFoodCost() + calculateDeliveryCharge();
//     }
// }


// // Fast Food Order
// class FastFoodOrder extends FoodOrder {

//     FastFoodOrder(int orderId, String customerName,
//                   String foodName, double price, int quantity) {

//         super(orderId, customerName, foodName, price, quantity);
//     }

//     @Override
//     public double calculateDeliveryCharge() {
//         return 30;
//     }

//     @Override
//     public double calculateFinalBill() {
//         return calculateFoodCost() + calculateDeliveryCharge();
//     }
// }


// // Premium Order
// class PremiumOrder extends FoodOrder {

//     PremiumOrder(int orderId, String customerName,
//                  String foodName, double price, int quantity) {

//         super(orderId, customerName, foodName, price, quantity);
//     }

//     @Override
//     public double calculateDeliveryCharge() {
//         return 0;
//     }

//     @Override
//     public double calculateFinalBill() {
//         return calculateFoodCost() + calculateDeliveryCharge();
//     }
// }


// // Main class
// public class Main {

//     public static void main(String[] args) {

//         FoodOrder order;


//         // Restaurant Order
//         try {

//             System.out.println("========== RESTAURANT ORDER ==========");

//             order = new RestaurantOrder(
//                     101,
//                     "Santhosh",
//                     "Biryani",
//                     250,
//                     2
//             );

//             order.displayDetails();

//         } catch (IllegalArgumentException e) {

//             System.out.println("Order failed: " + e.getMessage());

//         } finally {

//             System.out.println("Food order processing completed.");
//         }


//         // Fast Food Order
//         try {

//             System.out.println("\n========== FAST FOOD ORDER ==========");

//             order = new FastFoodOrder(
//                     102,
//                     "Kumar",
//                     "Burger",
//                     150,
//                     3
//             );

//             order.displayDetails();

//         } catch (IllegalArgumentException e) {

//             System.out.println("Order failed: " + e.getMessage());

//         } finally {

//             System.out.println("Food order processing completed.");
//         }


//         // Premium Order
//         try {

//             System.out.println("\n========== PREMIUM ORDER ==========");

//             order = new PremiumOrder(
//                     103,
//                     "Arun",
//                     "Pizza",
//                     500,
//                     2
//             );

//             order.displayDetails();

//         } catch (IllegalArgumentException e) {

//             System.out.println("Order failed: " + e.getMessage());

//         } finally {

//             System.out.println("Food order processing completed.");
//         }


//         // Invalid Order
//         try {

//             System.out.println("\n========== INVALID ORDER ==========");

//             order = new RestaurantOrder(
//                     104,
//                     "Rahul",
//                     "Burger",
//                     -100,
//                     2
//             );

//             order.displayDetails();

//         } catch (IllegalArgumentException e) {

//             System.out.println("Order failed: " + e.getMessage());

//         } finally {

//             System.out.println("Food order processing completed.");
//         }
//     }
// }
