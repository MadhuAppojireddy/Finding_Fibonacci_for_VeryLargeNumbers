/**
 * Madhu_Appojireddy
 */
package Fibonacci;
import java.lang.Math; 
import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;

/**
 * @author Madhu_Appojireddy
 *
 */

public class FindFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cont = "";
		
		do{
		    Scanner keyboard = new Scanner(System.in);
		    System.out.println("enter an integer");
		    int value = keyboard.nextInt(); 
	        System.out.println( value  + " th Fibonacci number : " + fib(value));
	    
	        System.out.println("Continue(Y/N)");
            cont = keyboard.next();

	      } while(cont.equals("y"));
	
	}
	
	static BigInteger fib(long k) {
	     
		   BigInteger answer = null;
	       boolean negative = k < 0;
	       
	       if(k == 0) answer = new BigInteger("0");
	      
	       else if(Math.abs(k) <= 2) answer = new BigInteger("1");
	      
	       else {
	          
	    	   BigInteger a = new BigInteger("1");
	           BigInteger b = new BigInteger("1");
	          
	          for(int i = 3; i <= Math.abs(k); i++) {
	                answer = a.add(b);
	                b = a;
	                a = answer;
	          }
	      }
	      return negative ? answer.multiply(new BigInteger("-1")) : answer;
	  }

}
