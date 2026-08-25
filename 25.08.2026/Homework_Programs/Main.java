// import java.util.*;

// class Customer {
//     int token;
//     String name;
//     String service;
//     int age;
//     boolean vip;

//     Customer(int token, String name, String service, int age, boolean vip) {
//         this.token = token;
//         this.name = name;
//         this.service = service;
//         this.age = age;
//         this.vip = vip;
//     }

//     public String toString() {
//         String displayName = vip ? "VIP-" + name : name;
//         return "[Token#" + token + " | " + displayName + "]";
//     }
// }

// public class Main {

//     static Queue<Customer> deposit = new LinkedList<>();
//     static Queue<Customer> withdrawal = new LinkedList<>();
//     static Queue<Customer> loan = new LinkedList<>();

//     static int token = 1001;
//     static int totalServed = 0;
//     static int emergency = 0;
//     static int vipServed = 0;

//     static int depositServed = 0;
//     static int withdrawalServed = 0;
//     static int loanServed = 0;

//     static ArrayList<String> servedCustomers = new ArrayList<>();

//     static Queue<Customer> getQueue(String service) {
//         if (service.equalsIgnoreCase("deposit"))
//             return deposit;

//         if (service.equalsIgnoreCase("withdrawal"))
//             return withdrawal;

//         if (service.equalsIgnoreCase("loan"))
//             return loan;

//         return null;
//     }

//     static void addCustomer(Scanner sc, boolean vip) {

//         System.out.print("Enter customer name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter service type (deposit/withdrawal/loan): ");
//         String service = sc.nextLine().toLowerCase();

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         sc.nextLine();

//         Queue<Customer> queue = getQueue(service);

//         if (queue == null) {
//             System.out.println("Invalid service type!");
//             return;
//         }

//         Customer c = new Customer(token++, name, service, age, vip);

//         if (vip) {
//             addAtFront(queue, c);

//             System.out.println("VIP " + name + " added to front of "
//                     + service.toUpperCase() + " queue. Token: " + c.token);

//         } else if (age >= 60) {
//             addAtFront(queue, c);

//             System.out.println("Senior Citizen " + name + " added to front of "
//                     + service.toUpperCase() + " queue. Token: " + c.token);

//         } else {
//             queue.add(c);

//             System.out.println(name + " added to "
//                     + service.toUpperCase() + " queue. Token: " + c.token);
//         }
//     }

//     static void addAtFront(Queue<Customer> queue, Customer c) {
//         LinkedList<Customer> list = (LinkedList<Customer>) queue;
//         list.addFirst(c);
//     }

//     static void serveCustomer(Scanner sc) {

//         System.out.print("Enter service type to serve (deposit/withdrawal/loan): ");
//         String service = sc.nextLine().toLowerCase();

//         Queue<Customer> queue = getQueue(service);

//         if (queue == null) {
//             System.out.println("Invalid service type!");
//             return;
//         }

//         if (queue.isEmpty()) {
//             System.out.println("No customers waiting in "
//                     + service + " queue.");
//             return;
//         }

//         Customer c = queue.poll();

//         totalServed++;
//         servedCustomers.add(c.name);

//         if (c.vip)
//             vipServed++;

//         if (service.equals("deposit"))
//             depositServed++;
//         else if (service.equals("withdrawal"))
//             withdrawalServed++;
//         else
//             loanServed++;

//         System.out.println("Serving Customer:");
//         System.out.println("  Token: " + c.token);
//         System.out.println("  Name: " + c.name);
//         System.out.println("  Service: " + c.service);
//         System.out.println("  Remaining in queue: "
//                 + queue.size() + " customers");
//     }

//     static void emergencyService(Scanner sc) {

//         System.out.print("Enter customer name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter service type: ");
//         String service = sc.nextLine().toLowerCase();

//         if (getQueue(service) == null) {
//             System.out.println("Invalid service type!");
//             return;
//         }

