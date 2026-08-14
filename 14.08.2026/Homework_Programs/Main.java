//QUESTION 3 – E-COMMERCE PRODUCT CATALOG SYSTEM





// import java.util.ArrayList;
// import java.util.Iterator;


// // Interface

// interface ProductOperations {

//     double calculateDiscount();

//     double calculateFinalPrice();

//     void displayProductDetails();

// }



// // Abstract Class

// abstract class Product implements ProductOperations {


//     private int productId;
//     private String productName;
//     private double price;



//     // Constructor

//     Product(int productId, String productName,
//             double price) {

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





//     // Common final price calculation

//     public double calculateFinalPrice() {

//         return price - calculateDiscount();

//     }





//     // Common display

//     public void displayBasicDetails() {


//         System.out.println("Product ID   : " + productId);
//         System.out.println("Product Name : " + productName);
//         System.out.println("Price        : Rs." + price);


//     }


// }



// // Electronics Class

// class Electronics extends Product {


//     Electronics(int productId, String productName,
//                 double price) {

//         super(productId, productName, price);

//     }




//     @Override
//     public double calculateDiscount() {

//         return getPrice() * 10 / 100;

//     }




//     @Override
//     public void displayProductDetails() {


//         System.out.println("\n----- Electronics -----");

//         displayBasicDetails();

//         System.out.println(
//             "Discount     : Rs." + calculateDiscount()
//         );


//         System.out.println(
//             "Final Price  : Rs." + calculateFinalPrice()
//         );


//     }

// }



// // Clothing Class

// class Clothing extends Product {


//     Clothing(int productId, String productName,
//              double price) {

//         super(productId, productName, price);

//     }



//     @Override
//     public double calculateDiscount() {

//         return getPrice() * 20 / 100;

//     }




//     @Override
//     public void displayProductDetails() {


//         System.out.println("\n----- Clothing -----");

//         displayBasicDetails();


//         System.out.println(
//             "Discount     : Rs." + calculateDiscount()
//         );


//         System.out.println(
//             "Final Price  : Rs." + calculateFinalPrice()
//         );


//     }

// }





// // Grocery Class

// class Grocery extends Product {


//     Grocery(int productId, String productName,
//             double price) {

//         super(productId, productName, price);

//     }




//     @Override
//     public double calculateDiscount() {

//         return getPrice() * 5 / 100;

//     }




//     @Override
//     public void displayProductDetails() {


//         System.out.println("\n----- Grocery -----");


//         displayBasicDetails();


//         System.out.println(
//             "Discount     : Rs." + calculateDiscount()
//         );


//         System.out.println(
//             "Final Price  : Rs." + calculateFinalPrice()
//         );


//     }

// }




// // Main Class

// public class Main {



//     // Search Product

//     public static void searchProduct(
//             ArrayList<Product> products,
//             int id) {



//         for(Product product : products) {


//             if(product.getProductId() == id) {


//                 System.out.println(
//                     "\nProduct Found"
//                 );


//                 product.displayProductDetails();


//                 return;

//             }

//         }


//         System.out.println(
//             "Product not found"
//         );


//     }






//     // Remove Product

//     public static void removeProduct(
//             ArrayList<Product> products,
//             int id) {



//         Iterator<Product> iterator =
//                 products.iterator();



//         while(iterator.hasNext()) {



//             Product product =
//                     iterator.next();



//             if(product.getProductId() == id) {


//                 iterator.remove();


//                 System.out.println(
//                     "Product removed successfully"
//                 );


//                 return;

//             }

//         }



//         System.out.println(
//             "Product not found"
//         );


//     }







//     public static void main(String[] args) {



//         ArrayList<Product> products =
//                 new ArrayList<>();




//         // Adding products

//         products.add(
//             new Electronics(
//                 101,
//                 "Laptop",
//                 55000
//             )
//         );



//         products.add(
//             new Clothing(
//                 102,
//                 "Shirt",
//                 2000
//             )
//         );



