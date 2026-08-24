// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Stack<String>  stack = new Stack<>();
	    
// 	    stack.push("Web1");
// 	    stack.push("Web2");
// 	    stack.push("Web3");
	    
// 	    for(String s:stack)
// 	    System.out.println(s);
	   
// 	   //Iterator s = stack.iterator();
// 	   //while(s.hasNext())
// 	   //{
// 	   //    System.out.print(stack.pop()+" ");
// 	   //}
// 	    System.out.println(stack.peek());
	    
// 		System.out.println("\n"+stack);
// 	}
// }






// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Stack<String> stack = new Stack<>();

//         System.out.print("Enter number of websites: ");
//         int n = sc.nextInt();
//         sc.nextLine();

//         for (int i = 1; i <= n; i++) {
//             System.out.print("Enter website " + i + ": ");
//             stack.push(sc.nextLine());
//         }

//         System.out.println("\nWebsites in stack:");
//         for (String s : stack)
//             System.out.println(s);

//         System.out.println("\nTop website: " + stack.peek());

//         System.out.println("\nStack: " + stack);
//     }
// }




// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Stack<String>  stack = new Stack<>();
// 	    Scanner sc = new Scanner(System.in);
// 	    System.out.println(" Stack Basic Operations");
// 	    while(true)
// 	    {
// 	        System.out.println("1. push");
// 	        System.out.println("2. pop");
// 	        System.out.println("3. peek");
// 	        System.out.println("4. search");
// 	        System.out.println("5. Display");
// 	        System.out.println("6. size");
// 	        System.out.println("7. Exit");
	        
// 	        int  choice = sc.nextInt();
// 	        sc.nextLine(); // \n
// 	        switch(choice)
// 	        {
// 	            case 1 : 
// 	                String element = sc.nextLine();
//                     stack.push(element);
// 	                System.out.println(stack);
// 	                break;
	                
// 	           case 2:
// 	               if(stack.isEmpty())
// 	               System.out.println("Stack is empty");
// 	               else{
// 	               String pop = stack.pop();
// 	               System.out.println("Poped : "+pop);
// 	               System.out.println(stack);
// 	               }
// 	               break;
// 	           case 3:
// 	               if(stack.isEmpty())
// 	               System.out.println("Stack is empty");
// 	               else{
// 	               String peek = stack.peek();
// 	               System.out.println("Top value is : "+peek);
// 	               System.out.println(stack);
// 	               }
// 	           case 4:
// 	               if(stack.isEmpty())
// 	               System.out.println("Stack is empty");
// 	               else{
// 	               String str = sc.nextLine();
// 	               int pos=stack.search(str);
// 	               if(pos == -1)
// 	               System.out.println(str + " is not found in stack");
// 	               else
// 	               System.out.println("Value "+str + " is found in stack pos "+ pos );
// 	               }
// 	               break;
// 	           case 5:
// 	               System.out.println("Stack : " + stack);
// 	               if(!stack.isEmpty())
// 	               {
// 	                   System.out.println("Top : "+stack.peek());
// 	                   System.out.println("Size : "+stack.size());
// 	               }
// 				   break;
// 	           case 6:
// 				   if(!stack.isEmpty())
// 	               {
// 	                   System.out.println("Size : "+stack.size());
// 	               }
// 				   break;

	               
// 	           case 7:
// 	               System.out.println("Stack : " + stack);
// 	               return;
	               
// 	           default :
// 	           System.out.println("Enter the value between 1 - 7");
// 	        }
	        
// 	    }
// 	}
// }







// import java.util.*;
// public class stackques {
//     public static void main(String[] args) {
//         ArrayList<String> stack = new ArrayList<>();
//         Stack<String> stack1 = new Stack<>();
//         StringBuilder sb = new StringBuilder();
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         sc.nextLine();
//         for(int i=0;i<size;i++)
//         {
//             System.out.println("Enter the setence");
//             String name = sc.nextLine();
//             stack.add(name);
//         }
//         for(String s:stack)
//         {
//             stack1.push(s);
//         }
//         System.out.println("Stack : "+stack1);
//         while(!stack1.isEmpty())
//         {
//             sb.append(stack1.pop());
//             sb.append(" ");
//         }
//         System.out.println("Reversed : "+sb.toString());
//     }
// }



