package practice;

import java.util.Scanner;
import java.util.Stack;

public class ImplementQueueUsingStack{
  
	  static Stack<Integer> stack1 = new Stack<>();
	  static Stack<Integer> stack2 = new Stack<>();
  public static void main(String args[] ) throws Exception {
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  for(int i = 0; i<N;i++) {
//		  System.out.println("Stack 1 " + stack1);
//		  System.out.println("Stack 2 " + stack2);
		  int x = sc.nextInt();
		  if(x == 0) {
			  int y = sc.nextInt(); 
			  add(y);
		  }else if(x == 2) {
			    remove() ;
		  }else if(x == 1) {
			  System.out.println( front());
		  }
	  }
	   
  }
  
  
  public static void add(int data){ 
    stack1.push(data);
  }
  
  public static void remove(){ 
		   if(stack2.isEmpty()) { 
				   while(!stack1.isEmpty()) {
					   stack2.push(stack1.pop());
				   } 
			   }
		   stack2.pop();
	} 
		    
 
	 
  public static int front(){ 

	  if(stack2.isEmpty()) { 
			   while(!stack1.isEmpty()) {
				   stack2.push(stack1.pop());
			   } 
		   } 
	   return stack2.peek();
	  }
   
}