//         products.add(
//             new Grocery(
//                 103,
//                 "Rice Bag",
//                 1500
//             )
//         );






//         // Display all products


//         System.out.println(
//             "========== ALL PRODUCTS =========="
//         );


//         for(Product product : products) {


//             product.displayProductDetails();


//         }





//         // Search operation


//         System.out.println(
//             "\n========== SEARCH PRODUCT =========="
//         );


//         searchProduct(products,102);






//         // Remove operation


//         System.out.println(
//             "\n========== REMOVE PRODUCT =========="
//         );


//         removeProduct(products,101);







//         // Display after removal


//         System.out.println(
//             "\n========== AFTER REMOVAL =========="
//         );


//         for(Product product : products) {


//             product.displayProductDetails();


//         }



//     }

// }





//QUESTION 4 – RIDE BOOKING MANAGEMENT SYSTEM


// import java.util.ArrayList;
// import java.util.Iterator;


// // Interface

// interface RideService {

//     double calculateFare();

//     void displayRideDetails();

// }



// // Abstract Class

// abstract class Ride implements RideService {


//     private int rideId;
//     private String passengerName;
//     private String pickupLocation;
//     private String dropLocation;
//     private double distance;




//     // Constructor

//     Ride(int rideId,
//          String passengerName,
//          String pickupLocation,
//          String dropLocation,
//          double distance) {


//         this.rideId = rideId;
//         this.passengerName = passengerName;
//         this.pickupLocation = pickupLocation;
//         this.dropLocation = dropLocation;
//         this.distance = distance;

//     }




//     // Getters


//     public int getRideId() {

//         return rideId;

//     }


//     public String getPassengerName() {

//         return passengerName;

//     }


//     public String getPickupLocation() {

//         return pickupLocation;

//     }


//     public String getDropLocation() {

//         return dropLocation;

//     }


//     public double getDistance() {

//         return distance;

//     }





//     // Common details

//     public void displayBasicDetails() {


//         System.out.println("Ride ID          : " + rideId);
//         System.out.println("Passenger Name   : " + passengerName);
//         System.out.println("Pickup Location  : " + pickupLocation);
//         System.out.println("Drop Location    : " + dropLocation);
//         System.out.println("Distance         : " + distance + " km");


//     }


// }




// // Bike Ride

// class BikeRide extends Ride {


//     BikeRide(int rideId,
//              String passengerName,
//              String pickupLocation,
//              String dropLocation,
//              double distance) {


//         super(rideId, passengerName,
//               pickupLocation,
//               dropLocation,
//               distance);

//     }



//     @Override
//     public double calculateFare() {


//         return getDistance() * 10;

//     }





//     @Override
//     public void displayRideDetails() {


//         System.out.println("\n----- Bike Ride -----");


//         displayBasicDetails();


//         System.out.println(
//             "Fare : Rs." + calculateFare()
//         );


//     }

// }




// // Car Ride

// class CarRide extends Ride {


//     CarRide(int rideId,
//             String passengerName,
//             String pickupLocation,
//             String dropLocation,
//             double distance) {


//         super(rideId, passengerName,
//               pickupLocation,
//               dropLocation,
//               distance);

//     }




//     @Override
//     public double calculateFare() {


//         return getDistance() * 20;

//     }





//     @Override
//     public void displayRideDetails() {


//         System.out.println("\n----- Car Ride -----");


//         displayBasicDetails();


//         System.out.println(
//             "Fare : Rs." + calculateFare()
//         );


//     }


// }




// // Premium Ride

// class PremiumRide extends Ride {


//     PremiumRide(int rideId,
//                 String passengerName,
//                 String pickupLocation,
//                 String dropLocation,
//                 double distance) {


//         super(rideId, passengerName,
//               pickupLocation,
//               dropLocation,
//               distance);

//     }




//     @Override
//     public double calculateFare() {


//         return getDistance() * 30;

//     }




//     @Override
//     public void displayRideDetails() {


//         System.out.println("\n----- Premium Ride -----");


//         displayBasicDetails();