// import java.util.*;
// public class Main
// {
//     private static int precedence(char c)
//     {
//         switch(c)
//         {
//             case '+' : case '-': return 1;
//             case '*' : case '/': return 2;
//             case '^' : return 3;
//         }
//         return -1;  
//     }
//     private static boolean isOpertor(char c)
//     {
//         return c=='+' || c=='-' || c=='*' ||c=='/' || c== '^';
//     }
//     public static String infixToPostfix(String exp)
//     {
//         StringBuilder result = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         for(char c:exp.toCharArray()) // A+B*C [A,+,B,*,C]
//         {
//             if(Character.isLetterOrDigit(c))
//             {
//                 result.append(c);
//                 System.out.println(result);
//             }
//             else if(c == '(')
//             {
//                 stack.push(c);
//                 System.out.println(result);  
//             }
//             else if(c == ')')
//             {
//                 while(!stack.isEmpty() && stack.peek() != '(')
//                 {
//                     result.append(stack.pop());
//                 }
//                 stack.pop();
//                 System.out.println("Result : "+result);
//                 System.out.println("Stack : "+stack);
//             }
//             else if(isOpertor(c))
//             {
//                 while(!stack.isEmpty() && precedence(c) < precedence(stack.peek()))
//                 {
//                     result.append(stack.pop());
//                 }
//                 stack.push(c);
//             }   
//         }
//         while (!stack.isEmpty())
//         {
//             result.append(stack.pop());
//         }
//         return result.toString();
//     }
// 	public static void main(String[] args) 
// 	{
// 	      String exp = "A+B*C";
// 	      String str = infixToPostfix(exp);
// 	      System.out.println(str);
// 	}
// }




// import java.util.*;
// public class Main
// {
//     private static int precedence(char c)
//     {
//         switch(c)
//         {
//             case '+' : case '-': return 1;
//             case '*' : case '/': return 2;
//             case '^' : return 3;
//         }
//         return -1;
        
//     }
//     private static boolean isOpertor(char c)
//     {
//         return c=='+' || c=='-' || c=='*' ||c=='/' || c== '^';
//     }
//     public static String infixToPostfix(String exp)
//     {
//         StringBuilder result = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         for(char c:exp.toCharArray()) // A+B*C [A,+,B,*,C]
//         {
//             if(Character.isLetterOrDigit(c))
//             {
//                 result.append(c);
//                 System.out.println(result);
//             }
//             else if(c == '(')
//             {
//                 stack.push(c);
//                 System.out.println(result);
                
//             }
//             else if(c == ')')
//             {
//                 while(!stack.isEmpty() && stack.peek() != '(')
//                 {
//                     result.append(stack.pop());
//                 }
//                 stack.pop();
//                 System.out.println("Result : "+result);
//                 System.out.println("Stack : "+stack);
//             }
//             else if(isOpertor(c))
//             {
//                 while(!stack.isEmpty() && precedence(c) < precedence(stack.peek()))
//                 {
//                     result.append(stack.pop());
//                 }
//                 stack.push(c);
//             }
            
//         }
        
//         while (!stack.isEmpty())
//         {
//             result.append(stack.pop());
//         }
//         return result.toString();
//     }
//     public static int evaluvatePostfix(String num)
//     {
//         Stack<Integer> stack =new Stack<>();
//         System.out.println("Post Fix Evaluation");
//          for(char c:num.toCharArray()) 
//         {
//             if(Character.isDigit(c))
//             {
//                 stack.push(c-'0');
//             }
//             else{
//                 int b = stack.pop();
//                 int a = stack.pop();
//                 int result = 0;
                
//                 switch(c)
//                 {
//                     case '+' : result = a+b; break;
//                     case '-' : result = a-b; break;
//                     case '*' : result = a*b; break;
//                     case '/' : result = a/b; break;
//                 }
//                 stack.push(result);
//             }
            
//         }
//         return stack.pop();
        
//     }
// 	public static void main(String[] args) 
// 	{
// 	       String exp = "A+B*C";
// 	      String str = infixToPostfix(exp);
// 	      System.out.println(str);
	       
// 	       String num = "23+5*"; //->(2+3)*5 -> 25
// 	      int numStr = evaluvatePostfix(num);
// 	      System.out.println("Post Fix Evaluation is : "+ numStr);
	       
	        
	    
// 	}
// }




// import java.util.*;

// public class stackques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder result = new StringBuilder();

//         System.out.println("Enter a sentence:");
//         String sentence = sc.nextLine();

//         for (String word : sentence.split(" ")) {
//             Stack<Character> stack = new Stack<>();

//             for (char c : word.toCharArray())
//                 stack.push(c);

//             while (!stack.isEmpty())
//                 result.append(stack.pop());

//             result.append(" ");
//         }

//         System.out.println("Output: " + result);
//     }
// }