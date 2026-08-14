//COLLECTIONS



//1

// import java.util.*;
// public class rotateList
// {
// 	public static void main(String[] args) {
	    
// 		List<Integer> num = new ArrayList<>();
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the size of the list : ");
// 		int n = sc.nextInt();
		
// 		System.out.println("Enter the elements of the list : ");
// 		for(int i=0;i<n;i++)
// 		{
// 			num.add(sc.nextInt());
// 		}
// 		System.out.println("Enter the number of positions to rotate : ");
// 		int k = sc.nextInt();
// 		for(int i=0;i<k;i++)
// 		{
// 		    int last = num.remove(num.size()-1);
// 		    num.add(0,last);
// 		}
// 		System.out.println("Rotated list : "+ num);
		
// 	}
// }




//2
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
	    
// 		List<String> name = new LinkedList<>();
// 		name.add("Vasanth");
// 		name.add("Priyan");
// 		name.add("Aaghash");
// 		name.add("Prathap");
// 		System.out.println(name);
// 		System.out.println(name.get(0));
// 		System.out.println(name.set(1,"vijay"));
// 		System.out.println(name);
// 		System.out.println(name.remove(2));
// 		System.out.println(name);
// 		System.out.println(name.size());
// 		System.out.println(name.contains("Prathap"));
// 	}
// }




//3

// public class Main
// {
// 	public static void main(String[] args) {
	    
// 		System.out.println("Start");
// 		String str = new String("Vasanth");
// 		str = null;
// 		System.gc();
// 		System.exit(1);
// 		System.out.println("End");
// 	}
// }



//4
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
	    
// 		List<Integer> num = new ArrayList<>();
// 		num.add(10);
// 		num.add(20);
// 		num.add(30);
// 		num.add(40);
// 		num.add(50);
// 		int k=2;
// 		for(int i=0;i<k;i++)
// 		{
// 		    int last = num.remove(num.size()-1);
// 		    num.add(0,last);
// 		}
// 		System.out.println("Rotated list : "+ num);
		
// 	}
// }




//QUESTION 1 – ONLINE FOOD DELIVERY MANAGEMENT SYSTEM


// import java.util.ArrayList;
// import java.util.Iterator;


// // Interface
// interface FoodOrderService {

//     double calculateFoodCost();

//     double calculateDeliveryCharge();

//     double calculateFinalBill();

//     void displayOrderDetails();
// }


// // Abstract Parent Class
// abstract class FoodOrder implements FoodOrderService {

//     private int orderId;
//     private String customerName;
//     private String foodName;
//     private double price;
//     private int quantity;


//     // Constructor
//     FoodOrder(int orderId, String customerName,
//               String foodName, double price, int quantity) {

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



//     // Food Cost
//     @Override
//     public double calculateFoodCost() {

//         return price * quantity;
//     }



//     // Display common details
//     public void displayBasicDetails() {

//         System.out.println("Order ID       : " + orderId);
//         System.out.println("Customer Name  : " + customerName);
//         System.out.println("Food Name      : " + foodName);
//         System.out.println("Quantity       : " + quantity);
//         System.out.println("Food Cost      : Rs." + calculateFoodCost());
//     }
// }



// // Regular Order
// class RegularOrder extends FoodOrder {


//     RegularOrder(int orderId, String customerName,
//                   String foodName, double price, int quantity) {

//         super(orderId, customerName, foodName, price, quantity);
//     }


//     @Override
//     public double calculateDeliveryCharge() {

//         return 40;
//     }


//     @Override
//     public double calculateFinalBill() {

//         return calculateFoodCost() + calculateDeliveryCharge();
//     }


//     @Override
//     public void displayOrderDetails() {

//         System.out.println("\n----- Regular Order -----");

//         displayBasicDetails();

//         System.out.println("Delivery Charge: Rs."
//                 + calculateDeliveryCharge());

//         System.out.println("Final Bill     : Rs."
//                 + calculateFinalBill());
//     }
// }



// // Express Order
// class ExpressOrder extends FoodOrder {


//     ExpressOrder(int orderId, String customerName,
//                   String foodName, double price, int quantity) {