//         System.out.println(
//             "Fare : Rs." + calculateFare()
//         );


//     }


// }





// // Main Class

// public class Main {



//     // Search Ride

//     public static void searchRide(
//             ArrayList<Ride> rides,
//             int id) {



//         for(Ride ride : rides) {



//             if(ride.getRideId() == id) {


//                 System.out.println(
//                     "\nRide Found"
//                 );


//                 ride.displayRideDetails();


//                 return;

//             }

//         }



//         System.out.println(
//             "Ride not found"
//         );


//     }






//     // Remove Ride

//     public static void removeRide(
//             ArrayList<Ride> rides,
//             int id) {



//         Iterator<Ride> iterator =
//                 rides.iterator();



//         while(iterator.hasNext()) {



//             Ride ride =
//                     iterator.next();



//             if(ride.getRideId() == id) {


//                 iterator.remove();


//                 System.out.println(
//                     "Ride removed successfully"
//                 );


//                 return;

//             }


//         }



//         System.out.println(
//             "Ride not found"
//         );

//     }







//     public static void main(String[] args) {



//         ArrayList<Ride> rides =
//                 new ArrayList<>();




//         // Adding rides

//         rides.add(
//             new BikeRide(
//                 101,
//                 "Arun",
//                 "Chennai",
//                 "Velachery",
//                 5
//             )
//         );



//         rides.add(
//             new CarRide(
//                 102,
//                 "Kumar",
//                 "Tambaram",
//                 "Guindy",
//                 10
//             )
//         );



//         rides.add(
//             new PremiumRide(
//                 103,
//                 "Santhosh",
//                 "Anna Nagar",
//                 "Airport",
//                 15
//             )
//         );







//         // Display all rides


//         System.out.println(
//             "========== ALL RIDES =========="
//         );


//         for(Ride ride : rides) {


//             ride.displayRideDetails();


//         }






//         // Search ride


//         System.out.println(
//             "\n========== SEARCH RIDE =========="
//         );


//         searchRide(rides,102);







//         // Remove ride


//         System.out.println(
//             "\n========== REMOVE RIDE =========="
//         );


//         removeRide(rides,101);






//         // Display after removal


//         System.out.println(
//             "\n========== AFTER REMOVAL =========="
//         );


//         for(Ride ride : rides) {


//             ride.displayRideDetails();


//         }



//     }

// }




//QUESTION 5 – ONLINE COURSE MANAGEMENT SYSTEM


// import java.util.ArrayList;
// import java.util.Iterator;


// // Interface

// interface CourseOperations {

//     double calculateFinalFee();

//     void displayCourseDetails();

// }



// // Abstract Class

// abstract class Course implements CourseOperations {


//     private int courseId;
//     private String courseName;
//     private String instructor;
//     private double baseFee;



//     // Constructor

//     Course(int courseId,
//            String courseName,
//            String instructor,
//            double baseFee) {


//         this.courseId = courseId;
//         this.courseName = courseName;
//         this.instructor = instructor;
//         this.baseFee = baseFee;

//     }




//     // Getters


//     public int getCourseId() {

//         return courseId;

//     }



//     public String getCourseName() {

//         return courseName;

//     }



//     public String getInstructor() {

//         return instructor;

//     }



//     public double getBaseFee() {

//         return baseFee;

//     }





//     // Common Details

//     public void displayBasicDetails() {


//         System.out.println("Course ID     : " + courseId);
//         System.out.println("Course Name   : " + courseName);
//         System.out.println("Instructor    : " + instructor);
//         System.out.println("Base Fee      : Rs." + baseFee);


//     }

// }




// // Programming Course

// class ProgrammingCourse extends Course {


//     ProgrammingCourse(int courseId,
//                       String courseName,
//                       String instructor,
//                       double baseFee) {


//         super(courseId,
//               courseName,
//               instructor,
//               baseFee);

//     }





//     @Override
//     public double calculateFinalFee() {


//         // 10% discount

//         return getBaseFee() - 
//                (getBaseFee() * 10 / 100);

//     }