//         emergency++;
//         totalServed++;
//         servedCustomers.add(name);

//         if (service.equals("deposit"))
//             depositServed++;
//         else if (service.equals("withdrawal"))
//             withdrawalServed++;
//         else
//             loanServed++;

//         System.out.println("EMERGENCY SERVICE for " + name
//                 + " (" + service + ")");
//         System.out.println("  Serving immediately!");
//     }

//     static void displayStatus() {

//         System.out.println("\n=== BANK QUEUE STATUS ===");

//         displayQueue("DEPOSIT", deposit);
//         displayQueue("WITHDRAWAL", withdrawal);
//         displayQueue("LOAN", loan);

//         int totalWaiting = deposit.size()
//                 + withdrawal.size()
//                 + loan.size();

//         System.out.println("Total Customers Waiting: "
//                 + totalWaiting);

//         System.out.println("Next Token Number: " + token);
//     }

//     static void displayQueue(String name, Queue<Customer> queue) {

//         System.out.print(name + " Queue (" + queue.size() + "): ");

//         if (queue.isEmpty()) {
//             System.out.println("Empty");
//             return;
//         }

//         for (Customer c : queue)
//             System.out.print(c + " ");

//         System.out.println();
//     }

//     static void showStatistics() {

//         int depositWaiting = deposit.size();
//         int withdrawalWaiting = withdrawal.size();
//         int loanWaiting = loan.size();

//         int totalWaiting = depositWaiting
//                 + withdrawalWaiting
//                 + loanWaiting;

//         System.out.println("\n=== BANK STATISTICS ===");

//         System.out.println("Total Customers Served: "
//                 + totalServed);

//         if (!servedCustomers.isEmpty()) {

//             System.out.print("Served Customers: ");

//             for (int i = 0; i < servedCustomers.size(); i++) {

//                 System.out.print(servedCustomers.get(i));

//                 if (i < servedCustomers.size() - 1)
//                     System.out.print(", ");
//             }

//             System.out.println();
//         }

//         System.out.println("Emergency Services: " + emergency);
//         System.out.println("VIP Services: " + vipServed);

//         System.out.println("Total Customers Waiting: "
//                 + totalWaiting);

//         System.out.println("Service Distribution:");

//         System.out.println("  Deposit: "
//                 + depositServed + " served, "
//                 + depositWaiting + " waiting");

//         System.out.println("  Withdrawal: "
//                 + withdrawalServed + " served, "
//                 + withdrawalWaiting + " waiting");

//         System.out.println("  Loan: "
//                 + loanServed + " served, "
//                 + loanWaiting + " waiting");
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println(
//             "=== WELCOME TO Maari Amman NATIONAL BANK ==="
//         );

//         while (true) {

//             System.out.println("\nSelect an option:");
//             System.out.println("1. Add Customer");
//             System.out.println("2. Serve Customer");
//             System.out.println("3. Display Status");
//             System.out.println("4. Add VIP Customer");
//             System.out.println("5. Emergency Service");
//             System.out.println("6. Show Statistics");
//             System.out.println("7. Exit");

//             System.out.print("\nEnter your choice: ");
//             int choice = sc.nextInt();
//             sc.nextLine();

//             switch (choice) {

//                 case 1:
//                     addCustomer(sc, false);
//                     break;

//                 case 2:
//                     serveCustomer(sc);
//                     break;

//                 case 3:
//                     displayStatus();
//                     break;

//                 case 4:
//                     addCustomer(sc, true);
//                     break;

//                 case 5:
//                     emergencyService(sc);
//                     break;

//                 case 6:
//                     showStatistics();
//                     break;

//                 case 7:
//                     System.out.println(
//                         "Thank you for using Maari Amman National Bank Token System!"
//                     );
//                     sc.close();
//                     return;

//                 default:
//                     System.out.println("Invalid choice!");
//             }
//         }
//     }
// }