//         super(orderId, customerName, foodName, price, quantity);
//     }


//     @Override
//     public double calculateDeliveryCharge() {

//         return 80;
//     }


//     @Override
//     public double calculateFinalBill() {

//         return calculateFoodCost() + calculateDeliveryCharge();
//     }


//     @Override
//     public void displayOrderDetails() {

//         System.out.println("\n----- Express Order -----");

//         displayBasicDetails();

//         System.out.println("Delivery Charge: Rs."
//                 + calculateDeliveryCharge());

//         System.out.println("Final Bill     : Rs."
//                 + calculateFinalBill());
//     }
// }



// // Premium Order
// class PremiumOrder extends FoodOrder {


//     PremiumOrder(int orderId, String customerName,
//                   String foodName, double price, int quantity) {

//         super(orderId, customerName, foodName, price, quantity);
//     }


//     @Override
//     public double calculateDeliveryCharge() {

//         return 0;
//     }


//     @Override
//     public double calculateFinalBill() {

//         return calculateFoodCost();
//     }


//     @Override
//     public void displayOrderDetails() {

//         System.out.println("\n----- Premium Order -----");

//         displayBasicDetails();

//         System.out.println("Delivery Charge: Rs."
//                 + calculateDeliveryCharge());

//         System.out.println("Final Bill     : Rs."
//                 + calculateFinalBill());
//     }
// }




// // Main Class
// public class Main {


//     // Search operation
//     public static void searchOrder(ArrayList<FoodOrder> orders,
//                                    int id) {


//         for(FoodOrder order : orders) {

//             if(order.getOrderId() == id) {

//                 System.out.println("\nOrder Found");

//                 order.displayOrderDetails();

//                 return;
//             }
//         }


//         System.out.println("\nOrder ID not found");
//     }




//     // Remove operation
//     public static void removeOrder(ArrayList<FoodOrder> orders,
//                                    int id) {


//         Iterator<FoodOrder> iterator = orders.iterator();


//         while(iterator.hasNext()) {

//             FoodOrder order = iterator.next();


//             if(order.getOrderId() == id) {

//                 iterator.remove();

//                 System.out.println(
//                     "Order removed successfully"
//                 );

//                 return;
//             }
//         }


//         System.out.println("Order not found");
//     }




//     public static void main(String[] args) {


//         ArrayList<FoodOrder> orders =
//                 new ArrayList<>();



//         // Adding different objects
//         orders.add(
//             new RegularOrder(
//                 101,
//                 "Arun",
//                 "Biryani",
//                 250,
//                 2
//             )
//         );



//         orders.add(
//             new ExpressOrder(
//                 102,
//                 "Kumar",
//                 "Pizza",
//                 400,
//                 1
//             )
//         );



//         orders.add(
//             new PremiumOrder(
//                 103,
//                 "Santhosh",
//                 "Burger",
//                 200,
//                 3
//             )
//         );



//         // Display all orders
//         System.out.println(
//             "========== ALL ORDERS =========="
//         );


//         for(FoodOrder order : orders) {

//             order.displayOrderDetails();

//         }



//         // Search order

//         System.out.println(
//             "\n========== SEARCH ORDER =========="
//         );


//         searchOrder(orders,102);



//         // Remove order

//         System.out.println(
//             "\n========== REMOVE ORDER =========="
//         );


//         removeOrder(orders,101);



//         // Display after removal

//         System.out.println(
//             "\n========== AFTER REMOVAL =========="
//         );


//         for(FoodOrder order : orders) {

//             order.displayOrderDetails();

//         }


//     }
// }



//QUESTION 2 – HOSPITAL STAFF MANAGEMENT SYSTEM


// import java.util.ArrayList;
// import java.util.Iterator;


// // Interface
// interface StaffOperations {

//     void performDuty();

//     void displayStaffDetails();
// }



// // Abstract Class
// abstract class HospitalStaff implements StaffOperations {

//     private int staffId;
//     private String staffName;
//     private String department;



//     // Constructor
//     HospitalStaff(int staffId, String staffName,
//                   String department) {

//         this.staffId = staffId;
//         this.staffName = staffName;
//         this.department = department;
//     }



//     // Getters