//     @Override
//     public void displayCourseDetails() {


//         System.out.println("\n----- Programming Course -----");


//         displayBasicDetails();


//         System.out.println(
//             "Discount : 10%"
//         );


//         System.out.println(
//             "Final Fee : Rs." + calculateFinalFee()
//         );


//     }

// }





// // Data Science Course

// class DataScienceCourse extends Course {


//     DataScienceCourse(int courseId,
//                       String courseName,
//                       String instructor,
//                       double baseFee) {


//         super(courseId,
//               courseName,
//               instructor,
//               baseFee);

//     }




//     @Override
//     public double calculateFinalFee() {


//         // 15% discount

//         return getBaseFee() -
//                (getBaseFee() * 15 / 100);

//     }





//     @Override
//     public void displayCourseDetails() {


//         System.out.println("\n----- Data Science Course -----");


//         displayBasicDetails();


//         System.out.println(
//             "Discount : 15%"
//         );


//         System.out.println(
//             "Final Fee : Rs." + calculateFinalFee()
//         );


//     }


// }





// // Soft Skills Course

// class SoftSkillsCourse extends Course {


//     SoftSkillsCourse(int courseId,
//                      String courseName,
//                      String instructor,
//                      double baseFee) {


//         super(courseId,
//               courseName,
//               instructor,
//               baseFee);

//     }




//     @Override
//     public double calculateFinalFee() {


//         // 5% discount

//         return getBaseFee() -
//                (getBaseFee() * 5 / 100);

//     }





//     @Override
//     public void displayCourseDetails() {


//         System.out.println("\n----- Soft Skills Course -----");


//         displayBasicDetails();


//         System.out.println(
//             "Discount : 5%"
//         );


//         System.out.println(
//             "Final Fee : Rs." + calculateFinalFee()
//         );


//     }

// }







// // Main Class

// public class Main {



//     // Search Course

//     public static void searchCourse(
//             ArrayList<Course> courses,
//             int id) {



//         for(Course course : courses) {



//             if(course.getCourseId() == id) {



//                 System.out.println(
//                     "\nCourse Found"
//                 );


//                 course.displayCourseDetails();


//                 return;

//             }


//         }



//         System.out.println(
//             "Course not found"
//         );


//     }







//     // Remove Course

//     public static void removeCourse(
//             ArrayList<Course> courses,
//             int id) {



//         Iterator<Course> iterator =
//                 courses.iterator();




//         while(iterator.hasNext()) {



//             Course course =
//                     iterator.next();




//             if(course.getCourseId() == id) {



//                 iterator.remove();



//                 System.out.println(
//                     "Course removed successfully"
//                 );


//                 return;

//             }


//         }



//         System.out.println(
//             "Course not found"
//         );

//     }







//     public static void main(String[] args) {



//         ArrayList<Course> courses =
//                 new ArrayList<>();





//         // Adding courses


//         courses.add(
//             new ProgrammingCourse(
//                 101,
//                 "Java Programming",
//                 "Mr. Arun",
//                 5000
//             )
//         );




//         courses.add(
//             new DataScienceCourse(
//                 102,
//                 "Data Science",
//                 "Ms. Priya",
//                 8000
//             )
//         );




//         courses.add(
//             new SoftSkillsCourse(
//                 103,
//                 "Communication Skills",
//                 "Mr. Kumar",
//                 3000
//             )
//         );







//         // Display all courses


//         System.out.println(
//             "========== ALL COURSES =========="
//         );



//         for(Course course : courses) {


//             course.displayCourseDetails();


//         }






//         // Search Course


//         System.out.println(
//             "\n========== SEARCH COURSE =========="
//         );


//         searchCourse(courses,102);







//         // Remove Course


//         System.out.println(
//             "\n========== REMOVE COURSE =========="
//         );


//         removeCourse(courses,101);






//         // Display after removal


//         System.out.println(
//             "\n========== AFTER REMOVAL =========="
//         );



//         for(Course course : courses) {


//             course.displayCourseDetails();


//         }


//     }

// }


