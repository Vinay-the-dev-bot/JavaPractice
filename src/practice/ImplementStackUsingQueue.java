package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ImplementStackUsingQueue{
  
	 static Queue<Integer> queue1 = new LinkedList<>();
	 static Queue<Integer> queue2 = new LinkedList<>();
  public static void main(String args[] ) throws Exception {
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  for(int i = 0; i<N;i++) { 
//		  System.out.println("queue1 : " + queue1);
//		  System.out.println("queue2 : " + queue2);
		  int x = sc.nextInt();
		  if(x == 0) {
			  int y = sc.nextInt(); 
			  add(y);
		  }else if(x == 2) {
			  System.out.println(  remove());
		  }else if(x == 1) {
			  System.out.println( top());
		  }
	  }
	   
  }
  
  
  public static void add(int data){ 
	  queue2.add(data);
	  System.out.println("queue1 : " + queue1);
	  System.out.println("queue2 : " + queue2);
	  while(!queue1.isEmpty()) {
		  queue2.add(queue1.remove());
	  }
	  
	  Queue<Integer> temp = queue1;
	  queue1 = queue2;
	  queue2 = temp;
	  
  }
  
  public static int remove(){ 
		return queue1.remove(); 
	} 
		    
 
	 
  public static int top(){   
	   return queue1.peek();
	  }
   
}