//     public int getStaffId() {
//         return staffId;
//     }


//     public String getStaffName() {
//         return staffName;
//     }


//     public String getDepartment() {
//         return department;
//     }



//     // Common display method

//     public void displayBasicDetails() {

//         System.out.println("Staff ID     : " + staffId);
//         System.out.println("Staff Name   : " + staffName);
//         System.out.println("Department  : " + department);

//     }

// }




// // Doctor Class

// class Doctor extends HospitalStaff {


//     Doctor(int staffId, String staffName,
//            String department) {

//         super(staffId, staffName, department);

//     }



//     @Override
//     public void performDuty() {

//         System.out.println(
//             "Duty : Treating patients and performing surgeries"
//         );

//     }



//     @Override
//     public void displayStaffDetails() {

//         System.out.println("\n----- Doctor -----");

//         displayBasicDetails();

//         performDuty();

//     }

// }




// // Nurse Class

// class Nurse extends HospitalStaff {


//     Nurse(int staffId, String staffName,
//           String department) {

//         super(staffId, staffName, department);

//     }



//     @Override
//     public void performDuty() {

//         System.out.println(
//             "Duty : Patient care and assisting doctors"
//         );

//     }



//     @Override
//     public void displayStaffDetails() {

//         System.out.println("\n----- Nurse -----");

//         displayBasicDetails();

//         performDuty();

//     }

// }




// // Lab Technician Class

// class LabTechnician extends HospitalStaff {


//     LabTechnician(int staffId, String staffName,
//                   String department) {

//         super(staffId, staffName, department);

//     }



//     @Override
//     public void performDuty() {

//         System.out.println(
//             "Duty : Performing laboratory tests"
//         );

//     }



//     @Override
//     public void displayStaffDetails() {

//         System.out.println("\n----- Lab Technician -----");

//         displayBasicDetails();

//         performDuty();

//     }

// }




// // Main Class

// public class Main {



//     // Search Staff

//     public static void searchStaff(
//             ArrayList<HospitalStaff> staffList,
//             int id) {


//         for(HospitalStaff staff : staffList) {


//             if(staff.getStaffId() == id) {


//                 System.out.println(
//                     "\nStaff Found"
//                 );


//                 staff.displayStaffDetails();

//                 return;

//             }

//         }


//         System.out.println(
//             "Staff ID not found"
//         );

//     }





//     // Remove Staff

//     public static void removeStaff(
//             ArrayList<HospitalStaff> staffList,
//             int id) {


//         Iterator<HospitalStaff> iterator =
//                 staffList.iterator();



//         while(iterator.hasNext()) {


//             HospitalStaff staff =
//                     iterator.next();



//             if(staff.getStaffId() == id) {


//                 iterator.remove();


//                 System.out.println(
//                     "Staff removed successfully"
//                 );


//                 return;

//             }

//         }



//         System.out.println(
//             "Staff not found"
//         );

//     }






//     public static void main(String[] args) {


//         ArrayList<HospitalStaff> staffList =
//                 new ArrayList<>();



//         // Adding staff objects

//         staffList.add(
//             new Doctor(
//                 101,
//                 "Dr Arun",
//                 "Cardiology"
//             )
//         );



//         staffList.add(
//             new Nurse(
//                 102,
//                 "Priya",
//                 "Emergency"
//             )
//         );



//         staffList.add(
//             new LabTechnician(
//                 103,
//                 "Kumar",
//                 "Pathology"
//             )
//         );




//         // Display all staff

//         System.out.println(
//             "========== ALL STAFF DETAILS =========="
//         );


//         for(HospitalStaff staff : staffList) {

//             staff.displayStaffDetails();

//         }





//         // Search operation

//         System.out.println(
//             "\n========== SEARCH STAFF =========="
//         );


//         searchStaff(staffList,102);





//         // Remove operation

//         System.out.println(
//             "\n========== REMOVE STAFF =========="
//         );


//         removeStaff(staffList,101);






//         // Display after removal

//         System.out.println(
//             "\n========== AFTER REMOVAL =========="
//         );


//         for(HospitalStaff staff : staffList) {

//             staff.displayStaffDetails();

//         }


//     }
// }


