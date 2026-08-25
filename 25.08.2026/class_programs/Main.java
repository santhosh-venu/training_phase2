// import java.util.*;
// public class Main
// {
    
// 	public static void main(String[] args) 
// 	{
// 	     Queue queue = new ArrayDeque();
// 	    queue.add(10);
// 	    queue.offer(20);
// 	    queue.offer(30);
// 	    queue.offer(40);
	    
// 	    System.out.println(queue);
// 	    System.out.println(queue.poll());
// 	    System.out.println(queue);
// 	}
// }



// import java.util.*;
// public class Main
// {
    
// 	public static void main(String[] args) 
// 	{
// 	     Queue queue = new PriorityQueue();
	     
// 	     queue.offer(30);
// 	     queue.offer(10);
// 	     queue.offer(20);
// 	     queue.offer(5);
// 	     System.out.println(queue);
	     
// 	     System.out.println(queue.poll());
// 	     System.out.println(queue.poll());
// 	     System.out.println(queue.poll());
// 	     System.out.println("------------------MaxHeap-------------");
// 	     Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	     
// 	     maxHeap.offer(30);
// 	     maxHeap.offer(10);
// 	     maxHeap.offer(20);
// 	     maxHeap.offer(5);
	     
// 	     System.out.println(maxHeap);
	     
// 	     System.out.println(maxHeap.poll());
// 	     System.out.println(maxHeap.poll());
// 	     System.out.println(maxHeap.poll());
//          System.out.println(maxHeap.poll());
	    
// 	}
// }




// import java.util.*;
// public class Main
// {
//     public static List<String> generateBinarayNumber(int n)
//     {
//         List<String> result = new ArrayList<>();
// 	    Queue<String> queue = new LinkedList<>();
// 	    queue.offer("1");
// 	    for(int i=0;i<n;i++)
// 	    {
// 	        String binary=queue.poll();
// 	        result.add(binary);// 10
	        
// 	        queue.offer(binary+"0");// 10
// 	        queue.offer(binary+"1");// 11
// 	    }
	    
// 	    return result;
//     }
    
    
// 	public static void main(String[] args) 
// 	{
	    
// 	    System.out.println(generateBinarayNumber(5));
	    
	    
	     
	    
// 	}
// }