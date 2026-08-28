// import java.util.*;
// class Mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             // System.out.println("Thread : "+Thread.currentThread().getName() +" - "+i);
//             System.out.println("Thread : "+i);
//         }
//     }
// }
// public class Main 
// {
    
// 	public static void main(String[] args) 
// 	{
// 	    Mythread t1 = new Mythread();
// 	    Mythread t2 = new Mythread();
	    
// 	   // t1.setName("Thread-A");
// 	   // t2.setName("Thread-B");
	    
// 	    t1.start();
// 	    t2.start();
	   
// 	}
// }



// import java.util.*;
// class Mythread implements Runnable
// {
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             // System.out.println("Thread : "+Thread.currentThread().getName() +" - "+i);
//             System.out.println("Runnable : "+i);
//         }
//     }
// }
// public class Main 
// {
    
// 	public static void main(String[] args) 
// 	{
// 	    Mythread runnable  = new Mythread();
// 	    Thread t1 = new Thread(runnable);
// 	    Thread t2 = new Thread(runnable);
	    
// 	   // t1.setName("Thread-A");
// 	   // t2.setName("Thread-B");
	    
// 	    t1.start();
// 	    t2.start();
	   
// 	}
// }





// // Lifecycle Demo
// class MyTask implements Runnable {
//     @Override
//     public void run() {
//         try {
//             System.out.println("Thread state: " + Thread.currentThread().getState());

//             Thread.sleep(1000);

//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) throws InterruptedException {

//         MyTask task = new MyTask();

//         Thread t = new Thread(task);

//         // NEW state
//         System.out.println("After creation: " + t.getState());

//         // RUNNABLE state
//         t.start();
//         System.out.println("After start(): " + t.getState());

//         // TIMED_WAITING state
//         Thread.sleep(500);
//         System.out.println("During sleep: " + t.getState());

//         // TERMINATED state
//         t.join();
//         System.out.println("After completion: " + t.getState());
//     }
// }



// class Counter
// {
//     int count;
//     synchronized void increment() // thread safe
//     {
//         count++;
//     }
// }
// class Task implements Runnable
// {
//     Counter counter;
//     Task(Counter counter)
//     {
//         this.counter=counter;
//     }
    
//     public void run()
//     {
//         for(int i=0;i<1000;i++)
//         {
//             counter.increment();
//         }
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) throws InterruptedException
// 	{
// 		Counter counter = new Counter();
// 		Task task1 = new Task(counter);
// 		Task task2 = new Task(counter);
// 		Thread t1 = new Thread(task1);
// 		Thread t2 = new Thread(task2);
		
// 		t1.start();
// 		t2.start();
		
// 		t1.join();
// 		t2.join();
		
// 		System.out.println("Final Count : "+counter.count);
// 	}
// }



